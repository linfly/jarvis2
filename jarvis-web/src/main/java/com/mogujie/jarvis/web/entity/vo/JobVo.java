package com.mogujie.jarvis.web.entity.vo;

import com.mogujie.jarvis.dto.generate.Job;

/**
 * Created by hejian on 15/9/17.
 */
public class JobVo extends Job {
    private String jobStatus;
    private String jobPriority;
    private String appName;
    private String appKey;
    private String createTimeStr;
    private String updateTimeStr;
    private String activeStartDateStr;
    private String activeEndDateStr;

    private Integer expressionType;
    private String expression;
    private String workerGroupName;

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(String jobPriority) {
        this.jobPriority = jobPriority;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getUpdateTimeStr() {
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public String getActiveStartDateStr() {
        return activeStartDateStr;
    }

    public void setActiveStartDateStr(String activeStartDateStr) {
        this.activeStartDateStr = activeStartDateStr;
    }

    public String getActiveEndDateStr() {
        return activeEndDateStr;
    }

    public void setActiveEndDateStr(String activeEndDateStr) {
        this.activeEndDateStr = activeEndDateStr;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Integer getExpressionType() {
        return expressionType;
    }

    public void setExpressionType(Integer expressionType) {
        this.expressionType = expressionType;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getWorkerGroupName() {
        return workerGroupName;
    }

    public void setWorkerGroupName(String workerGroupName) {
        this.workerGroupName = workerGroupName;
    }
}
