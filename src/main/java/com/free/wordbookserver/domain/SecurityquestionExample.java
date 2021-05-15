package com.free.wordbookserver.domain;

import java.util.ArrayList;
import java.util.List;

public class SecurityquestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecurityquestionExample() {
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

        public Criteria andQuestiononeIsNull() {
            addCriterion("questionone is null");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIsNotNull() {
            addCriterion("questionone is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiononeEqualTo(String value) {
            addCriterion("questionone =", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotEqualTo(String value) {
            addCriterion("questionone <>", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeGreaterThan(String value) {
            addCriterion("questionone >", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeGreaterThanOrEqualTo(String value) {
            addCriterion("questionone >=", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLessThan(String value) {
            addCriterion("questionone <", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLessThanOrEqualTo(String value) {
            addCriterion("questionone <=", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeLike(String value) {
            addCriterion("questionone like", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotLike(String value) {
            addCriterion("questionone not like", value, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeIn(List<String> values) {
            addCriterion("questionone in", values, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotIn(List<String> values) {
            addCriterion("questionone not in", values, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeBetween(String value1, String value2) {
            addCriterion("questionone between", value1, value2, "questionone");
            return (Criteria) this;
        }

        public Criteria andQuestiononeNotBetween(String value1, String value2) {
            addCriterion("questionone not between", value1, value2, "questionone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneIsNull() {
            addCriterion("answerone is null");
            return (Criteria) this;
        }

        public Criteria andAnsweroneIsNotNull() {
            addCriterion("answerone is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweroneEqualTo(String value) {
            addCriterion("answerone =", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotEqualTo(String value) {
            addCriterion("answerone <>", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneGreaterThan(String value) {
            addCriterion("answerone >", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneGreaterThanOrEqualTo(String value) {
            addCriterion("answerone >=", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneLessThan(String value) {
            addCriterion("answerone <", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneLessThanOrEqualTo(String value) {
            addCriterion("answerone <=", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneLike(String value) {
            addCriterion("answerone like", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotLike(String value) {
            addCriterion("answerone not like", value, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneIn(List<String> values) {
            addCriterion("answerone in", values, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotIn(List<String> values) {
            addCriterion("answerone not in", values, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneBetween(String value1, String value2) {
            addCriterion("answerone between", value1, value2, "answerone");
            return (Criteria) this;
        }

        public Criteria andAnsweroneNotBetween(String value1, String value2) {
            addCriterion("answerone not between", value1, value2, "answerone");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoIsNull() {
            addCriterion("quesiontwo is null");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoIsNotNull() {
            addCriterion("quesiontwo is not null");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoEqualTo(String value) {
            addCriterion("quesiontwo =", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoNotEqualTo(String value) {
            addCriterion("quesiontwo <>", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoGreaterThan(String value) {
            addCriterion("quesiontwo >", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoGreaterThanOrEqualTo(String value) {
            addCriterion("quesiontwo >=", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoLessThan(String value) {
            addCriterion("quesiontwo <", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoLessThanOrEqualTo(String value) {
            addCriterion("quesiontwo <=", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoLike(String value) {
            addCriterion("quesiontwo like", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoNotLike(String value) {
            addCriterion("quesiontwo not like", value, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoIn(List<String> values) {
            addCriterion("quesiontwo in", values, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoNotIn(List<String> values) {
            addCriterion("quesiontwo not in", values, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoBetween(String value1, String value2) {
            addCriterion("quesiontwo between", value1, value2, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andQuesiontwoNotBetween(String value1, String value2) {
            addCriterion("quesiontwo not between", value1, value2, "quesiontwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoIsNull() {
            addCriterion("answertwo is null");
            return (Criteria) this;
        }

        public Criteria andAnswertwoIsNotNull() {
            addCriterion("answertwo is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertwoEqualTo(String value) {
            addCriterion("answertwo =", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotEqualTo(String value) {
            addCriterion("answertwo <>", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoGreaterThan(String value) {
            addCriterion("answertwo >", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoGreaterThanOrEqualTo(String value) {
            addCriterion("answertwo >=", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoLessThan(String value) {
            addCriterion("answertwo <", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoLessThanOrEqualTo(String value) {
            addCriterion("answertwo <=", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoLike(String value) {
            addCriterion("answertwo like", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotLike(String value) {
            addCriterion("answertwo not like", value, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoIn(List<String> values) {
            addCriterion("answertwo in", values, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotIn(List<String> values) {
            addCriterion("answertwo not in", values, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoBetween(String value1, String value2) {
            addCriterion("answertwo between", value1, value2, "answertwo");
            return (Criteria) this;
        }

        public Criteria andAnswertwoNotBetween(String value1, String value2) {
            addCriterion("answertwo not between", value1, value2, "answertwo");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeIsNull() {
            addCriterion("quesionthree is null");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeIsNotNull() {
            addCriterion("quesionthree is not null");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeEqualTo(String value) {
            addCriterion("quesionthree =", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeNotEqualTo(String value) {
            addCriterion("quesionthree <>", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeGreaterThan(String value) {
            addCriterion("quesionthree >", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeGreaterThanOrEqualTo(String value) {
            addCriterion("quesionthree >=", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeLessThan(String value) {
            addCriterion("quesionthree <", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeLessThanOrEqualTo(String value) {
            addCriterion("quesionthree <=", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeLike(String value) {
            addCriterion("quesionthree like", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeNotLike(String value) {
            addCriterion("quesionthree not like", value, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeIn(List<String> values) {
            addCriterion("quesionthree in", values, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeNotIn(List<String> values) {
            addCriterion("quesionthree not in", values, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeBetween(String value1, String value2) {
            addCriterion("quesionthree between", value1, value2, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andQuesionthreeNotBetween(String value1, String value2) {
            addCriterion("quesionthree not between", value1, value2, "quesionthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeIsNull() {
            addCriterion("answerthree is null");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeIsNotNull() {
            addCriterion("answerthree is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeEqualTo(String value) {
            addCriterion("answerthree =", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeNotEqualTo(String value) {
            addCriterion("answerthree <>", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeGreaterThan(String value) {
            addCriterion("answerthree >", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeGreaterThanOrEqualTo(String value) {
            addCriterion("answerthree >=", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeLessThan(String value) {
            addCriterion("answerthree <", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeLessThanOrEqualTo(String value) {
            addCriterion("answerthree <=", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeLike(String value) {
            addCriterion("answerthree like", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeNotLike(String value) {
            addCriterion("answerthree not like", value, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeIn(List<String> values) {
            addCriterion("answerthree in", values, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeNotIn(List<String> values) {
            addCriterion("answerthree not in", values, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeBetween(String value1, String value2) {
            addCriterion("answerthree between", value1, value2, "answerthree");
            return (Criteria) this;
        }

        public Criteria andAnswerthreeNotBetween(String value1, String value2) {
            addCriterion("answerthree not between", value1, value2, "answerthree");
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