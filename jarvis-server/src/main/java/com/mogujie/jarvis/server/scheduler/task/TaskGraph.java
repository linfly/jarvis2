/*
 * 蘑菇街 Inc.
 * Copyright (c) 2010-2015 All Rights Reserved.
 *
 * Author: guangming
 * Create Date: 2015年11月30日 下午3:43:27
 */

package com.mogujie.jarvis.server.scheduler.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph.CycleFoundException;
import org.jgrapht.graph.DefaultEdge;

/**
 * @author guangming
 *
 */
public enum TaskGraph {
    INSTANCE;

    private Map<Long, DAGTask> readyTable = new ConcurrentHashMap<>();
    private DirectedAcyclicGraph<DAGTask, DefaultEdge> dag = new DirectedAcyclicGraph<DAGTask, DefaultEdge>(DefaultEdge.class);

    public Map<Long, DAGTask> getReadyTable() {
        return readyTable;
    }

    public DAGTask getTask(long taskId) {
        return readyTable.get(taskId);
    }

    public void clear() {
        readyTable.clear();
        Set<DAGTask> allTasks = dag.vertexSet();
        if (allTasks != null) {
            List<DAGTask> tmpTasks = new ArrayList<DAGTask>();
            tmpTasks.addAll(dag.vertexSet());
            dag.removeAllVertices(tmpTasks);
        }
    }

    public void addTask(long taskId, DAGTask dagTask) {
        if (!readyTable.containsKey(taskId)) {
            readyTable.put(taskId, dagTask);
            dag.addVertex(dagTask);
        }
    }

    public void removeTask(long taskId) {
        DAGTask dagTask = readyTable.get(taskId);
        if (dagTask != null) {
            readyTable.remove(taskId);
            dag.removeVertex(dagTask);
        }
    }

    public void addDependency(long parentId, long childId) {
        DAGTask parent = readyTable.get(parentId);
        DAGTask child = readyTable.get(childId);
        if (parent != null && child != null) {
            try {
                dag.addDagEdge(parent, child);
            } catch (CycleFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<DAGTask> getParents(long taskId) {
        List<DAGTask> parents = new ArrayList<DAGTask>();
        DAGTask dagTask = readyTable.get(taskId);
        if (dagTask != null) {
            Set<DefaultEdge> inEdges = dag.incomingEdgesOf(dagTask);
            if (inEdges != null) {
                for (DefaultEdge edge : inEdges) {
                    parents.add(dag.getEdgeSource(edge));
                }
            }
        }
        return parents;
    }

    public List<DAGTask> getChildren(long taskId) {
        List<DAGTask> children = new ArrayList<DAGTask>();
        DAGTask dagTask = readyTable.get(taskId);
        if (dagTask != null) {
            Set<DefaultEdge> inEdges = dag.outgoingEdgesOf(dagTask);
            if (inEdges != null) {
                for (DefaultEdge edge : inEdges) {
                    children.add(dag.getEdgeTarget(edge));
                }
            }
        }
        return children;
    }
}