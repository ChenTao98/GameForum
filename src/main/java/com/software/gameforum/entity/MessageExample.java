package com.software.gameforum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MessageExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postid is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postid is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postid =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postid <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postid >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postid >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postid <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postid <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postid in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postid not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postid between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postid not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNull() {
            addCriterion("messageContent is null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIsNotNull() {
            addCriterion("messageContent is not null");
            return (Criteria) this;
        }

        public Criteria andMessagecontentEqualTo(String value) {
            addCriterion("messageContent =", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotEqualTo(String value) {
            addCriterion("messageContent <>", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThan(String value) {
            addCriterion("messageContent >", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentGreaterThanOrEqualTo(String value) {
            addCriterion("messageContent >=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThan(String value) {
            addCriterion("messageContent <", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLessThanOrEqualTo(String value) {
            addCriterion("messageContent <=", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentLike(String value) {
            addCriterion("messageContent like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotLike(String value) {
            addCriterion("messageContent not like", value, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentIn(List<String> values) {
            addCriterion("messageContent in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotIn(List<String> values) {
            addCriterion("messageContent not in", values, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentBetween(String value1, String value2) {
            addCriterion("messageContent between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andMessagecontentNotBetween(String value1, String value2) {
            addCriterion("messageContent not between", value1, value2, "messagecontent");
            return (Criteria) this;
        }

        public Criteria andAddoneIsNull() {
            addCriterion("addone is null");
            return (Criteria) this;
        }

        public Criteria andAddoneIsNotNull() {
            addCriterion("addone is not null");
            return (Criteria) this;
        }

        public Criteria andAddoneEqualTo(Integer value) {
            addCriterion("addone =", value, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneNotEqualTo(Integer value) {
            addCriterion("addone <>", value, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneGreaterThan(Integer value) {
            addCriterion("addone >", value, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("addone >=", value, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneLessThan(Integer value) {
            addCriterion("addone <", value, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneLessThanOrEqualTo(Integer value) {
            addCriterion("addone <=", value, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneIn(List<Integer> values) {
            addCriterion("addone in", values, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneNotIn(List<Integer> values) {
            addCriterion("addone not in", values, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneBetween(Integer value1, Integer value2) {
            addCriterion("addone between", value1, value2, "addone");
            return (Criteria) this;
        }

        public Criteria andAddoneNotBetween(Integer value1, Integer value2) {
            addCriterion("addone not between", value1, value2, "addone");
            return (Criteria) this;
        }

        public Criteria andAddtwoIsNull() {
            addCriterion("addtwo is null");
            return (Criteria) this;
        }

        public Criteria andAddtwoIsNotNull() {
            addCriterion("addtwo is not null");
            return (Criteria) this;
        }

        public Criteria andAddtwoEqualTo(String value) {
            addCriterion("addtwo =", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoNotEqualTo(String value) {
            addCriterion("addtwo <>", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoGreaterThan(String value) {
            addCriterion("addtwo >", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoGreaterThanOrEqualTo(String value) {
            addCriterion("addtwo >=", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoLessThan(String value) {
            addCriterion("addtwo <", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoLessThanOrEqualTo(String value) {
            addCriterion("addtwo <=", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoLike(String value) {
            addCriterion("addtwo like", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoNotLike(String value) {
            addCriterion("addtwo not like", value, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoIn(List<String> values) {
            addCriterion("addtwo in", values, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoNotIn(List<String> values) {
            addCriterion("addtwo not in", values, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoBetween(String value1, String value2) {
            addCriterion("addtwo between", value1, value2, "addtwo");
            return (Criteria) this;
        }

        public Criteria andAddtwoNotBetween(String value1, String value2) {
            addCriterion("addtwo not between", value1, value2, "addtwo");
            return (Criteria) this;
        }
    }

    /**
     */
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