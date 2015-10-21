package com.mogujie.jarvis.dto;

import java.io.Serializable;
import java.util.Date;

public class JobDependStatus extends JobDependStatusKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_depend_status.preTaskStatus
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Integer preTaskStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_depend_status.createTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_depend_status.updateTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_depend_status
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_depend_status.preTaskStatus
     *
     * @return the value of job_depend_status.preTaskStatus
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Integer getPreTaskStatus() {
        return preTaskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_depend_status.preTaskStatus
     *
     * @param preTaskStatus the value for job_depend_status.preTaskStatus
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setPreTaskStatus(Integer preTaskStatus) {
        this.preTaskStatus = preTaskStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_depend_status.createTime
     *
     * @return the value of job_depend_status.createTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_depend_status.createTime
     *
     * @param createTime the value for job_depend_status.createTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_depend_status.updateTime
     *
     * @return the value of job_depend_status.updateTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_depend_status.updateTime
     *
     * @param updateTime the value for job_depend_status.updateTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}