package com.mogujie.jarvis.dto;

import java.io.Serializable;

public class JobDependKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_depend.jobId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Long jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_depend.preJobId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private Long preJobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_depend
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_depend.jobId
     *
     * @return the value of job_depend.jobId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_depend.jobId
     *
     * @param jobId the value for job_depend.jobId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_depend.preJobId
     *
     * @return the value of job_depend.preJobId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public Long getPreJobId() {
        return preJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_depend.preJobId
     *
     * @param preJobId the value for job_depend.preJobId
     *
     * @mbggenerated Wed Oct 21 10:28:52 CST 2015
     */
    public void setPreJobId(Long preJobId) {
        this.preJobId = preJobId;
    }
}