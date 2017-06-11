package com.retloh.model;

import java.util.Date;

public class BloodPreData {
    private String id;

    private String patientId;

    private Integer count;

    private Integer systole;

    private Integer diastole;

    private Integer hr;

    private Integer dataNo;

    private Date caijiDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

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

    public Integer getSystole() {
        return systole;
    }

    public void setSystole(Integer systole) {
        this.systole = systole;
    }

    public Integer getDiastole() {
        return diastole;
    }

    public void setDiastole(Integer diastole) {
        this.diastole = diastole;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getDataNo() {
        return dataNo;
    }

    public void setDataNo(Integer dataNo) {
        this.dataNo = dataNo;
    }

    public Date getCaijiDate() {
        return caijiDate;
    }

    public void setCaijiDate(Date caijiDate) {
        this.caijiDate = caijiDate;
    }
}