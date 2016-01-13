package com.mogujie.jarvis.server.actor;

import com.google.inject.Injector;
import com.mogujie.jarvis.dao.generate.WorkerGroupMapper;
import com.mogujie.jarvis.dao.generate.WorkerMapper;
import com.mogujie.jarvis.dto.generate.Worker;
import com.mogujie.jarvis.dto.generate.WorkerExample;
import com.mogujie.jarvis.dto.generate.WorkerGroup;
import com.mogujie.jarvis.server.WorkerRegistry;
import com.mogujie.jarvis.server.guice.Injectors;
import com.mogujie.jarvis.server.service.WorkerGroupService;
import com.mogujie.jarvis.server.service.WorkerService;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Location www.mogujie.com
 * Created by qinghuo on 16/1/13.
 * used by jarvis-parent
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Injectors.class, WorkerRegistryActor.class,
        WorkerModifyStatusActor.class,
        WorkerGroupActor.class})
@SuppressStaticInitializationFor("com.mogujie.jarvis.server.guice.Injectors")
public class TestWorkerServiceBase {

    protected static WorkerService workerService = new WorkerService();
    protected static WorkerGroupService workerGroupService = new WorkerGroupService();
    protected static WorkerRegistry workerRegistry = new WorkerRegistry();
    protected static WorkerMapper workerMapper;
    protected static WorkerGroupMapper workerGroupMapper;
    protected static WorkerGroup workerGroup = new WorkerGroup();
    protected static Worker worker = new Worker();
    protected static List<Worker> workers = new ArrayList<Worker>();
    protected static List<WorkerGroup> workerGroups = new ArrayList<WorkerGroup>();
    protected static WorkerExample example;
    protected static List<Integer> resultList = new ArrayList<Integer>();
    protected static Injector injector;

    @Before
    public  void setup() {
        injector = mock(Injector.class);
        workerGroupMapper = mock(WorkerGroupMapper.class);
        workerMapper = mock(WorkerMapper.class);

        mockStatic(Injectors.class);
        when(Injectors.getInjector()).thenReturn(injector);
        when(injector.getInstance(WorkerService.class)).thenReturn(workerService);

        when(injector.getInstance(WorkerGroupService.class)).thenReturn(workerGroupService);
        when(injector.getInstance(WorkerRegistry.class)).thenReturn(workerRegistry);
        when(workerGroupMapper.insertSelective(workerGroup)).thenReturn(0);
        when(workerGroupMapper.insert(workerGroup)).thenReturn(1);
        when(workerMapper.insertSelective(worker)).thenReturn(0);
        workerService.setWorkerMapper(workerMapper);
        workerGroupService.setWorkerGroupMapper(workerGroupMapper);
    }
}