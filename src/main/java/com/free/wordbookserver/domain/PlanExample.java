package com.free.wordbookserver.domain;

import java.util.ArrayList;
import java.util.List;

public class PlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andWordTotalIsNull() {
            addCriterion("word_total is null");
            return (Criteria) this;
        }

        public Criteria andWordTotalIsNotNull() {
            addCriterion("word_total is not null");
            return (Criteria) this;
        }

        public Criteria andWordTotalEqualTo(String value) {
            addCriterion("word_total =", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalNotEqualTo(String value) {
            addCriterion("word_total <>", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalGreaterThan(String value) {
            addCriterion("word_total >", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalGreaterThanOrEqualTo(String value) {
            addCriterion("word_total >=", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalLessThan(String value) {
            addCriterion("word_total <", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalLessThanOrEqualTo(String value) {
            addCriterion("word_total <=", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalLike(String value) {
            addCriterion("word_total like", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalNotLike(String value) {
            addCriterion("word_total not like", value, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalIn(List<String> values) {
            addCriterion("word_total in", values, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalNotIn(List<String> values) {
            addCriterion("word_total not in", values, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalBetween(String value1, String value2) {
            addCriterion("word_total between", value1, value2, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andWordTotalNotBetween(String value1, String value2) {
            addCriterion("word_total not between", value1, value2, "wordTotal");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(String value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(String value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(String value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(String value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(String value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(String value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLike(String value) {
            addCriterion("days like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotLike(String value) {
            addCriterion("days not like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<String> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<String> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(String value1, String value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(String value1, String value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andAverageIsNull() {
            addCriterion("average is null");
            return (Criteria) this;
        }

        public Criteria andAverageIsNotNull() {
            addCriterion("average is not null");
            return (Criteria) this;
        }

        public Criteria andAverageEqualTo(String value) {
            addCriterion("average =", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotEqualTo(String value) {
            addCriterion("average <>", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageGreaterThan(String value) {
            addCriterion("average >", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageGreaterThanOrEqualTo(String value) {
            addCriterion("average >=", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLessThan(String value) {
            addCriterion("average <", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLessThanOrEqualTo(String value) {
            addCriterion("average <=", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLike(String value) {
            addCriterion("average like", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotLike(String value) {
            addCriterion("average not like", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageIn(List<String> values) {
            addCriterion("average in", values, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotIn(List<String> values) {
            addCriterion("average not in", values, "average");
            return (Criteria) this;
        }

        public Criteria andAverageBetween(String value1, String value2) {
            addCriterion("average between", value1, value2, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotBetween(String value1, String value2) {
            addCriterion("average not between", value1, value2, "average");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("finished is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("finished is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(String value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(String value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(String value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(String value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(String value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(String value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLike(String value) {
            addCriterion("finished like", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotLike(String value) {
            addCriterion("finished not like", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<String> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<String> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(String value1, String value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(String value1, String value2) {
            addCriterion("finished not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andUseddayIsNull() {
            addCriterion("usedday is null");
            return (Criteria) this;
        }

        public Criteria andUseddayIsNotNull() {
            addCriterion("usedday is not null");
            return (Criteria) this;
        }

        public Criteria andUseddayEqualTo(String value) {
            addCriterion("usedday =", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayNotEqualTo(String value) {
            addCriterion("usedday <>", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayGreaterThan(String value) {
            addCriterion("usedday >", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayGreaterThanOrEqualTo(String value) {
            addCriterion("usedday >=", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayLessThan(String value) {
            addCriterion("usedday <", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayLessThanOrEqualTo(String value) {
            addCriterion("usedday <=", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayLike(String value) {
            addCriterion("usedday like", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayNotLike(String value) {
            addCriterion("usedday not like", value, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayIn(List<String> values) {
            addCriterion("usedday in", values, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayNotIn(List<String> values) {
            addCriterion("usedday not in", values, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayBetween(String value1, String value2) {
            addCriterion("usedday between", value1, value2, "usedday");
            return (Criteria) this;
        }

        public Criteria andUseddayNotBetween(String value1, String value2) {
            addCriterion("usedday not between", value1, value2, "usedday");
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