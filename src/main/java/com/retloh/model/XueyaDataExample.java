package com.retloh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XueyaDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XueyaDataExample() {
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

        public Criteria andSystoleIsNull() {
            addCriterion("systole is null");
            return (Criteria) this;
        }

        public Criteria andSystoleIsNotNull() {
            addCriterion("systole is not null");
            return (Criteria) this;
        }

        public Criteria andSystoleEqualTo(Integer value) {
            addCriterion("systole =", value, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleNotEqualTo(Integer value) {
            addCriterion("systole <>", value, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleGreaterThan(Integer value) {
            addCriterion("systole >", value, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("systole >=", value, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleLessThan(Integer value) {
            addCriterion("systole <", value, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleLessThanOrEqualTo(Integer value) {
            addCriterion("systole <=", value, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleIn(List<Integer> values) {
            addCriterion("systole in", values, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleNotIn(List<Integer> values) {
            addCriterion("systole not in", values, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleBetween(Integer value1, Integer value2) {
            addCriterion("systole between", value1, value2, "systole");
            return (Criteria) this;
        }

        public Criteria andSystoleNotBetween(Integer value1, Integer value2) {
            addCriterion("systole not between", value1, value2, "systole");
            return (Criteria) this;
        }

        public Criteria andDiastoleIsNull() {
            addCriterion("diastole is null");
            return (Criteria) this;
        }

        public Criteria andDiastoleIsNotNull() {
            addCriterion("diastole is not null");
            return (Criteria) this;
        }

        public Criteria andDiastoleEqualTo(Integer value) {
            addCriterion("diastole =", value, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleNotEqualTo(Integer value) {
            addCriterion("diastole <>", value, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleGreaterThan(Integer value) {
            addCriterion("diastole >", value, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("diastole >=", value, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleLessThan(Integer value) {
            addCriterion("diastole <", value, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleLessThanOrEqualTo(Integer value) {
            addCriterion("diastole <=", value, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleIn(List<Integer> values) {
            addCriterion("diastole in", values, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleNotIn(List<Integer> values) {
            addCriterion("diastole not in", values, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleBetween(Integer value1, Integer value2) {
            addCriterion("diastole between", value1, value2, "diastole");
            return (Criteria) this;
        }

        public Criteria andDiastoleNotBetween(Integer value1, Integer value2) {
            addCriterion("diastole not between", value1, value2, "diastole");
            return (Criteria) this;
        }

        public Criteria andHrIsNull() {
            addCriterion("hr is null");
            return (Criteria) this;
        }

        public Criteria andHrIsNotNull() {
            addCriterion("hr is not null");
            return (Criteria) this;
        }

        public Criteria andHrEqualTo(Integer value) {
            addCriterion("hr =", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotEqualTo(Integer value) {
            addCriterion("hr <>", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrGreaterThan(Integer value) {
            addCriterion("hr >", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr >=", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLessThan(Integer value) {
            addCriterion("hr <", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLessThanOrEqualTo(Integer value) {
            addCriterion("hr <=", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrIn(List<Integer> values) {
            addCriterion("hr in", values, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotIn(List<Integer> values) {
            addCriterion("hr not in", values, "hr");
            return (Criteria) this;
        }

        public Criteria andHrBetween(Integer value1, Integer value2) {
            addCriterion("hr between", value1, value2, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotBetween(Integer value1, Integer value2) {
            addCriterion("hr not between", value1, value2, "hr");
            return (Criteria) this;
        }

        public Criteria andDataNoIsNull() {
            addCriterion("data_no is null");
            return (Criteria) this;
        }

        public Criteria andDataNoIsNotNull() {
            addCriterion("data_no is not null");
            return (Criteria) this;
        }

        public Criteria andDataNoEqualTo(Integer value) {
            addCriterion("data_no =", value, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoNotEqualTo(Integer value) {
            addCriterion("data_no <>", value, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoGreaterThan(Integer value) {
            addCriterion("data_no >", value, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_no >=", value, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoLessThan(Integer value) {
            addCriterion("data_no <", value, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoLessThanOrEqualTo(Integer value) {
            addCriterion("data_no <=", value, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoIn(List<Integer> values) {
            addCriterion("data_no in", values, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoNotIn(List<Integer> values) {
            addCriterion("data_no not in", values, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoBetween(Integer value1, Integer value2) {
            addCriterion("data_no between", value1, value2, "dataNo");
            return (Criteria) this;
        }

        public Criteria andDataNoNotBetween(Integer value1, Integer value2) {
            addCriterion("data_no not between", value1, value2, "dataNo");
            return (Criteria) this;
        }

        public Criteria andCaijiDateIsNull() {
            addCriterion("caiji_date is null");
            return (Criteria) this;
        }

        public Criteria andCaijiDateIsNotNull() {
            addCriterion("caiji_date is not null");
            return (Criteria) this;
        }

        public Criteria andCaijiDateEqualTo(Date value) {
            addCriterion("caiji_date =", value, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateNotEqualTo(Date value) {
            addCriterion("caiji_date <>", value, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateGreaterThan(Date value) {
            addCriterion("caiji_date >", value, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("caiji_date >=", value, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateLessThan(Date value) {
            addCriterion("caiji_date <", value, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateLessThanOrEqualTo(Date value) {
            addCriterion("caiji_date <=", value, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateIn(List<Date> values) {
            addCriterion("caiji_date in", values, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateNotIn(List<Date> values) {
            addCriterion("caiji_date not in", values, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateBetween(Date value1, Date value2) {
            addCriterion("caiji_date between", value1, value2, "caijiDate");
            return (Criteria) this;
        }

        public Criteria andCaijiDateNotBetween(Date value1, Date value2) {
            addCriterion("caiji_date not between", value1, value2, "caijiDate");
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