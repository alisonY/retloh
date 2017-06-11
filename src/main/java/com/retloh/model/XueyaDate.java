package com.retloh.model;

import java.util.Date;

public class XueyaDate {
    private String patientId;

    private Integer count;

    private Date startDate;

    private Date dayStartTime;

    private Date dayInterval;

    private Date nightStartTime;

    private Date nightInterval;

    private Integer totalCount;

    private Integer errorCount;

    private String remark;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDayStartTime() {
        return dayStartTime;
    }

    public void setDayStartTime(Date dayStartTime) {
        this.dayStartTime = dayStartTime;
    }

    public Date getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Date dayInterval) {
        this.dayInterval = dayInterval;
    }

    public Date getNightStartTime() {
        return nightStartTime;
    }

    public void setNightStartTime(Date nightStartTime) {
        this.nightStartTime = nightStartTime;
    }

    public Date getNightInterval() {
        return nightInterval;
    }

    public void setNightInterval(Date nightInterval) {
        this.nightInterval = nightInterval;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}