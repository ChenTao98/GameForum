package com.software.gameforum.entity;

import java.util.ArrayList;
import java.util.List;

public class GamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GamesExample() {
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

        public Criteria andGamenameIsNull() {
            addCriterion("gamename is null");
            return (Criteria) this;
        }

        public Criteria andGamenameIsNotNull() {
            addCriterion("gamename is not null");
            return (Criteria) this;
        }

        public Criteria andGamenameEqualTo(String value) {
            addCriterion("gamename =", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameNotEqualTo(String value) {
            addCriterion("gamename <>", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameGreaterThan(String value) {
            addCriterion("gamename >", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameGreaterThanOrEqualTo(String value) {
            addCriterion("gamename >=", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameLessThan(String value) {
            addCriterion("gamename <", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameLessThanOrEqualTo(String value) {
            addCriterion("gamename <=", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameLike(String value) {
            addCriterion("gamename like", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameNotLike(String value) {
            addCriterion("gamename not like", value, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameIn(List<String> values) {
            addCriterion("gamename in", values, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameNotIn(List<String> values) {
            addCriterion("gamename not in", values, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameBetween(String value1, String value2) {
            addCriterion("gamename between", value1, value2, "gamename");
            return (Criteria) this;
        }

        public Criteria andGamenameNotBetween(String value1, String value2) {
            addCriterion("gamename not between", value1, value2, "gamename");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andHelpIsNull() {
            addCriterion("help is null");
            return (Criteria) this;
        }

        public Criteria andHelpIsNotNull() {
            addCriterion("help is not null");
            return (Criteria) this;
        }

        public Criteria andHelpEqualTo(String value) {
            addCriterion("help =", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotEqualTo(String value) {
            addCriterion("help <>", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpGreaterThan(String value) {
            addCriterion("help >", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpGreaterThanOrEqualTo(String value) {
            addCriterion("help >=", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpLessThan(String value) {
            addCriterion("help <", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpLessThanOrEqualTo(String value) {
            addCriterion("help <=", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpLike(String value) {
            addCriterion("help like", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotLike(String value) {
            addCriterion("help not like", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpIn(List<String> values) {
            addCriterion("help in", values, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotIn(List<String> values) {
            addCriterion("help not in", values, "help");
            return (Criteria) this;
        }

        public Criteria andHelpBetween(String value1, String value2) {
            addCriterion("help between", value1, value2, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotBetween(String value1, String value2) {
            addCriterion("help not between", value1, value2, "help");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNull() {
            addCriterion("postnum is null");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNotNull() {
            addCriterion("postnum is not null");
            return (Criteria) this;
        }

        public Criteria andPostnumEqualTo(Integer value) {
            addCriterion("postnum =", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotEqualTo(Integer value) {
            addCriterion("postnum <>", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThan(Integer value) {
            addCriterion("postnum >", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postnum >=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThan(Integer value) {
            addCriterion("postnum <", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThanOrEqualTo(Integer value) {
            addCriterion("postnum <=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumIn(List<Integer> values) {
            addCriterion("postnum in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotIn(List<Integer> values) {
            addCriterion("postnum not in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumBetween(Integer value1, Integer value2) {
            addCriterion("postnum between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotBetween(Integer value1, Integer value2) {
            addCriterion("postnum not between", value1, value2, "postnum");
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