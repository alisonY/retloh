package com.retloh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseInfoExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
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

        public Criteria andCitizenNumberIsNull() {
            addCriterion("citizen_number is null");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberIsNotNull() {
            addCriterion("citizen_number is not null");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberEqualTo(String value) {
            addCriterion("citizen_number =", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberNotEqualTo(String value) {
            addCriterion("citizen_number <>", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberGreaterThan(String value) {
            addCriterion("citizen_number >", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberGreaterThanOrEqualTo(String value) {
            addCriterion("citizen_number >=", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberLessThan(String value) {
            addCriterion("citizen_number <", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberLessThanOrEqualTo(String value) {
            addCriterion("citizen_number <=", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberLike(String value) {
            addCriterion("citizen_number like", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberNotLike(String value) {
            addCriterion("citizen_number not like", value, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberIn(List<String> values) {
            addCriterion("citizen_number in", values, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberNotIn(List<String> values) {
            addCriterion("citizen_number not in", values, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberBetween(String value1, String value2) {
            addCriterion("citizen_number between", value1, value2, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andCitizenNumberNotBetween(String value1, String value2) {
            addCriterion("citizen_number not between", value1, value2, "citizenNumber");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andClinicNumberIsNull() {
            addCriterion("clinic_number is null");
            return (Criteria) this;
        }

        public Criteria andClinicNumberIsNotNull() {
            addCriterion("clinic_number is not null");
            return (Criteria) this;
        }

        public Criteria andClinicNumberEqualTo(String value) {
            addCriterion("clinic_number =", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberNotEqualTo(String value) {
            addCriterion("clinic_number <>", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberGreaterThan(String value) {
            addCriterion("clinic_number >", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberGreaterThanOrEqualTo(String value) {
            addCriterion("clinic_number >=", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberLessThan(String value) {
            addCriterion("clinic_number <", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberLessThanOrEqualTo(String value) {
            addCriterion("clinic_number <=", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberLike(String value) {
            addCriterion("clinic_number like", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberNotLike(String value) {
            addCriterion("clinic_number not like", value, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberIn(List<String> values) {
            addCriterion("clinic_number in", values, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberNotIn(List<String> values) {
            addCriterion("clinic_number not in", values, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberBetween(String value1, String value2) {
            addCriterion("clinic_number between", value1, value2, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andClinicNumberNotBetween(String value1, String value2) {
            addCriterion("clinic_number not between", value1, value2, "clinicNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNull() {
            addCriterion("bed_number is null");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNotNull() {
            addCriterion("bed_number is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumberEqualTo(String value) {
            addCriterion("bed_number =", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotEqualTo(String value) {
            addCriterion("bed_number <>", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThan(String value) {
            addCriterion("bed_number >", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bed_number >=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThan(String value) {
            addCriterion("bed_number <", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThanOrEqualTo(String value) {
            addCriterion("bed_number <=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLike(String value) {
            addCriterion("bed_number like", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotLike(String value) {
            addCriterion("bed_number not like", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberIn(List<String> values) {
            addCriterion("bed_number in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotIn(List<String> values) {
            addCriterion("bed_number not in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberBetween(String value1, String value2) {
            addCriterion("bed_number between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotBetween(String value1, String value2) {
            addCriterion("bed_number not between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andRecordYearIsNull() {
            addCriterion("record_year is null");
            return (Criteria) this;
        }

        public Criteria andRecordYearIsNotNull() {
            addCriterion("record_year is not null");
            return (Criteria) this;
        }

        public Criteria andRecordYearEqualTo(Integer value) {
            addCriterion("record_year =", value, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearNotEqualTo(Integer value) {
            addCriterion("record_year <>", value, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearGreaterThan(Integer value) {
            addCriterion("record_year >", value, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_year >=", value, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearLessThan(Integer value) {
            addCriterion("record_year <", value, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearLessThanOrEqualTo(Integer value) {
            addCriterion("record_year <=", value, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearIn(List<Integer> values) {
            addCriterion("record_year in", values, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearNotIn(List<Integer> values) {
            addCriterion("record_year not in", values, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearBetween(Integer value1, Integer value2) {
            addCriterion("record_year between", value1, value2, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordYearNotBetween(Integer value1, Integer value2) {
            addCriterion("record_year not between", value1, value2, "recordYear");
            return (Criteria) this;
        }

        public Criteria andRecordMounthIsNull() {
            addCriterion("record_mounth is null");
            return (Criteria) this;
        }

        public Criteria andRecordMounthIsNotNull() {
            addCriterion("record_mounth is not null");
            return (Criteria) this;
        }

        public Criteria andRecordMounthEqualTo(Integer value) {
            addCriterion("record_mounth =", value, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthNotEqualTo(Integer value) {
            addCriterion("record_mounth <>", value, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthGreaterThan(Integer value) {
            addCriterion("record_mounth >", value, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_mounth >=", value, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthLessThan(Integer value) {
            addCriterion("record_mounth <", value, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthLessThanOrEqualTo(Integer value) {
            addCriterion("record_mounth <=", value, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthIn(List<Integer> values) {
            addCriterion("record_mounth in", values, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthNotIn(List<Integer> values) {
            addCriterion("record_mounth not in", values, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthBetween(Integer value1, Integer value2) {
            addCriterion("record_mounth between", value1, value2, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordMounthNotBetween(Integer value1, Integer value2) {
            addCriterion("record_mounth not between", value1, value2, "recordMounth");
            return (Criteria) this;
        }

        public Criteria andRecordDayIsNull() {
            addCriterion("record_day is null");
            return (Criteria) this;
        }

        public Criteria andRecordDayIsNotNull() {
            addCriterion("record_day is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDayEqualTo(Integer value) {
            addCriterion("record_day =", value, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayNotEqualTo(Integer value) {
            addCriterion("record_day <>", value, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayGreaterThan(Integer value) {
            addCriterion("record_day >", value, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_day >=", value, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayLessThan(Integer value) {
            addCriterion("record_day <", value, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayLessThanOrEqualTo(Integer value) {
            addCriterion("record_day <=", value, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayIn(List<Integer> values) {
            addCriterion("record_day in", values, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayNotIn(List<Integer> values) {
            addCriterion("record_day not in", values, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayBetween(Integer value1, Integer value2) {
            addCriterion("record_day between", value1, value2, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordDayNotBetween(Integer value1, Integer value2) {
            addCriterion("record_day not between", value1, value2, "recordDay");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesIsNull() {
            addCriterion("record_minutes is null");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesIsNotNull() {
            addCriterion("record_minutes is not null");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesEqualTo(Integer value) {
            addCriterion("record_minutes =", value, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesNotEqualTo(Integer value) {
            addCriterion("record_minutes <>", value, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesGreaterThan(Integer value) {
            addCriterion("record_minutes >", value, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_minutes >=", value, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesLessThan(Integer value) {
            addCriterion("record_minutes <", value, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesLessThanOrEqualTo(Integer value) {
            addCriterion("record_minutes <=", value, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesIn(List<Integer> values) {
            addCriterion("record_minutes in", values, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesNotIn(List<Integer> values) {
            addCriterion("record_minutes not in", values, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesBetween(Integer value1, Integer value2) {
            addCriterion("record_minutes between", value1, value2, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andRecordMinutesNotBetween(Integer value1, Integer value2) {
            addCriterion("record_minutes not between", value1, value2, "recordMinutes");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorIsNull() {
            addCriterion("operation_doctor is null");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorIsNotNull() {
            addCriterion("operation_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorEqualTo(String value) {
            addCriterion("operation_doctor =", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorNotEqualTo(String value) {
            addCriterion("operation_doctor <>", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorGreaterThan(String value) {
            addCriterion("operation_doctor >", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("operation_doctor >=", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorLessThan(String value) {
            addCriterion("operation_doctor <", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorLessThanOrEqualTo(String value) {
            addCriterion("operation_doctor <=", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorLike(String value) {
            addCriterion("operation_doctor like", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorNotLike(String value) {
            addCriterion("operation_doctor not like", value, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorIn(List<String> values) {
            addCriterion("operation_doctor in", values, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorNotIn(List<String> values) {
            addCriterion("operation_doctor not in", values, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorBetween(String value1, String value2) {
            addCriterion("operation_doctor between", value1, value2, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andOperationDoctorNotBetween(String value1, String value2) {
            addCriterion("operation_doctor not between", value1, value2, "operationDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorIsNull() {
            addCriterion("diagnostic_doctor is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorIsNotNull() {
            addCriterion("diagnostic_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorEqualTo(String value) {
            addCriterion("diagnostic_doctor =", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorNotEqualTo(String value) {
            addCriterion("diagnostic_doctor <>", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorGreaterThan(String value) {
            addCriterion("diagnostic_doctor >", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("diagnostic_doctor >=", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorLessThan(String value) {
            addCriterion("diagnostic_doctor <", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorLessThanOrEqualTo(String value) {
            addCriterion("diagnostic_doctor <=", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorLike(String value) {
            addCriterion("diagnostic_doctor like", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorNotLike(String value) {
            addCriterion("diagnostic_doctor not like", value, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorIn(List<String> values) {
            addCriterion("diagnostic_doctor in", values, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorNotIn(List<String> values) {
            addCriterion("diagnostic_doctor not in", values, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorBetween(String value1, String value2) {
            addCriterion("diagnostic_doctor between", value1, value2, "diagnosticDoctor");
            return (Criteria) this;
        }

        public Criteria andDiagnosticDoctorNotBetween(String value1, String value2) {
            addCriterion("diagnostic_doctor not between", value1, value2, "diagnosticDoctor");
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

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberIsNull() {
            addCriterion("hospital_number is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberIsNotNull() {
            addCriterion("hospital_number is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberEqualTo(String value) {
            addCriterion("hospital_number =", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotEqualTo(String value) {
            addCriterion("hospital_number <>", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberGreaterThan(String value) {
            addCriterion("hospital_number >", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_number >=", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberLessThan(String value) {
            addCriterion("hospital_number <", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberLessThanOrEqualTo(String value) {
            addCriterion("hospital_number <=", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberLike(String value) {
            addCriterion("hospital_number like", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotLike(String value) {
            addCriterion("hospital_number not like", value, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberIn(List<String> values) {
            addCriterion("hospital_number in", values, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotIn(List<String> values) {
            addCriterion("hospital_number not in", values, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberBetween(String value1, String value2) {
            addCriterion("hospital_number between", value1, value2, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNumberNotBetween(String value1, String value2) {
            addCriterion("hospital_number not between", value1, value2, "hospitalNumber");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameIsNull() {
            addCriterion("default_hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameIsNotNull() {
            addCriterion("default_hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameEqualTo(String value) {
            addCriterion("default_hospital_name =", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameNotEqualTo(String value) {
            addCriterion("default_hospital_name <>", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameGreaterThan(String value) {
            addCriterion("default_hospital_name >", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("default_hospital_name >=", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameLessThan(String value) {
            addCriterion("default_hospital_name <", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("default_hospital_name <=", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameLike(String value) {
            addCriterion("default_hospital_name like", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameNotLike(String value) {
            addCriterion("default_hospital_name not like", value, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameIn(List<String> values) {
            addCriterion("default_hospital_name in", values, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameNotIn(List<String> values) {
            addCriterion("default_hospital_name not in", values, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameBetween(String value1, String value2) {
            addCriterion("default_hospital_name between", value1, value2, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andDefaultHospitalNameNotBetween(String value1, String value2) {
            addCriterion("default_hospital_name not between", value1, value2, "defaultHospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressIsNull() {
            addCriterion("hospital_address is null");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressIsNotNull() {
            addCriterion("hospital_address is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressEqualTo(String value) {
            addCriterion("hospital_address =", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressNotEqualTo(String value) {
            addCriterion("hospital_address <>", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressGreaterThan(String value) {
            addCriterion("hospital_address >", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_address >=", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressLessThan(String value) {
            addCriterion("hospital_address <", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressLessThanOrEqualTo(String value) {
            addCriterion("hospital_address <=", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressLike(String value) {
            addCriterion("hospital_address like", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressNotLike(String value) {
            addCriterion("hospital_address not like", value, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressIn(List<String> values) {
            addCriterion("hospital_address in", values, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressNotIn(List<String> values) {
            addCriterion("hospital_address not in", values, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressBetween(String value1, String value2) {
            addCriterion("hospital_address between", value1, value2, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalAddressNotBetween(String value1, String value2) {
            addCriterion("hospital_address not between", value1, value2, "hospitalAddress");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumIsNull() {
            addCriterion("hospital_phonenum is null");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumIsNotNull() {
            addCriterion("hospital_phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumEqualTo(String value) {
            addCriterion("hospital_phonenum =", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumNotEqualTo(String value) {
            addCriterion("hospital_phonenum <>", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumGreaterThan(String value) {
            addCriterion("hospital_phonenum >", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_phonenum >=", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumLessThan(String value) {
            addCriterion("hospital_phonenum <", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumLessThanOrEqualTo(String value) {
            addCriterion("hospital_phonenum <=", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumLike(String value) {
            addCriterion("hospital_phonenum like", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumNotLike(String value) {
            addCriterion("hospital_phonenum not like", value, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumIn(List<String> values) {
            addCriterion("hospital_phonenum in", values, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumNotIn(List<String> values) {
            addCriterion("hospital_phonenum not in", values, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumBetween(String value1, String value2) {
            addCriterion("hospital_phonenum between", value1, value2, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalPhonenumNotBetween(String value1, String value2) {
            addCriterion("hospital_phonenum not between", value1, value2, "hospitalPhonenum");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxIsNull() {
            addCriterion("hospital_fax is null");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxIsNotNull() {
            addCriterion("hospital_fax is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxEqualTo(String value) {
            addCriterion("hospital_fax =", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotEqualTo(String value) {
            addCriterion("hospital_fax <>", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxGreaterThan(String value) {
            addCriterion("hospital_fax >", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_fax >=", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxLessThan(String value) {
            addCriterion("hospital_fax <", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxLessThanOrEqualTo(String value) {
            addCriterion("hospital_fax <=", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxLike(String value) {
            addCriterion("hospital_fax like", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotLike(String value) {
            addCriterion("hospital_fax not like", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxIn(List<String> values) {
            addCriterion("hospital_fax in", values, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotIn(List<String> values) {
            addCriterion("hospital_fax not in", values, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxBetween(String value1, String value2) {
            addCriterion("hospital_fax between", value1, value2, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotBetween(String value1, String value2) {
            addCriterion("hospital_fax not between", value1, value2, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andPatientYearIsNull() {
            addCriterion("patient_year is null");
            return (Criteria) this;
        }

        public Criteria andPatientYearIsNotNull() {
            addCriterion("patient_year is not null");
            return (Criteria) this;
        }

        public Criteria andPatientYearEqualTo(Integer value) {
            addCriterion("patient_year =", value, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearNotEqualTo(Integer value) {
            addCriterion("patient_year <>", value, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearGreaterThan(Integer value) {
            addCriterion("patient_year >", value, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_year >=", value, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearLessThan(Integer value) {
            addCriterion("patient_year <", value, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearLessThanOrEqualTo(Integer value) {
            addCriterion("patient_year <=", value, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearIn(List<Integer> values) {
            addCriterion("patient_year in", values, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearNotIn(List<Integer> values) {
            addCriterion("patient_year not in", values, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearBetween(Integer value1, Integer value2) {
            addCriterion("patient_year between", value1, value2, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientYearNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_year not between", value1, value2, "patientYear");
            return (Criteria) this;
        }

        public Criteria andPatientMonthIsNull() {
            addCriterion("patient_month is null");
            return (Criteria) this;
        }

        public Criteria andPatientMonthIsNotNull() {
            addCriterion("patient_month is not null");
            return (Criteria) this;
        }

        public Criteria andPatientMonthEqualTo(Integer value) {
            addCriterion("patient_month =", value, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthNotEqualTo(Integer value) {
            addCriterion("patient_month <>", value, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthGreaterThan(Integer value) {
            addCriterion("patient_month >", value, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_month >=", value, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthLessThan(Integer value) {
            addCriterion("patient_month <", value, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthLessThanOrEqualTo(Integer value) {
            addCriterion("patient_month <=", value, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthIn(List<Integer> values) {
            addCriterion("patient_month in", values, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthNotIn(List<Integer> values) {
            addCriterion("patient_month not in", values, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthBetween(Integer value1, Integer value2) {
            addCriterion("patient_month between", value1, value2, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_month not between", value1, value2, "patientMonth");
            return (Criteria) this;
        }

        public Criteria andPatientDayIsNull() {
            addCriterion("patient_day is null");
            return (Criteria) this;
        }

        public Criteria andPatientDayIsNotNull() {
            addCriterion("patient_day is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDayEqualTo(Integer value) {
            addCriterion("patient_day =", value, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayNotEqualTo(Integer value) {
            addCriterion("patient_day <>", value, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayGreaterThan(Integer value) {
            addCriterion("patient_day >", value, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_day >=", value, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayLessThan(Integer value) {
            addCriterion("patient_day <", value, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayLessThanOrEqualTo(Integer value) {
            addCriterion("patient_day <=", value, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayIn(List<Integer> values) {
            addCriterion("patient_day in", values, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayNotIn(List<Integer> values) {
            addCriterion("patient_day not in", values, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayBetween(Integer value1, Integer value2) {
            addCriterion("patient_day between", value1, value2, "patientDay");
            return (Criteria) this;
        }

        public Criteria andPatientDayNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_day not between", value1, value2, "patientDay");
            return (Criteria) this;
        }

        public Criteria andDaolianshuIsNull() {
            addCriterion("daolianshu is null");
            return (Criteria) this;
        }

        public Criteria andDaolianshuIsNotNull() {
            addCriterion("daolianshu is not null");
            return (Criteria) this;
        }

        public Criteria andDaolianshuEqualTo(Integer value) {
            addCriterion("daolianshu =", value, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuNotEqualTo(Integer value) {
            addCriterion("daolianshu <>", value, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuGreaterThan(Integer value) {
            addCriterion("daolianshu >", value, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("daolianshu >=", value, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuLessThan(Integer value) {
            addCriterion("daolianshu <", value, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuLessThanOrEqualTo(Integer value) {
            addCriterion("daolianshu <=", value, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuIn(List<Integer> values) {
            addCriterion("daolianshu in", values, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuNotIn(List<Integer> values) {
            addCriterion("daolianshu not in", values, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuBetween(Integer value1, Integer value2) {
            addCriterion("daolianshu between", value1, value2, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andDaolianshuNotBetween(Integer value1, Integer value2) {
            addCriterion("daolianshu not between", value1, value2, "daolianshu");
            return (Criteria) this;
        }

        public Criteria andSumHoursIsNull() {
            addCriterion("sum_hours is null");
            return (Criteria) this;
        }

        public Criteria andSumHoursIsNotNull() {
            addCriterion("sum_hours is not null");
            return (Criteria) this;
        }

        public Criteria andSumHoursEqualTo(Integer value) {
            addCriterion("sum_hours =", value, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursNotEqualTo(Integer value) {
            addCriterion("sum_hours <>", value, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursGreaterThan(Integer value) {
            addCriterion("sum_hours >", value, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_hours >=", value, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursLessThan(Integer value) {
            addCriterion("sum_hours <", value, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursLessThanOrEqualTo(Integer value) {
            addCriterion("sum_hours <=", value, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursIn(List<Integer> values) {
            addCriterion("sum_hours in", values, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursNotIn(List<Integer> values) {
            addCriterion("sum_hours not in", values, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursBetween(Integer value1, Integer value2) {
            addCriterion("sum_hours between", value1, value2, "sumHours");
            return (Criteria) this;
        }

        public Criteria andSumHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_hours not between", value1, value2, "sumHours");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterIsNull() {
            addCriterion("pacemaker_parameter is null");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterIsNotNull() {
            addCriterion("pacemaker_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterEqualTo(String value) {
            addCriterion("pacemaker_parameter =", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterNotEqualTo(String value) {
            addCriterion("pacemaker_parameter <>", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterGreaterThan(String value) {
            addCriterion("pacemaker_parameter >", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterGreaterThanOrEqualTo(String value) {
            addCriterion("pacemaker_parameter >=", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterLessThan(String value) {
            addCriterion("pacemaker_parameter <", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterLessThanOrEqualTo(String value) {
            addCriterion("pacemaker_parameter <=", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterLike(String value) {
            addCriterion("pacemaker_parameter like", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterNotLike(String value) {
            addCriterion("pacemaker_parameter not like", value, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterIn(List<String> values) {
            addCriterion("pacemaker_parameter in", values, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterNotIn(List<String> values) {
            addCriterion("pacemaker_parameter not in", values, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterBetween(String value1, String value2) {
            addCriterion("pacemaker_parameter between", value1, value2, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andPacemakerParameterNotBetween(String value1, String value2) {
            addCriterion("pacemaker_parameter not between", value1, value2, "pacemakerParameter");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNull() {
            addCriterion("offset is null");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNotNull() {
            addCriterion("offset is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetEqualTo(Integer value) {
            addCriterion("offset =", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotEqualTo(Integer value) {
            addCriterion("offset <>", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThan(Integer value) {
            addCriterion("offset >", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("offset >=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThan(Integer value) {
            addCriterion("offset <", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("offset <=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetIn(List<Integer> values) {
            addCriterion("offset in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotIn(List<Integer> values) {
            addCriterion("offset not in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetBetween(Integer value1, Integer value2) {
            addCriterion("offset between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("offset not between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNull() {
            addCriterion("suggest is null");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNotNull() {
            addCriterion("suggest is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestEqualTo(String value) {
            addCriterion("suggest =", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotEqualTo(String value) {
            addCriterion("suggest <>", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThan(String value) {
            addCriterion("suggest >", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("suggest >=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThan(String value) {
            addCriterion("suggest <", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThanOrEqualTo(String value) {
            addCriterion("suggest <=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLike(String value) {
            addCriterion("suggest like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotLike(String value) {
            addCriterion("suggest not like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestIn(List<String> values) {
            addCriterion("suggest in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotIn(List<String> values) {
            addCriterion("suggest not in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestBetween(String value1, String value2) {
            addCriterion("suggest between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotBetween(String value1, String value2) {
            addCriterion("suggest not between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNull() {
            addCriterion("conclusion is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("conclusion =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("conclusion <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("conclusion >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("conclusion >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("conclusion <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("conclusion <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("conclusion like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("conclusion not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("conclusion in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("conclusion not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("conclusion between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("conclusion not between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingIsNull() {
            addCriterion("yongyaoshuoming is null");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingIsNotNull() {
            addCriterion("yongyaoshuoming is not null");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingEqualTo(String value) {
            addCriterion("yongyaoshuoming =", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingNotEqualTo(String value) {
            addCriterion("yongyaoshuoming <>", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingGreaterThan(String value) {
            addCriterion("yongyaoshuoming >", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingGreaterThanOrEqualTo(String value) {
            addCriterion("yongyaoshuoming >=", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingLessThan(String value) {
            addCriterion("yongyaoshuoming <", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingLessThanOrEqualTo(String value) {
            addCriterion("yongyaoshuoming <=", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingLike(String value) {
            addCriterion("yongyaoshuoming like", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingNotLike(String value) {
            addCriterion("yongyaoshuoming not like", value, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingIn(List<String> values) {
            addCriterion("yongyaoshuoming in", values, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingNotIn(List<String> values) {
            addCriterion("yongyaoshuoming not in", values, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingBetween(String value1, String value2) {
            addCriterion("yongyaoshuoming between", value1, value2, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andYongyaoshuomingNotBetween(String value1, String value2) {
            addCriterion("yongyaoshuoming not between", value1, value2, "yongyaoshuoming");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCaseTagIsNull() {
            addCriterion("case_tag is null");
            return (Criteria) this;
        }

        public Criteria andCaseTagIsNotNull() {
            addCriterion("case_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTagEqualTo(String value) {
            addCriterion("case_tag =", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagNotEqualTo(String value) {
            addCriterion("case_tag <>", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagGreaterThan(String value) {
            addCriterion("case_tag >", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagGreaterThanOrEqualTo(String value) {
            addCriterion("case_tag >=", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagLessThan(String value) {
            addCriterion("case_tag <", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagLessThanOrEqualTo(String value) {
            addCriterion("case_tag <=", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagLike(String value) {
            addCriterion("case_tag like", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagNotLike(String value) {
            addCriterion("case_tag not like", value, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagIn(List<String> values) {
            addCriterion("case_tag in", values, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagNotIn(List<String> values) {
            addCriterion("case_tag not in", values, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagBetween(String value1, String value2) {
            addCriterion("case_tag between", value1, value2, "caseTag");
            return (Criteria) this;
        }

        public Criteria andCaseTagNotBetween(String value1, String value2) {
            addCriterion("case_tag not between", value1, value2, "caseTag");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateIsNull() {
            addCriterion("holter_load_date is null");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateIsNotNull() {
            addCriterion("holter_load_date is not null");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateEqualTo(Date value) {
            addCriterion("holter_load_date =", value, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateNotEqualTo(Date value) {
            addCriterion("holter_load_date <>", value, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateGreaterThan(Date value) {
            addCriterion("holter_load_date >", value, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateGreaterThanOrEqualTo(Date value) {
            addCriterion("holter_load_date >=", value, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateLessThan(Date value) {
            addCriterion("holter_load_date <", value, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateLessThanOrEqualTo(Date value) {
            addCriterion("holter_load_date <=", value, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateIn(List<Date> values) {
            addCriterion("holter_load_date in", values, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateNotIn(List<Date> values) {
            addCriterion("holter_load_date not in", values, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateBetween(Date value1, Date value2) {
            addCriterion("holter_load_date between", value1, value2, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andHolterLoadDateNotBetween(Date value1, Date value2) {
            addCriterion("holter_load_date not between", value1, value2, "holterLoadDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionIsNull() {
            addCriterion("handwritten_conclusion is null");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionIsNotNull() {
            addCriterion("handwritten_conclusion is not null");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionEqualTo(String value) {
            addCriterion("handwritten_conclusion =", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionNotEqualTo(String value) {
            addCriterion("handwritten_conclusion <>", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionGreaterThan(String value) {
            addCriterion("handwritten_conclusion >", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("handwritten_conclusion >=", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionLessThan(String value) {
            addCriterion("handwritten_conclusion <", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionLessThanOrEqualTo(String value) {
            addCriterion("handwritten_conclusion <=", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionLike(String value) {
            addCriterion("handwritten_conclusion like", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionNotLike(String value) {
            addCriterion("handwritten_conclusion not like", value, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionIn(List<String> values) {
            addCriterion("handwritten_conclusion in", values, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionNotIn(List<String> values) {
            addCriterion("handwritten_conclusion not in", values, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionBetween(String value1, String value2) {
            addCriterion("handwritten_conclusion between", value1, value2, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andHandwrittenConclusionNotBetween(String value1, String value2) {
            addCriterion("handwritten_conclusion not between", value1, value2, "handwrittenConclusion");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathIsNull() {
            addCriterion("pdfexport_filePath is null");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathIsNotNull() {
            addCriterion("pdfexport_filePath is not null");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathEqualTo(String value) {
            addCriterion("pdfexport_filePath =", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathNotEqualTo(String value) {
            addCriterion("pdfexport_filePath <>", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathGreaterThan(String value) {
            addCriterion("pdfexport_filePath >", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("pdfexport_filePath >=", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathLessThan(String value) {
            addCriterion("pdfexport_filePath <", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathLessThanOrEqualTo(String value) {
            addCriterion("pdfexport_filePath <=", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathLike(String value) {
            addCriterion("pdfexport_filePath like", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathNotLike(String value) {
            addCriterion("pdfexport_filePath not like", value, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathIn(List<String> values) {
            addCriterion("pdfexport_filePath in", values, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathNotIn(List<String> values) {
            addCriterion("pdfexport_filePath not in", values, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathBetween(String value1, String value2) {
            addCriterion("pdfexport_filePath between", value1, value2, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andPdfexportFilepathNotBetween(String value1, String value2) {
            addCriterion("pdfexport_filePath not between", value1, value2, "pdfexportFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathIsNull() {
            addCriterion("original_filePath is null");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathIsNotNull() {
            addCriterion("original_filePath is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathEqualTo(String value) {
            addCriterion("original_filePath =", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathNotEqualTo(String value) {
            addCriterion("original_filePath <>", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathGreaterThan(String value) {
            addCriterion("original_filePath >", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("original_filePath >=", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathLessThan(String value) {
            addCriterion("original_filePath <", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathLessThanOrEqualTo(String value) {
            addCriterion("original_filePath <=", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathLike(String value) {
            addCriterion("original_filePath like", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathNotLike(String value) {
            addCriterion("original_filePath not like", value, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathIn(List<String> values) {
            addCriterion("original_filePath in", values, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathNotIn(List<String> values) {
            addCriterion("original_filePath not in", values, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathBetween(String value1, String value2) {
            addCriterion("original_filePath between", value1, value2, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andOriginalFilepathNotBetween(String value1, String value2) {
            addCriterion("original_filePath not between", value1, value2, "originalFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathIsNull() {
            addCriterion("analyzed_filePath is null");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathIsNotNull() {
            addCriterion("analyzed_filePath is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathEqualTo(String value) {
            addCriterion("analyzed_filePath =", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathNotEqualTo(String value) {
            addCriterion("analyzed_filePath <>", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathGreaterThan(String value) {
            addCriterion("analyzed_filePath >", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("analyzed_filePath >=", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathLessThan(String value) {
            addCriterion("analyzed_filePath <", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathLessThanOrEqualTo(String value) {
            addCriterion("analyzed_filePath <=", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathLike(String value) {
            addCriterion("analyzed_filePath like", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathNotLike(String value) {
            addCriterion("analyzed_filePath not like", value, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathIn(List<String> values) {
            addCriterion("analyzed_filePath in", values, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathNotIn(List<String> values) {
            addCriterion("analyzed_filePath not in", values, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathBetween(String value1, String value2) {
            addCriterion("analyzed_filePath between", value1, value2, "analyzedFilepath");
            return (Criteria) this;
        }

        public Criteria andAnalyzedFilepathNotBetween(String value1, String value2) {
            addCriterion("analyzed_filePath not between", value1, value2, "analyzedFilepath");
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