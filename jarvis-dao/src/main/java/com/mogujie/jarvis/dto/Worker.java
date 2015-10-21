package com.mogujie.jarvis.dto;

import java.io.Serializable;
import java.util.Date;

public class Worker implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.id
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.workerGroupId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Integer workerGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.ip
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.port
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Integer port;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.status
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.createTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.updateTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table worker
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.id
     *
     * @return the value of worker.id
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.id
     *
     * @param id the value for worker.id
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.workerGroupId
     *
     * @return the value of worker.workerGroupId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Integer getWorkerGroupId() {
        return workerGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.workerGroupId
     *
     * @param workerGroupId the value for worker.workerGroupId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setWorkerGroupId(Integer workerGroupId) {
        this.workerGroupId = workerGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.ip
     *
     * @return the value of worker.ip
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.ip
     *
     * @param ip the value for worker.ip
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.port
     *
     * @return the value of worker.port
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.port
     *
     * @param port the value for worker.port
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.status
     *
     * @return the value of worker.status
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.status
     *
     * @param status the value for worker.status
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.createTime
     *
     * @return the value of worker.createTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.createTime
     *
     * @param createTime the value for worker.createTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker.updateTime
     *
     * @return the value of worker.updateTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker.updateTime
     *
     * @param updateTime the value for worker.updateTime
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}