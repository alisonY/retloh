package com.retloh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BloodPreIntervalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BloodPreIntervalExample() {
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

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("patient_id like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("patient_id not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIsNull() {
            addCriterion("day_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIsNotNull() {
            addCriterion("day_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeEqualTo(Date value) {
            addCriterion("day_start_time =", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotEqualTo(Date value) {
            addCriterion("day_start_time <>", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeGreaterThan(Date value) {
            addCriterion("day_start_time >", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("day_start_time >=", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLessThan(Date value) {
            addCriterion("day_start_time <", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("day_start_time <=", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIn(List<Date> values) {
            addCriterion("day_start_time in", values, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotIn(List<Date> values) {
            addCriterion("day_start_time not in", values, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeBetween(Date value1, Date value2) {
            addCriterion("day_start_time between", value1, value2, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("day_start_time not between", value1, value2, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayIntervalIsNull() {
            addCriterion("day_interval is null");
            return (Criteria) this;
        }

        public Criteria andDayIntervalIsNotNull() {
            addCriterion("day_interval is not null");
            return (Criteria) this;
        }

        public Criteria andDayIntervalEqualTo(Date value) {
            addCriterion("day_interval =", value, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalNotEqualTo(Date value) {
            addCriterion("day_interval <>", value, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalGreaterThan(Date value) {
            addCriterion("day_interval >", value, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalGreaterThanOrEqualTo(Date value) {
            addCriterion("day_interval >=", value, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalLessThan(Date value) {
            addCriterion("day_interval <", value, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalLessThanOrEqualTo(Date value) {
            addCriterion("day_interval <=", value, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalIn(List<Date> values) {
            addCriterion("day_interval in", values, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalNotIn(List<Date> values) {
            addCriterion("day_interval not in", values, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalBetween(Date value1, Date value2) {
            addCriterion("day_interval between", value1, value2, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andDayIntervalNotBetween(Date value1, Date value2) {
            addCriterion("day_interval not between", value1, value2, "dayInterval");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIsNull() {
            addCriterion("night_start_time is null");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIsNotNull() {
            addCriterion("night_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeEqualTo(Date value) {
            addCriterion("night_start_time =", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotEqualTo(Date value) {
            addCriterion("night_start_time <>", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeGreaterThan(Date value) {
            addCriterion("night_start_time >", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("night_start_time >=", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLessThan(Date value) {
            addCriterion("night_start_time <", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("night_start_time <=", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIn(List<Date> values) {
            addCriterion("night_start_time in", values, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotIn(List<Date> values) {
            addCriterion("night_start_time not in", values, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeBetween(Date value1, Date value2) {
            addCriterion("night_start_time between", value1, value2, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("night_start_time not between", value1, value2, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightIntervalIsNull() {
            addCriterion("night_interval is null");
            return (Criteria) this;
        }

        public Criteria andNightIntervalIsNotNull() {
            addCriterion("night_interval is not null");
            return (Criteria) this;
        }

        public Criteria andNightIntervalEqualTo(Date value) {
            addCriterion("night_interval =", value, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalNotEqualTo(Date value) {
            addCriterion("night_interval <>", value, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalGreaterThan(Date value) {
            addCriterion("night_interval >", value, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalGreaterThanOrEqualTo(Date value) {
            addCriterion("night_interval >=", value, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalLessThan(Date value) {
            addCriterion("night_interval <", value, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalLessThanOrEqualTo(Date value) {
            addCriterion("night_interval <=", value, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalIn(List<Date> values) {
            addCriterion("night_interval in", values, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalNotIn(List<Date> values) {
            addCriterion("night_interval not in", values, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalBetween(Date value1, Date value2) {
            addCriterion("night_interval between", value1, value2, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andNightIntervalNotBetween(Date value1, Date value2) {
            addCriterion("night_interval not between", value1, value2, "nightInterval");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountIsNull() {
            addCriterion("error_count is null");
            return (Criteria) this;
        }

        public Criteria andErrorCountIsNotNull() {
            addCriterion("error_count is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCountEqualTo(Integer value) {
            addCriterion("error_count =", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountNotEqualTo(Integer value) {
            addCriterion("error_count <>", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountGreaterThan(Integer value) {
            addCriterion("error_count >", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_count >=", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountLessThan(Integer value) {
            addCriterion("error_count <", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountLessThanOrEqualTo(Integer value) {
            addCriterion("error_count <=", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountIn(List<Integer> values) {
            addCriterion("error_count in", values, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountNotIn(List<Integer> values) {
            addCriterion("error_count not in", values, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountBetween(Integer value1, Integer value2) {
            addCriterion("error_count between", value1, value2, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("error_count not between", value1, value2, "errorCount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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