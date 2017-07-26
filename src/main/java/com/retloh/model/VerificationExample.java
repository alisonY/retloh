package com.retloh.model;

import java.util.ArrayList;
import java.util.List;

public class VerificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VerificationExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommonidIsNull() {
            addCriterion("commonid is null");
            return (Criteria) this;
        }

        public Criteria andCommonidIsNotNull() {
            addCriterion("commonid is not null");
            return (Criteria) this;
        }

        public Criteria andCommonidEqualTo(String value) {
            addCriterion("commonid =", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotEqualTo(String value) {
            addCriterion("commonid <>", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidGreaterThan(String value) {
            addCriterion("commonid >", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidGreaterThanOrEqualTo(String value) {
            addCriterion("commonid >=", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidLessThan(String value) {
            addCriterion("commonid <", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidLessThanOrEqualTo(String value) {
            addCriterion("commonid <=", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidLike(String value) {
            addCriterion("commonid like", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotLike(String value) {
            addCriterion("commonid not like", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidIn(List<String> values) {
            addCriterion("commonid in", values, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotIn(List<String> values) {
            addCriterion("commonid not in", values, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidBetween(String value1, String value2) {
            addCriterion("commonid between", value1, value2, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotBetween(String value1, String value2) {
            addCriterion("commonid not between", value1, value2, "commonid");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andMd5sumIsNull() {
            addCriterion("md5sum is null");
            return (Criteria) this;
        }

        public Criteria andMd5sumIsNotNull() {
            addCriterion("md5sum is not null");
            return (Criteria) this;
        }

        public Criteria andMd5sumEqualTo(String value) {
            addCriterion("md5sum =", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotEqualTo(String value) {
            addCriterion("md5sum <>", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumGreaterThan(String value) {
            addCriterion("md5sum >", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumGreaterThanOrEqualTo(String value) {
            addCriterion("md5sum >=", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumLessThan(String value) {
            addCriterion("md5sum <", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumLessThanOrEqualTo(String value) {
            addCriterion("md5sum <=", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumLike(String value) {
            addCriterion("md5sum like", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotLike(String value) {
            addCriterion("md5sum not like", value, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumIn(List<String> values) {
            addCriterion("md5sum in", values, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotIn(List<String> values) {
            addCriterion("md5sum not in", values, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumBetween(String value1, String value2) {
            addCriterion("md5sum between", value1, value2, "md5sum");
            return (Criteria) this;
        }

        public Criteria andMd5sumNotBetween(String value1, String value2) {
            addCriterion("md5sum not between", value1, value2, "md5sum");
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