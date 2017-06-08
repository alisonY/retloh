package com.retloh.model;

public class Statistics {
    private String id;

    private String userId;

    private String dataId;

    private Boolean dataType;

    private Boolean action;

    private Boolean operationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }

    public Boolean getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Boolean operationTime) {
        this.operationTime = operationTime;
    }
}