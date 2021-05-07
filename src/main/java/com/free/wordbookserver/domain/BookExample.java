package com.free.wordbookserver.domain;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andEntitleIsNull() {
            addCriterion("enTitle is null");
            return (Criteria) this;
        }

        public Criteria andEntitleIsNotNull() {
            addCriterion("enTitle is not null");
            return (Criteria) this;
        }

        public Criteria andEntitleEqualTo(String value) {
            addCriterion("enTitle =", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleNotEqualTo(String value) {
            addCriterion("enTitle <>", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleGreaterThan(String value) {
            addCriterion("enTitle >", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleGreaterThanOrEqualTo(String value) {
            addCriterion("enTitle >=", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleLessThan(String value) {
            addCriterion("enTitle <", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleLessThanOrEqualTo(String value) {
            addCriterion("enTitle <=", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleLike(String value) {
            addCriterion("enTitle like", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleNotLike(String value) {
            addCriterion("enTitle not like", value, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleIn(List<String> values) {
            addCriterion("enTitle in", values, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleNotIn(List<String> values) {
            addCriterion("enTitle not in", values, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleBetween(String value1, String value2) {
            addCriterion("enTitle between", value1, value2, "entitle");
            return (Criteria) this;
        }

        public Criteria andEntitleNotBetween(String value1, String value2) {
            addCriterion("enTitle not between", value1, value2, "entitle");
            return (Criteria) this;
        }

        public Criteria andCntitleIsNull() {
            addCriterion("cnTitle is null");
            return (Criteria) this;
        }

        public Criteria andCntitleIsNotNull() {
            addCriterion("cnTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCntitleEqualTo(String value) {
            addCriterion("cnTitle =", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleNotEqualTo(String value) {
            addCriterion("cnTitle <>", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleGreaterThan(String value) {
            addCriterion("cnTitle >", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleGreaterThanOrEqualTo(String value) {
            addCriterion("cnTitle >=", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleLessThan(String value) {
            addCriterion("cnTitle <", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleLessThanOrEqualTo(String value) {
            addCriterion("cnTitle <=", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleLike(String value) {
            addCriterion("cnTitle like", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleNotLike(String value) {
            addCriterion("cnTitle not like", value, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleIn(List<String> values) {
            addCriterion("cnTitle in", values, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleNotIn(List<String> values) {
            addCriterion("cnTitle not in", values, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleBetween(String value1, String value2) {
            addCriterion("cnTitle between", value1, value2, "cntitle");
            return (Criteria) this;
        }

        public Criteria andCntitleNotBetween(String value1, String value2) {
            addCriterion("cnTitle not between", value1, value2, "cntitle");
            return (Criteria) this;
        }

        public Criteria andEnauthornameIsNull() {
            addCriterion("enAuthorName is null");
            return (Criteria) this;
        }

        public Criteria andEnauthornameIsNotNull() {
            addCriterion("enAuthorName is not null");
            return (Criteria) this;
        }

        public Criteria andEnauthornameEqualTo(String value) {
            addCriterion("enAuthorName =", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameNotEqualTo(String value) {
            addCriterion("enAuthorName <>", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameGreaterThan(String value) {
            addCriterion("enAuthorName >", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameGreaterThanOrEqualTo(String value) {
            addCriterion("enAuthorName >=", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameLessThan(String value) {
            addCriterion("enAuthorName <", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameLessThanOrEqualTo(String value) {
            addCriterion("enAuthorName <=", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameLike(String value) {
            addCriterion("enAuthorName like", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameNotLike(String value) {
            addCriterion("enAuthorName not like", value, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameIn(List<String> values) {
            addCriterion("enAuthorName in", values, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameNotIn(List<String> values) {
            addCriterion("enAuthorName not in", values, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameBetween(String value1, String value2) {
            addCriterion("enAuthorName between", value1, value2, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andEnauthornameNotBetween(String value1, String value2) {
            addCriterion("enAuthorName not between", value1, value2, "enauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameIsNull() {
            addCriterion("cnAuthorName is null");
            return (Criteria) this;
        }

        public Criteria andCnauthornameIsNotNull() {
            addCriterion("cnAuthorName is not null");
            return (Criteria) this;
        }

        public Criteria andCnauthornameEqualTo(String value) {
            addCriterion("cnAuthorName =", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameNotEqualTo(String value) {
            addCriterion("cnAuthorName <>", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameGreaterThan(String value) {
            addCriterion("cnAuthorName >", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameGreaterThanOrEqualTo(String value) {
            addCriterion("cnAuthorName >=", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameLessThan(String value) {
            addCriterion("cnAuthorName <", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameLessThanOrEqualTo(String value) {
            addCriterion("cnAuthorName <=", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameLike(String value) {
            addCriterion("cnAuthorName like", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameNotLike(String value) {
            addCriterion("cnAuthorName not like", value, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameIn(List<String> values) {
            addCriterion("cnAuthorName in", values, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameNotIn(List<String> values) {
            addCriterion("cnAuthorName not in", values, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameBetween(String value1, String value2) {
            addCriterion("cnAuthorName between", value1, value2, "cnauthorname");
            return (Criteria) this;
        }

        public Criteria andCnauthornameNotBetween(String value1, String value2) {
            addCriterion("cnAuthorName not between", value1, value2, "cnauthorname");
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