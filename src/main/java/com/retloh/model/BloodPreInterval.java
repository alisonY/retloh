package com.retloh.model;

import java.util.Date;

public class BloodPreInterval {
    private String id;

    private String infoId;

    private Integer count;

    private Date startDate;

    private Date dayStartTime;

    private Integer dayInterval;

    private Date nightStartTime;

    private Integer nightInterval;

    private Integer totalCount;

    private Integer errorCount;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
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

    public Integer getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
    }

    public Date getNightStartTime() {
        return nightStartTime;
    }

    public void setNightStartTime(Date nightStartTime) {
        this.nightStartTime = nightStartTime;
    }

    public Integer getNightInterval() {
        return nightInterval;
    }

    public void setNightInterval(Integer nightInterval) {
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