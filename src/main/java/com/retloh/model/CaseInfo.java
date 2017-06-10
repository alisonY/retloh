package com.retloh.model;

import java.util.Date;

public class CaseInfo {
    private String id;

    private String serialNumber;

    private String name;

    private String citizenNumber;

    private Integer age;

    private String sex;

    private String clinicNumber;

    private String bedNumber;

    private Integer recordYear;

    private Integer recordMounth;

    private Integer recordDay;

    private Integer recordMinutes;

    private String operationDoctor;

    private String diagnosticDoctor;

    private Integer status;

    private String department;

    private String hospitalNumber;

    private String hospitalName;

    private String defaultHospitalName;

    private String hospitalAddress;

    private String hospitalPhonenum;

    private String hospitalFax;

    private Integer patientYear;

    private Integer patientMonth;

    private Integer patientDay;

    private Integer daolianshu;

    private Integer sumHours;

    private String pacemakerParameter;

    private Integer offset;

    private String suggest;

    private String conclusion;

    private String yongyaoshuoming;

    private String note;

    private String caseTag;

    private Date holterLoadDate;

    private Date createTime;

    private Date updateTime;

    private String handwrittenConclusion;

    private String pdfexportFilepath;

    private String originalFilepath;

    private String analyzedFilepath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCitizenNumber() {
        return citizenNumber;
    }

    public void setCitizenNumber(String citizenNumber) {
        this.citizenNumber = citizenNumber == null ? null : citizenNumber.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber == null ? null : clinicNumber.trim();
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber == null ? null : bedNumber.trim();
    }

    public Integer getRecordYear() {
        return recordYear;
    }

    public void setRecordYear(Integer recordYear) {
        this.recordYear = recordYear;
    }

    public Integer getRecordMounth() {
        return recordMounth;
    }

    public void setRecordMounth(Integer recordMounth) {
        this.recordMounth = recordMounth;
    }

    public Integer getRecordDay() {
        return recordDay;
    }

    public void setRecordDay(Integer recordDay) {
        this.recordDay = recordDay;
    }

    public Integer getRecordMinutes() {
        return recordMinutes;
    }

    public void setRecordMinutes(Integer recordMinutes) {
        this.recordMinutes = recordMinutes;
    }

    public String getOperationDoctor() {
        return operationDoctor;
    }

    public void setOperationDoctor(String operationDoctor) {
        this.operationDoctor = operationDoctor == null ? null : operationDoctor.trim();
    }

    public String getDiagnosticDoctor() {
        return diagnosticDoctor;
    }

    public void setDiagnosticDoctor(String diagnosticDoctor) {
        this.diagnosticDoctor = diagnosticDoctor == null ? null : diagnosticDoctor.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber == null ? null : hospitalNumber.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getDefaultHospitalName() {
        return defaultHospitalName;
    }

    public void setDefaultHospitalName(String defaultHospitalName) {
        this.defaultHospitalName = defaultHospitalName == null ? null : defaultHospitalName.trim();
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress == null ? null : hospitalAddress.trim();
    }

    public String getHospitalPhonenum() {
        return hospitalPhonenum;
    }

    public void setHospitalPhonenum(String hospitalPhonenum) {
        this.hospitalPhonenum = hospitalPhonenum == null ? null : hospitalPhonenum.trim();
    }

    public String getHospitalFax() {
        return hospitalFax;
    }

    public void setHospitalFax(String hospitalFax) {
        this.hospitalFax = hospitalFax == null ? null : hospitalFax.trim();
    }

    public Integer getPatientYear() {
        return patientYear;
    }

    public void setPatientYear(Integer patientYear) {
        this.patientYear = patientYear;
    }

    public Integer getPatientMonth() {
        return patientMonth;
    }

    public void setPatientMonth(Integer patientMonth) {
        this.patientMonth = patientMonth;
    }

    public Integer getPatientDay() {
        return patientDay;
    }

    public void setPatientDay(Integer patientDay) {
        this.patientDay = patientDay;
    }

    public Integer getDaolianshu() {
        return daolianshu;
    }

    public void setDaolianshu(Integer daolianshu) {
        this.daolianshu = daolianshu;
    }

    public Integer getSumHours() {
        return sumHours;
    }

    public void setSumHours(Integer sumHours) {
        this.sumHours = sumHours;
    }

    public String getPacemakerParameter() {
        return pacemakerParameter;
    }

    public void setPacemakerParameter(String pacemakerParameter) {
        this.pacemakerParameter = pacemakerParameter == null ? null : pacemakerParameter.trim();
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    public String getYongyaoshuoming() {
        return yongyaoshuoming;
    }

    public void setYongyaoshuoming(String yongyaoshuoming) {
        this.yongyaoshuoming = yongyaoshuoming == null ? null : yongyaoshuoming.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getCaseTag() {
        return caseTag;
    }

    public void setCaseTag(String caseTag) {
        this.caseTag = caseTag == null ? null : caseTag.trim();
    }

    public Date getHolterLoadDate() {
        return holterLoadDate;
    }

    public void setHolterLoadDate(Date holterLoadDate) {
        this.holterLoadDate = holterLoadDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHandwrittenConclusion() {
        return handwrittenConclusion;
    }

    public void setHandwrittenConclusion(String handwrittenConclusion) {
        this.handwrittenConclusion = handwrittenConclusion == null ? null : handwrittenConclusion.trim();
    }

    public String getPdfexportFilepath() {
        return pdfexportFilepath;
    }

    public void setPdfexportFilepath(String pdfexportFilepath) {
        this.pdfexportFilepath = pdfexportFilepath == null ? null : pdfexportFilepath.trim();
    }

    public String getOriginalFilepath() {
        return originalFilepath;
    }

    public void setOriginalFilepath(String originalFilepath) {
        this.originalFilepath = originalFilepath == null ? null : originalFilepath.trim();
    }

    public String getAnalyzedFilepath() {
        return analyzedFilepath;
    }

    public void setAnalyzedFilepath(String analyzedFilepath) {
        this.analyzedFilepath = analyzedFilepath == null ? null : analyzedFilepath.trim();
    }
}