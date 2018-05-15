package com.ky.lebron.domain;

import java.util.ArrayList;
import java.util.List;

public class LbjIndexCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LbjIndexCategoryExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNull() {
            addCriterion("CATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNotNull() {
            addCriterion("CATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCateNameEqualTo(String value) {
            addCriterion("CATE_NAME =", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotEqualTo(String value) {
            addCriterion("CATE_NAME <>", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThan(String value) {
            addCriterion("CATE_NAME >", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATE_NAME >=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThan(String value) {
            addCriterion("CATE_NAME <", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThanOrEqualTo(String value) {
            addCriterion("CATE_NAME <=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLike(String value) {
            addCriterion("CATE_NAME like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotLike(String value) {
            addCriterion("CATE_NAME not like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameIn(List<String> values) {
            addCriterion("CATE_NAME in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotIn(List<String> values) {
            addCriterion("CATE_NAME not in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameBetween(String value1, String value2) {
            addCriterion("CATE_NAME between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotBetween(String value1, String value2) {
            addCriterion("CATE_NAME not between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlIsNull() {
            addCriterion("REDICCT_URL is null");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlIsNotNull() {
            addCriterion("REDICCT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlEqualTo(String value) {
            addCriterion("REDICCT_URL =", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlNotEqualTo(String value) {
            addCriterion("REDICCT_URL <>", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlGreaterThan(String value) {
            addCriterion("REDICCT_URL >", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlGreaterThanOrEqualTo(String value) {
            addCriterion("REDICCT_URL >=", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlLessThan(String value) {
            addCriterion("REDICCT_URL <", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlLessThanOrEqualTo(String value) {
            addCriterion("REDICCT_URL <=", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlLike(String value) {
            addCriterion("REDICCT_URL like", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlNotLike(String value) {
            addCriterion("REDICCT_URL not like", value, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlIn(List<String> values) {
            addCriterion("REDICCT_URL in", values, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlNotIn(List<String> values) {
            addCriterion("REDICCT_URL not in", values, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlBetween(String value1, String value2) {
            addCriterion("REDICCT_URL between", value1, value2, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andRedicctUrlNotBetween(String value1, String value2) {
            addCriterion("REDICCT_URL not between", value1, value2, "redicctUrl");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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