package com.retloh.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonExample() {
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPatNameIsNull() {
            addCriterion("pat_name is null");
            return (Criteria) this;
        }

        public Criteria andPatNameIsNotNull() {
            addCriterion("pat_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatNameEqualTo(String value) {
            addCriterion("pat_name =", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotEqualTo(String value) {
            addCriterion("pat_name <>", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameGreaterThan(String value) {
            addCriterion("pat_name >", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameGreaterThanOrEqualTo(String value) {
            addCriterion("pat_name >=", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameLessThan(String value) {
            addCriterion("pat_name <", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameLessThanOrEqualTo(String value) {
            addCriterion("pat_name <=", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameLike(String value) {
            addCriterion("pat_name like", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotLike(String value) {
            addCriterion("pat_name not like", value, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameIn(List<String> values) {
            addCriterion("pat_name in", values, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotIn(List<String> values) {
            addCriterion("pat_name not in", values, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameBetween(String value1, String value2) {
            addCriterion("pat_name between", value1, value2, "patName");
            return (Criteria) this;
        }

        public Criteria andPatNameNotBetween(String value1, String value2) {
            addCriterion("pat_name not between", value1, value2, "patName");
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

        public Criteria andTellIsNull() {
            addCriterion("tell is null");
            return (Criteria) this;
        }

        public Criteria andTellIsNotNull() {
            addCriterion("tell is not null");
            return (Criteria) this;
        }

        public Criteria andTellEqualTo(String value) {
            addCriterion("tell =", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotEqualTo(String value) {
            addCriterion("tell <>", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellGreaterThan(String value) {
            addCriterion("tell >", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellGreaterThanOrEqualTo(String value) {
            addCriterion("tell >=", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLessThan(String value) {
            addCriterion("tell <", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLessThanOrEqualTo(String value) {
            addCriterion("tell <=", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLike(String value) {
            addCriterion("tell like", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotLike(String value) {
            addCriterion("tell not like", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellIn(List<String> values) {
            addCriterion("tell in", values, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotIn(List<String> values) {
            addCriterion("tell not in", values, "tell");
            return (Criteria) this;
        }

        public Criteria andTellBetween(String value1, String value2) {
            addCriterion("tell between", value1, value2, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotBetween(String value1, String value2) {
            addCriterion("tell not between", value1, value2, "tell");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andSocialIdIsNull() {
            addCriterion("social_id is null");
            return (Criteria) this;
        }

        public Criteria andSocialIdIsNotNull() {
            addCriterion("social_id is not null");
            return (Criteria) this;
        }

        public Criteria andSocialIdEqualTo(String value) {
            addCriterion("social_id =", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotEqualTo(String value) {
            addCriterion("social_id <>", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdGreaterThan(String value) {
            addCriterion("social_id >", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdGreaterThanOrEqualTo(String value) {
            addCriterion("social_id >=", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLessThan(String value) {
            addCriterion("social_id <", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLessThanOrEqualTo(String value) {
            addCriterion("social_id <=", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLike(String value) {
            addCriterion("social_id like", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotLike(String value) {
            addCriterion("social_id not like", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdIn(List<String> values) {
            addCriterion("social_id in", values, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotIn(List<String> values) {
            addCriterion("social_id not in", values, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdBetween(String value1, String value2) {
            addCriterion("social_id between", value1, value2, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotBetween(String value1, String value2) {
            addCriterion("social_id not between", value1, value2, "socialId");
            return (Criteria) this;
        }

        public Criteria andHsNameIsNull() {
            addCriterion("hs_name is null");
            return (Criteria) this;
        }

        public Criteria andHsNameIsNotNull() {
            addCriterion("hs_name is not null");
            return (Criteria) this;
        }

        public Criteria andHsNameEqualTo(String value) {
            addCriterion("hs_name =", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameNotEqualTo(String value) {
            addCriterion("hs_name <>", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameGreaterThan(String value) {
            addCriterion("hs_name >", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameGreaterThanOrEqualTo(String value) {
            addCriterion("hs_name >=", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameLessThan(String value) {
            addCriterion("hs_name <", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameLessThanOrEqualTo(String value) {
            addCriterion("hs_name <=", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameLike(String value) {
            addCriterion("hs_name like", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameNotLike(String value) {
            addCriterion("hs_name not like", value, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameIn(List<String> values) {
            addCriterion("hs_name in", values, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameNotIn(List<String> values) {
            addCriterion("hs_name not in", values, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameBetween(String value1, String value2) {
            addCriterion("hs_name between", value1, value2, "hsName");
            return (Criteria) this;
        }

        public Criteria andHsNameNotBetween(String value1, String value2) {
            addCriterion("hs_name not between", value1, value2, "hsName");
            return (Criteria) this;
        }

        public Criteria andPatNoIsNull() {
            addCriterion("pat_no is null");
            return (Criteria) this;
        }

        public Criteria andPatNoIsNotNull() {
            addCriterion("pat_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatNoEqualTo(String value) {
            addCriterion("pat_no =", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotEqualTo(String value) {
            addCriterion("pat_no <>", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoGreaterThan(String value) {
            addCriterion("pat_no >", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoGreaterThanOrEqualTo(String value) {
            addCriterion("pat_no >=", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoLessThan(String value) {
            addCriterion("pat_no <", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoLessThanOrEqualTo(String value) {
            addCriterion("pat_no <=", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoLike(String value) {
            addCriterion("pat_no like", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotLike(String value) {
            addCriterion("pat_no not like", value, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoIn(List<String> values) {
            addCriterion("pat_no in", values, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotIn(List<String> values) {
            addCriterion("pat_no not in", values, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoBetween(String value1, String value2) {
            addCriterion("pat_no between", value1, value2, "patNo");
            return (Criteria) this;
        }

        public Criteria andPatNoNotBetween(String value1, String value2) {
            addCriterion("pat_no not between", value1, value2, "patNo");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andPgTypeIsNull() {
            addCriterion("pg_type is null");
            return (Criteria) this;
        }

        public Criteria andPgTypeIsNotNull() {
            addCriterion("pg_type is not null");
            return (Criteria) this;
        }

        public Criteria andPgTypeEqualTo(String value) {
            addCriterion("pg_type =", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeNotEqualTo(String value) {
            addCriterion("pg_type <>", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeGreaterThan(String value) {
            addCriterion("pg_type >", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pg_type >=", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeLessThan(String value) {
            addCriterion("pg_type <", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeLessThanOrEqualTo(String value) {
            addCriterion("pg_type <=", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeLike(String value) {
            addCriterion("pg_type like", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeNotLike(String value) {
            addCriterion("pg_type not like", value, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeIn(List<String> values) {
            addCriterion("pg_type in", values, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeNotIn(List<String> values) {
            addCriterion("pg_type not in", values, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeBetween(String value1, String value2) {
            addCriterion("pg_type between", value1, value2, "pgType");
            return (Criteria) this;
        }

        public Criteria andPgTypeNotBetween(String value1, String value2) {
            addCriterion("pg_type not between", value1, value2, "pgType");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNull() {
            addCriterion("up_id is null");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNotNull() {
            addCriterion("up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpIdEqualTo(String value) {
            addCriterion("up_id =", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotEqualTo(String value) {
            addCriterion("up_id <>", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThan(String value) {
            addCriterion("up_id >", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThanOrEqualTo(String value) {
            addCriterion("up_id >=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThan(String value) {
            addCriterion("up_id <", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThanOrEqualTo(String value) {
            addCriterion("up_id <=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLike(String value) {
            addCriterion("up_id like", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotLike(String value) {
            addCriterion("up_id not like", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdIn(List<String> values) {
            addCriterion("up_id in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotIn(List<String> values) {
            addCriterion("up_id not in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdBetween(String value1, String value2) {
            addCriterion("up_id between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotBetween(String value1, String value2) {
            addCriterion("up_id not between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNull() {
            addCriterion("up_name is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("up_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("up_name =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("up_name <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("up_name >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("up_name >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("up_name <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("up_name <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("up_name like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("up_name not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("up_name in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("up_name not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("up_name between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("up_name not between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andAnaIdIsNull() {
            addCriterion("ana_id is null");
            return (Criteria) this;
        }

        public Criteria andAnaIdIsNotNull() {
            addCriterion("ana_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnaIdEqualTo(String value) {
            addCriterion("ana_id =", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdNotEqualTo(String value) {
            addCriterion("ana_id <>", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdGreaterThan(String value) {
            addCriterion("ana_id >", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdGreaterThanOrEqualTo(String value) {
            addCriterion("ana_id >=", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdLessThan(String value) {
            addCriterion("ana_id <", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdLessThanOrEqualTo(String value) {
            addCriterion("ana_id <=", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdLike(String value) {
            addCriterion("ana_id like", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdNotLike(String value) {
            addCriterion("ana_id not like", value, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdIn(List<String> values) {
            addCriterion("ana_id in", values, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdNotIn(List<String> values) {
            addCriterion("ana_id not in", values, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdBetween(String value1, String value2) {
            addCriterion("ana_id between", value1, value2, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaIdNotBetween(String value1, String value2) {
            addCriterion("ana_id not between", value1, value2, "anaId");
            return (Criteria) this;
        }

        public Criteria andAnaNameIsNull() {
            addCriterion("ana_name is null");
            return (Criteria) this;
        }

        public Criteria andAnaNameIsNotNull() {
            addCriterion("ana_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnaNameEqualTo(String value) {
            addCriterion("ana_name =", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameNotEqualTo(String value) {
            addCriterion("ana_name <>", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameGreaterThan(String value) {
            addCriterion("ana_name >", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameGreaterThanOrEqualTo(String value) {
            addCriterion("ana_name >=", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameLessThan(String value) {
            addCriterion("ana_name <", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameLessThanOrEqualTo(String value) {
            addCriterion("ana_name <=", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameLike(String value) {
            addCriterion("ana_name like", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameNotLike(String value) {
            addCriterion("ana_name not like", value, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameIn(List<String> values) {
            addCriterion("ana_name in", values, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameNotIn(List<String> values) {
            addCriterion("ana_name not in", values, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameBetween(String value1, String value2) {
            addCriterion("ana_name between", value1, value2, "anaName");
            return (Criteria) this;
        }

        public Criteria andAnaNameNotBetween(String value1, String value2) {
            addCriterion("ana_name not between", value1, value2, "anaName");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("up_time not between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeIsNull() {
            addCriterion("down_time is null");
            return (Criteria) this;
        }

        public Criteria andDownTimeIsNotNull() {
            addCriterion("down_time is not null");
            return (Criteria) this;
        }

        public Criteria andDownTimeEqualTo(Date value) {
            addCriterion("down_time =", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotEqualTo(Date value) {
            addCriterion("down_time <>", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeGreaterThan(Date value) {
            addCriterion("down_time >", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("down_time >=", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeLessThan(Date value) {
            addCriterion("down_time <", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeLessThanOrEqualTo(Date value) {
            addCriterion("down_time <=", value, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeIn(List<Date> values) {
            addCriterion("down_time in", values, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotIn(List<Date> values) {
            addCriterion("down_time not in", values, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeBetween(Date value1, Date value2) {
            addCriterion("down_time between", value1, value2, "downTime");
            return (Criteria) this;
        }

        public Criteria andDownTimeNotBetween(Date value1, Date value2) {
            addCriterion("down_time not between", value1, value2, "downTime");
            return (Criteria) this;
        }

        public Criteria andNetFlagIsNull() {
            addCriterion("net_flag is null");
            return (Criteria) this;
        }

        public Criteria andNetFlagIsNotNull() {
            addCriterion("net_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNetFlagEqualTo(Integer value) {
            addCriterion("net_flag =", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagNotEqualTo(Integer value) {
            addCriterion("net_flag <>", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagGreaterThan(Integer value) {
            addCriterion("net_flag >", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_flag >=", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagLessThan(Integer value) {
            addCriterion("net_flag <", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagLessThanOrEqualTo(Integer value) {
            addCriterion("net_flag <=", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagIn(List<Integer> values) {
            addCriterion("net_flag in", values, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagNotIn(List<Integer> values) {
            addCriterion("net_flag not in", values, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagBetween(Integer value1, Integer value2) {
            addCriterion("net_flag between", value1, value2, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("net_flag not between", value1, value2, "netFlag");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNull() {
            addCriterion("special is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNotNull() {
            addCriterion("special is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEqualTo(String value) {
            addCriterion("special =", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotEqualTo(String value) {
            addCriterion("special <>", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThan(String value) {
            addCriterion("special >", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("special >=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThan(String value) {
            addCriterion("special <", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThanOrEqualTo(String value) {
            addCriterion("special <=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLike(String value) {
            addCriterion("special like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotLike(String value) {
            addCriterion("special not like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialIn(List<String> values) {
            addCriterion("special in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotIn(List<String> values) {
            addCriterion("special not in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialBetween(String value1, String value2) {
            addCriterion("special between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotBetween(String value1, String value2) {
            addCriterion("special not between", value1, value2, "special");
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileIsNull() {
            addCriterion("analysed_file is null");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileIsNotNull() {
            addCriterion("analysed_file is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileEqualTo(String value) {
            addCriterion("analysed_file =", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileNotEqualTo(String value) {
            addCriterion("analysed_file <>", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileGreaterThan(String value) {
            addCriterion("analysed_file >", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileGreaterThanOrEqualTo(String value) {
            addCriterion("analysed_file >=", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileLessThan(String value) {
            addCriterion("analysed_file <", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileLessThanOrEqualTo(String value) {
            addCriterion("analysed_file <=", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileLike(String value) {
            addCriterion("analysed_file like", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileNotLike(String value) {
            addCriterion("analysed_file not like", value, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileIn(List<String> values) {
            addCriterion("analysed_file in", values, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileNotIn(List<String> values) {
            addCriterion("analysed_file not in", values, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileBetween(String value1, String value2) {
            addCriterion("analysed_file between", value1, value2, "analysedFile");
            return (Criteria) this;
        }

        public Criteria andAnalysedFileNotBetween(String value1, String value2) {
            addCriterion("analysed_file not between", value1, value2, "analysedFile");
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

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andParam0IsNull() {
            addCriterion("param0 is null");
            return (Criteria) this;
        }

        public Criteria andParam0IsNotNull() {
            addCriterion("param0 is not null");
            return (Criteria) this;
        }

        public Criteria andParam0EqualTo(String value) {
            addCriterion("param0 =", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0NotEqualTo(String value) {
            addCriterion("param0 <>", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0GreaterThan(String value) {
            addCriterion("param0 >", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0GreaterThanOrEqualTo(String value) {
            addCriterion("param0 >=", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0LessThan(String value) {
            addCriterion("param0 <", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0LessThanOrEqualTo(String value) {
            addCriterion("param0 <=", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0Like(String value) {
            addCriterion("param0 like", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0NotLike(String value) {
            addCriterion("param0 not like", value, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0In(List<String> values) {
            addCriterion("param0 in", values, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0NotIn(List<String> values) {
            addCriterion("param0 not in", values, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0Between(String value1, String value2) {
            addCriterion("param0 between", value1, value2, "param0");
            return (Criteria) this;
        }

        public Criteria andParam0NotBetween(String value1, String value2) {
            addCriterion("param0 not between", value1, value2, "param0");
            return (Criteria) this;
        }

        public Criteria andParam1IsNull() {
            addCriterion("param1 is null");
            return (Criteria) this;
        }

        public Criteria andParam1IsNotNull() {
            addCriterion("param1 is not null");
            return (Criteria) this;
        }

        public Criteria andParam1EqualTo(String value) {
            addCriterion("param1 =", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotEqualTo(String value) {
            addCriterion("param1 <>", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThan(String value) {
            addCriterion("param1 >", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThanOrEqualTo(String value) {
            addCriterion("param1 >=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThan(String value) {
            addCriterion("param1 <", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThanOrEqualTo(String value) {
            addCriterion("param1 <=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Like(String value) {
            addCriterion("param1 like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotLike(String value) {
            addCriterion("param1 not like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1In(List<String> values) {
            addCriterion("param1 in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotIn(List<String> values) {
            addCriterion("param1 not in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Between(String value1, String value2) {
            addCriterion("param1 between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotBetween(String value1, String value2) {
            addCriterion("param1 not between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam2IsNull() {
            addCriterion("param2 is null");
            return (Criteria) this;
        }

        public Criteria andParam2IsNotNull() {
            addCriterion("param2 is not null");
            return (Criteria) this;
        }

        public Criteria andParam2EqualTo(String value) {
            addCriterion("param2 =", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotEqualTo(String value) {
            addCriterion("param2 <>", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThan(String value) {
            addCriterion("param2 >", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThanOrEqualTo(String value) {
            addCriterion("param2 >=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThan(String value) {
            addCriterion("param2 <", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThanOrEqualTo(String value) {
            addCriterion("param2 <=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Like(String value) {
            addCriterion("param2 like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotLike(String value) {
            addCriterion("param2 not like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2In(List<String> values) {
            addCriterion("param2 in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotIn(List<String> values) {
            addCriterion("param2 not in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Between(String value1, String value2) {
            addCriterion("param2 between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotBetween(String value1, String value2) {
            addCriterion("param2 not between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam3IsNull() {
            addCriterion("param3 is null");
            return (Criteria) this;
        }

        public Criteria andParam3IsNotNull() {
            addCriterion("param3 is not null");
            return (Criteria) this;
        }

        public Criteria andParam3EqualTo(String value) {
            addCriterion("param3 =", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotEqualTo(String value) {
            addCriterion("param3 <>", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThan(String value) {
            addCriterion("param3 >", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThanOrEqualTo(String value) {
            addCriterion("param3 >=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThan(String value) {
            addCriterion("param3 <", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThanOrEqualTo(String value) {
            addCriterion("param3 <=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Like(String value) {
            addCriterion("param3 like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotLike(String value) {
            addCriterion("param3 not like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3In(List<String> values) {
            addCriterion("param3 in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotIn(List<String> values) {
            addCriterion("param3 not in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Between(String value1, String value2) {
            addCriterion("param3 between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotBetween(String value1, String value2) {
            addCriterion("param3 not between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam4IsNull() {
            addCriterion("param4 is null");
            return (Criteria) this;
        }

        public Criteria andParam4IsNotNull() {
            addCriterion("param4 is not null");
            return (Criteria) this;
        }

        public Criteria andParam4EqualTo(String value) {
            addCriterion("param4 =", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotEqualTo(String value) {
            addCriterion("param4 <>", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThan(String value) {
            addCriterion("param4 >", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThanOrEqualTo(String value) {
            addCriterion("param4 >=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThan(String value) {
            addCriterion("param4 <", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThanOrEqualTo(String value) {
            addCriterion("param4 <=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Like(String value) {
            addCriterion("param4 like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotLike(String value) {
            addCriterion("param4 not like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4In(List<String> values) {
            addCriterion("param4 in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotIn(List<String> values) {
            addCriterion("param4 not in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Between(String value1, String value2) {
            addCriterion("param4 between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotBetween(String value1, String value2) {
            addCriterion("param4 not between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam5IsNull() {
            addCriterion("param5 is null");
            return (Criteria) this;
        }

        public Criteria andParam5IsNotNull() {
            addCriterion("param5 is not null");
            return (Criteria) this;
        }

        public Criteria andParam5EqualTo(String value) {
            addCriterion("param5 =", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotEqualTo(String value) {
            addCriterion("param5 <>", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThan(String value) {
            addCriterion("param5 >", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5GreaterThanOrEqualTo(String value) {
            addCriterion("param5 >=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThan(String value) {
            addCriterion("param5 <", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5LessThanOrEqualTo(String value) {
            addCriterion("param5 <=", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Like(String value) {
            addCriterion("param5 like", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotLike(String value) {
            addCriterion("param5 not like", value, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5In(List<String> values) {
            addCriterion("param5 in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotIn(List<String> values) {
            addCriterion("param5 not in", values, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5Between(String value1, String value2) {
            addCriterion("param5 between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam5NotBetween(String value1, String value2) {
            addCriterion("param5 not between", value1, value2, "param5");
            return (Criteria) this;
        }

        public Criteria andParam6IsNull() {
            addCriterion("param6 is null");
            return (Criteria) this;
        }

        public Criteria andParam6IsNotNull() {
            addCriterion("param6 is not null");
            return (Criteria) this;
        }

        public Criteria andParam6EqualTo(String value) {
            addCriterion("param6 =", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotEqualTo(String value) {
            addCriterion("param6 <>", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6GreaterThan(String value) {
            addCriterion("param6 >", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6GreaterThanOrEqualTo(String value) {
            addCriterion("param6 >=", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6LessThan(String value) {
            addCriterion("param6 <", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6LessThanOrEqualTo(String value) {
            addCriterion("param6 <=", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6Like(String value) {
            addCriterion("param6 like", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotLike(String value) {
            addCriterion("param6 not like", value, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6In(List<String> values) {
            addCriterion("param6 in", values, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotIn(List<String> values) {
            addCriterion("param6 not in", values, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6Between(String value1, String value2) {
            addCriterion("param6 between", value1, value2, "param6");
            return (Criteria) this;
        }

        public Criteria andParam6NotBetween(String value1, String value2) {
            addCriterion("param6 not between", value1, value2, "param6");
            return (Criteria) this;
        }

        public Criteria andParam7IsNull() {
            addCriterion("param7 is null");
            return (Criteria) this;
        }

        public Criteria andParam7IsNotNull() {
            addCriterion("param7 is not null");
            return (Criteria) this;
        }

        public Criteria andParam7EqualTo(String value) {
            addCriterion("param7 =", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotEqualTo(String value) {
            addCriterion("param7 <>", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7GreaterThan(String value) {
            addCriterion("param7 >", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7GreaterThanOrEqualTo(String value) {
            addCriterion("param7 >=", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7LessThan(String value) {
            addCriterion("param7 <", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7LessThanOrEqualTo(String value) {
            addCriterion("param7 <=", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7Like(String value) {
            addCriterion("param7 like", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotLike(String value) {
            addCriterion("param7 not like", value, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7In(List<String> values) {
            addCriterion("param7 in", values, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotIn(List<String> values) {
            addCriterion("param7 not in", values, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7Between(String value1, String value2) {
            addCriterion("param7 between", value1, value2, "param7");
            return (Criteria) this;
        }

        public Criteria andParam7NotBetween(String value1, String value2) {
            addCriterion("param7 not between", value1, value2, "param7");
            return (Criteria) this;
        }

        public Criteria andParam8IsNull() {
            addCriterion("param8 is null");
            return (Criteria) this;
        }

        public Criteria andParam8IsNotNull() {
            addCriterion("param8 is not null");
            return (Criteria) this;
        }

        public Criteria andParam8EqualTo(String value) {
            addCriterion("param8 =", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotEqualTo(String value) {
            addCriterion("param8 <>", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8GreaterThan(String value) {
            addCriterion("param8 >", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8GreaterThanOrEqualTo(String value) {
            addCriterion("param8 >=", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8LessThan(String value) {
            addCriterion("param8 <", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8LessThanOrEqualTo(String value) {
            addCriterion("param8 <=", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8Like(String value) {
            addCriterion("param8 like", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotLike(String value) {
            addCriterion("param8 not like", value, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8In(List<String> values) {
            addCriterion("param8 in", values, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotIn(List<String> values) {
            addCriterion("param8 not in", values, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8Between(String value1, String value2) {
            addCriterion("param8 between", value1, value2, "param8");
            return (Criteria) this;
        }

        public Criteria andParam8NotBetween(String value1, String value2) {
            addCriterion("param8 not between", value1, value2, "param8");
            return (Criteria) this;
        }

        public Criteria andParam9IsNull() {
            addCriterion("param9 is null");
            return (Criteria) this;
        }

        public Criteria andParam9IsNotNull() {
            addCriterion("param9 is not null");
            return (Criteria) this;
        }

        public Criteria andParam9EqualTo(String value) {
            addCriterion("param9 =", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotEqualTo(String value) {
            addCriterion("param9 <>", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9GreaterThan(String value) {
            addCriterion("param9 >", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9GreaterThanOrEqualTo(String value) {
            addCriterion("param9 >=", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9LessThan(String value) {
            addCriterion("param9 <", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9LessThanOrEqualTo(String value) {
            addCriterion("param9 <=", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9Like(String value) {
            addCriterion("param9 like", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotLike(String value) {
            addCriterion("param9 not like", value, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9In(List<String> values) {
            addCriterion("param9 in", values, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotIn(List<String> values) {
            addCriterion("param9 not in", values, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9Between(String value1, String value2) {
            addCriterion("param9 between", value1, value2, "param9");
            return (Criteria) this;
        }

        public Criteria andParam9NotBetween(String value1, String value2) {
            addCriterion("param9 not between", value1, value2, "param9");
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