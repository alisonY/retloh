package com.retloh.model;

import java.util.ArrayList;
import java.util.List;

public class FtpUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FtpUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryIsNull() {
            addCriterion("homeDirectory is null");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryIsNotNull() {
            addCriterion("homeDirectory is not null");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryEqualTo(String value) {
            addCriterion("homeDirectory =", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryNotEqualTo(String value) {
            addCriterion("homeDirectory <>", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryGreaterThan(String value) {
            addCriterion("homeDirectory >", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryGreaterThanOrEqualTo(String value) {
            addCriterion("homeDirectory >=", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryLessThan(String value) {
            addCriterion("homeDirectory <", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryLessThanOrEqualTo(String value) {
            addCriterion("homeDirectory <=", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryLike(String value) {
            addCriterion("homeDirectory like", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryNotLike(String value) {
            addCriterion("homeDirectory not like", value, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryIn(List<String> values) {
            addCriterion("homeDirectory in", values, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryNotIn(List<String> values) {
            addCriterion("homeDirectory not in", values, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryBetween(String value1, String value2) {
            addCriterion("homeDirectory between", value1, value2, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andHomedirectoryNotBetween(String value1, String value2) {
            addCriterion("homeDirectory not between", value1, value2, "homedirectory");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filePath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filePath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filePath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filePath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filePath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filePath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filePath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filePath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filePath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filePath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filePath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filePath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filePath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andWritepermissionIsNull() {
            addCriterion("writePermission is null");
            return (Criteria) this;
        }

        public Criteria andWritepermissionIsNotNull() {
            addCriterion("writePermission is not null");
            return (Criteria) this;
        }

        public Criteria andWritepermissionEqualTo(Boolean value) {
            addCriterion("writePermission =", value, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionNotEqualTo(Boolean value) {
            addCriterion("writePermission <>", value, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionGreaterThan(Boolean value) {
            addCriterion("writePermission >", value, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("writePermission >=", value, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionLessThan(Boolean value) {
            addCriterion("writePermission <", value, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionLessThanOrEqualTo(Boolean value) {
            addCriterion("writePermission <=", value, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionIn(List<Boolean> values) {
            addCriterion("writePermission in", values, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionNotIn(List<Boolean> values) {
            addCriterion("writePermission not in", values, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionBetween(Boolean value1, Boolean value2) {
            addCriterion("writePermission between", value1, value2, "writepermission");
            return (Criteria) this;
        }

        public Criteria andWritepermissionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("writePermission not between", value1, value2, "writepermission");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPdfexportIsNull() {
            addCriterion("pdfexport is null");
            return (Criteria) this;
        }

        public Criteria andPdfexportIsNotNull() {
            addCriterion("pdfexport is not null");
            return (Criteria) this;
        }

        public Criteria andPdfexportEqualTo(String value) {
            addCriterion("pdfexport =", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportNotEqualTo(String value) {
            addCriterion("pdfexport <>", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportGreaterThan(String value) {
            addCriterion("pdfexport >", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportGreaterThanOrEqualTo(String value) {
            addCriterion("pdfexport >=", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportLessThan(String value) {
            addCriterion("pdfexport <", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportLessThanOrEqualTo(String value) {
            addCriterion("pdfexport <=", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportLike(String value) {
            addCriterion("pdfexport like", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportNotLike(String value) {
            addCriterion("pdfexport not like", value, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportIn(List<String> values) {
            addCriterion("pdfexport in", values, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportNotIn(List<String> values) {
            addCriterion("pdfexport not in", values, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportBetween(String value1, String value2) {
            addCriterion("pdfexport between", value1, value2, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andPdfexportNotBetween(String value1, String value2) {
            addCriterion("pdfexport not between", value1, value2, "pdfexport");
            return (Criteria) this;
        }

        public Criteria andIdletimeIsNull() {
            addCriterion("idletime is null");
            return (Criteria) this;
        }

        public Criteria andIdletimeIsNotNull() {
            addCriterion("idletime is not null");
            return (Criteria) this;
        }

        public Criteria andIdletimeEqualTo(Integer value) {
            addCriterion("idletime =", value, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeNotEqualTo(Integer value) {
            addCriterion("idletime <>", value, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeGreaterThan(Integer value) {
            addCriterion("idletime >", value, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("idletime >=", value, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeLessThan(Integer value) {
            addCriterion("idletime <", value, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeLessThanOrEqualTo(Integer value) {
            addCriterion("idletime <=", value, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeIn(List<Integer> values) {
            addCriterion("idletime in", values, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeNotIn(List<Integer> values) {
            addCriterion("idletime not in", values, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeBetween(Integer value1, Integer value2) {
            addCriterion("idletime between", value1, value2, "idletime");
            return (Criteria) this;
        }

        public Criteria andIdletimeNotBetween(Integer value1, Integer value2) {
            addCriterion("idletime not between", value1, value2, "idletime");
            return (Criteria) this;
        }

        public Criteria andUploadrateIsNull() {
            addCriterion("uploadrate is null");
            return (Criteria) this;
        }

        public Criteria andUploadrateIsNotNull() {
            addCriterion("uploadrate is not null");
            return (Criteria) this;
        }

        public Criteria andUploadrateEqualTo(Integer value) {
            addCriterion("uploadrate =", value, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateNotEqualTo(Integer value) {
            addCriterion("uploadrate <>", value, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateGreaterThan(Integer value) {
            addCriterion("uploadrate >", value, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadrate >=", value, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateLessThan(Integer value) {
            addCriterion("uploadrate <", value, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateLessThanOrEqualTo(Integer value) {
            addCriterion("uploadrate <=", value, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateIn(List<Integer> values) {
            addCriterion("uploadrate in", values, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateNotIn(List<Integer> values) {
            addCriterion("uploadrate not in", values, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateBetween(Integer value1, Integer value2) {
            addCriterion("uploadrate between", value1, value2, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andUploadrateNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadrate not between", value1, value2, "uploadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateIsNull() {
            addCriterion("downloadrate is null");
            return (Criteria) this;
        }

        public Criteria andDownloadrateIsNotNull() {
            addCriterion("downloadrate is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadrateEqualTo(Integer value) {
            addCriterion("downloadrate =", value, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateNotEqualTo(Integer value) {
            addCriterion("downloadrate <>", value, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateGreaterThan(Integer value) {
            addCriterion("downloadrate >", value, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadrate >=", value, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateLessThan(Integer value) {
            addCriterion("downloadrate <", value, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateLessThanOrEqualTo(Integer value) {
            addCriterion("downloadrate <=", value, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateIn(List<Integer> values) {
            addCriterion("downloadrate in", values, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateNotIn(List<Integer> values) {
            addCriterion("downloadrate not in", values, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateBetween(Integer value1, Integer value2) {
            addCriterion("downloadrate between", value1, value2, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andDownloadrateNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadrate not between", value1, value2, "downloadrate");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberIsNull() {
            addCriterion("maxloginnumber is null");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberIsNotNull() {
            addCriterion("maxloginnumber is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberEqualTo(Integer value) {
            addCriterion("maxloginnumber =", value, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberNotEqualTo(Integer value) {
            addCriterion("maxloginnumber <>", value, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberGreaterThan(Integer value) {
            addCriterion("maxloginnumber >", value, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxloginnumber >=", value, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberLessThan(Integer value) {
            addCriterion("maxloginnumber <", value, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberLessThanOrEqualTo(Integer value) {
            addCriterion("maxloginnumber <=", value, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberIn(List<Integer> values) {
            addCriterion("maxloginnumber in", values, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberNotIn(List<Integer> values) {
            addCriterion("maxloginnumber not in", values, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberBetween(Integer value1, Integer value2) {
            addCriterion("maxloginnumber between", value1, value2, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("maxloginnumber not between", value1, value2, "maxloginnumber");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipIsNull() {
            addCriterion("maxloginperip is null");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipIsNotNull() {
            addCriterion("maxloginperip is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipEqualTo(Integer value) {
            addCriterion("maxloginperip =", value, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipNotEqualTo(Integer value) {
            addCriterion("maxloginperip <>", value, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipGreaterThan(Integer value) {
            addCriterion("maxloginperip >", value, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxloginperip >=", value, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipLessThan(Integer value) {
            addCriterion("maxloginperip <", value, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipLessThanOrEqualTo(Integer value) {
            addCriterion("maxloginperip <=", value, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipIn(List<Integer> values) {
            addCriterion("maxloginperip in", values, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipNotIn(List<Integer> values) {
            addCriterion("maxloginperip not in", values, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipBetween(Integer value1, Integer value2) {
            addCriterion("maxloginperip between", value1, value2, "maxloginperip");
            return (Criteria) this;
        }

        public Criteria andMaxloginperipNotBetween(Integer value1, Integer value2) {
            addCriterion("maxloginperip not between", value1, value2, "maxloginperip");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}