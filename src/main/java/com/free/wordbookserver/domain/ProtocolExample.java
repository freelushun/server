package com.free.wordbookserver.domain;

import java.util.ArrayList;
import java.util.List;

public class ProtocolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProtocolExample() {
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

        public Criteria andProtocolIdIsNull() {
            addCriterion("protocol_id is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIsNotNull() {
            addCriterion("protocol_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdEqualTo(Integer value) {
            addCriterion("protocol_id =", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotEqualTo(Integer value) {
            addCriterion("protocol_id <>", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThan(Integer value) {
            addCriterion("protocol_id >", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocol_id >=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThan(Integer value) {
            addCriterion("protocol_id <", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThanOrEqualTo(Integer value) {
            addCriterion("protocol_id <=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIn(List<Integer> values) {
            addCriterion("protocol_id in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotIn(List<Integer> values) {
            addCriterion("protocol_id not in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdBetween(Integer value1, Integer value2) {
            addCriterion("protocol_id between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("protocol_id not between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolNameIsNull() {
            addCriterion("protocol_name is null");
            return (Criteria) this;
        }

        public Criteria andProtocolNameIsNotNull() {
            addCriterion("protocol_name is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolNameEqualTo(String value) {
            addCriterion("protocol_name =", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameNotEqualTo(String value) {
            addCriterion("protocol_name <>", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameGreaterThan(String value) {
            addCriterion("protocol_name >", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_name >=", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameLessThan(String value) {
            addCriterion("protocol_name <", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameLessThanOrEqualTo(String value) {
            addCriterion("protocol_name <=", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameLike(String value) {
            addCriterion("protocol_name like", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameNotLike(String value) {
            addCriterion("protocol_name not like", value, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameIn(List<String> values) {
            addCriterion("protocol_name in", values, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameNotIn(List<String> values) {
            addCriterion("protocol_name not in", values, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameBetween(String value1, String value2) {
            addCriterion("protocol_name between", value1, value2, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolNameNotBetween(String value1, String value2) {
            addCriterion("protocol_name not between", value1, value2, "protocolName");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentIsNull() {
            addCriterion("protocol_comment is null");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentIsNotNull() {
            addCriterion("protocol_comment is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentEqualTo(String value) {
            addCriterion("protocol_comment =", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentNotEqualTo(String value) {
            addCriterion("protocol_comment <>", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentGreaterThan(String value) {
            addCriterion("protocol_comment >", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_comment >=", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentLessThan(String value) {
            addCriterion("protocol_comment <", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentLessThanOrEqualTo(String value) {
            addCriterion("protocol_comment <=", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentLike(String value) {
            addCriterion("protocol_comment like", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentNotLike(String value) {
            addCriterion("protocol_comment not like", value, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentIn(List<String> values) {
            addCriterion("protocol_comment in", values, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentNotIn(List<String> values) {
            addCriterion("protocol_comment not in", values, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentBetween(String value1, String value2) {
            addCriterion("protocol_comment between", value1, value2, "protocolComment");
            return (Criteria) this;
        }

        public Criteria andProtocolCommentNotBetween(String value1, String value2) {
            addCriterion("protocol_comment not between", value1, value2, "protocolComment");
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