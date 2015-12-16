package com.mogujie.jarvis.web.controller.jarvis;

import com.mogujie.jarvis.core.util.JsonHelper;
import com.mogujie.jarvis.web.auth.annotation.JarvisPassport;
import com.mogujie.jarvis.web.auth.conf.JarvisAuthType;
import com.mogujie.jarvis.web.entity.vo.JobVo;
import com.mogujie.jarvis.web.entity.vo.TaskQo;
import com.mogujie.jarvis.web.entity.vo.TaskVo;
import com.mogujie.jarvis.web.service.JobService;
import com.mogujie.jarvis.web.service.TaskService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by hejian on 15/9/14.
 */
@Controller
@RequestMapping("/task")
public class TaskController extends BaseController {

    @Autowired
    JobService jobService;
    @Autowired
    TaskService taskService;

    Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping
    @JarvisPassport(authTypes = JarvisAuthType.task)
    public String index(ModelMap modelMap) {
        List<String> executeUsers = taskService.getAllExecuteUser();

        modelMap.put("executeUsers", executeUsers);
        return "task/index";
    }

    @RequestMapping(value = "detail")
    @JarvisPassport(authTypes = JarvisAuthType.task, isMenu = false)
    public String dependency(ModelMap modelMap, Long taskId) {
        TaskVo taskVo = taskService.getTaskById(taskId);
        Long jobId = taskVo.getJobId();
        JobVo jobVo = jobService.getJobById(jobId);

        TaskQo taskQo = new TaskQo();
        taskQo.setJobId(jobId);
        taskQo.setStatus(4);
        taskQo.setOrderField("executeEndTime");
        taskQo.setOrder("DESC");
        taskQo.setOffset(0);
        taskQo.setLimit(30);

        Map<String, Object> result = taskService.getTasks(taskQo);
        logger.info("result:" + result);
        List<TaskVo> taskVoList = (List<TaskVo>) result.get("rows");

        try {

            Collections.reverse(taskVoList);

            Long avgTime = 0l;
            Long totalTime = 0l;
            for (TaskVo taskVo1 : taskVoList) {
                if (taskVo1.getExecuteTime() == null) {
                    continue;
                }
                totalTime += taskVo1.getExecuteTime();
            }
            avgTime = totalTime / taskVoList.size();
            taskVo.setAvgExecuteTime(avgTime);

        } catch (Exception e) {
            e.printStackTrace();
        }


        modelMap.put("taskVo", taskVo);
        modelMap.put("jobVo", jobVo);
        modelMap.put("taskVoList", JsonHelper.toJson(taskVoList));

        return "task/detail";
    }
}
