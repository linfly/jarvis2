package com.mogujie.jarvis.web.entity.vo;

import com.mogujie.jarvis.dto.generate.WorkerGroup;

/**
 * Created by hejian on 15/9/28.
 */
public class WorkerGroupVo extends WorkerGroup {
    private String createTimeStr;
    private String updateTimeStr;
    private String statusStr;

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

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }
}
