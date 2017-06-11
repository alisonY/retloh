package com.retloh.model;

import java.util.Date;

public class XueyaInfo {
    private String patientId;

    private String surName;

    private String firstName;

    private Date birthday;

    private Integer weight;

    private Integer height;

    private String sex;

    private String bedNo;

    private String boomNo;

    private String sectionOffice;

    private String doctorName;

    private String code;

    private String telephpne;

    private String address;

    private String country;

    private String idCard;

    private String socialNum;

    private String reserve1;

    private String reserve2;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName == null ? null : surName.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getBoomNo() {
        return boomNo;
    }

    public void setBoomNo(String boomNo) {
        this.boomNo = boomNo == null ? null : boomNo.trim();
    }

    public String getSectionOffice() {
        return sectionOffice;
    }

    public void setSectionOffice(String sectionOffice) {
        this.sectionOffice = sectionOffice == null ? null : sectionOffice.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTelephpne() {
        return telephpne;
    }

    public void setTelephpne(String telephpne) {
        this.telephpne = telephpne == null ? null : telephpne.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getSocialNum() {
        return socialNum;
    }

    public void setSocialNum(String socialNum) {
        this.socialNum = socialNum == null ? null : socialNum.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }
}