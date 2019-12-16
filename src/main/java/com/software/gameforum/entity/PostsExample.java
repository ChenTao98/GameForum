package com.software.gameforum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PostsExample() {
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andGameidIsNull() {
            addCriterion("gameid is null");
            return (Criteria) this;
        }

        public Criteria andGameidIsNotNull() {
            addCriterion("gameid is not null");
            return (Criteria) this;
        }

        public Criteria andGameidEqualTo(Integer value) {
            addCriterion("gameid =", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotEqualTo(Integer value) {
            addCriterion("gameid <>", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidGreaterThan(Integer value) {
            addCriterion("gameid >", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gameid >=", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLessThan(Integer value) {
            addCriterion("gameid <", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidLessThanOrEqualTo(Integer value) {
            addCriterion("gameid <=", value, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidIn(List<Integer> values) {
            addCriterion("gameid in", values, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotIn(List<Integer> values) {
            addCriterion("gameid not in", values, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidBetween(Integer value1, Integer value2) {
            addCriterion("gameid between", value1, value2, "gameid");
            return (Criteria) this;
        }

        public Criteria andGameidNotBetween(Integer value1, Integer value2) {
            addCriterion("gameid not between", value1, value2, "gameid");
            return (Criteria) this;
        }

        public Criteria andMsgnumIsNull() {
            addCriterion("msgnum is null");
            return (Criteria) this;
        }

        public Criteria andMsgnumIsNotNull() {
            addCriterion("msgnum is not null");
            return (Criteria) this;
        }

        public Criteria andMsgnumEqualTo(Integer value) {
            addCriterion("msgnum =", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumNotEqualTo(Integer value) {
            addCriterion("msgnum <>", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumGreaterThan(Integer value) {
            addCriterion("msgnum >", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgnum >=", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumLessThan(Integer value) {
            addCriterion("msgnum <", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumLessThanOrEqualTo(Integer value) {
            addCriterion("msgnum <=", value, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumIn(List<Integer> values) {
            addCriterion("msgnum in", values, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumNotIn(List<Integer> values) {
            addCriterion("msgnum not in", values, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumBetween(Integer value1, Integer value2) {
            addCriterion("msgnum between", value1, value2, "msgnum");
            return (Criteria) this;
        }

        public Criteria andMsgnumNotBetween(Integer value1, Integer value2) {
            addCriterion("msgnum not between", value1, value2, "msgnum");
            return (Criteria) this;
        }

        public Criteria andPraisenumIsNull() {
            addCriterion("praisenum is null");
            return (Criteria) this;
        }

        public Criteria andPraisenumIsNotNull() {
            addCriterion("praisenum is not null");
            return (Criteria) this;
        }

        public Criteria andPraisenumEqualTo(Integer value) {
            addCriterion("praisenum =", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotEqualTo(Integer value) {
            addCriterion("praisenum <>", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumGreaterThan(Integer value) {
            addCriterion("praisenum >", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("praisenum >=", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumLessThan(Integer value) {
            addCriterion("praisenum <", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumLessThanOrEqualTo(Integer value) {
            addCriterion("praisenum <=", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumIn(List<Integer> values) {
            addCriterion("praisenum in", values, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotIn(List<Integer> values) {
            addCriterion("praisenum not in", values, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumBetween(Integer value1, Integer value2) {
            addCriterion("praisenum between", value1, value2, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotBetween(Integer value1, Integer value2) {
            addCriterion("praisenum not between", value1, value2, "praisenum");
            return (Criteria) this;
        }

        public Criteria andFollownumIsNull() {
            addCriterion("follownum is null");
            return (Criteria) this;
        }

        public Criteria andFollownumIsNotNull() {
            addCriterion("follownum is not null");
            return (Criteria) this;
        }

        public Criteria andFollownumEqualTo(Integer value) {
            addCriterion("follownum =", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotEqualTo(Integer value) {
            addCriterion("follownum <>", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumGreaterThan(Integer value) {
            addCriterion("follownum >", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follownum >=", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumLessThan(Integer value) {
            addCriterion("follownum <", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumLessThanOrEqualTo(Integer value) {
            addCriterion("follownum <=", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumIn(List<Integer> values) {
            addCriterion("follownum in", values, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotIn(List<Integer> values) {
            addCriterion("follownum not in", values, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumBetween(Integer value1, Integer value2) {
            addCriterion("follownum between", value1, value2, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotBetween(Integer value1, Integer value2) {
            addCriterion("follownum not between", value1, value2, "follownum");
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