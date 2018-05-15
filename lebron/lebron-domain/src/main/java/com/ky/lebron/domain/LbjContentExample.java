package com.ky.lebron.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LbjContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LbjContentExample() {
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

        public Criteria andIndexCategoryIdIsNull() {
            addCriterion("INDEX_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdIsNotNull() {
            addCriterion("INDEX_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdEqualTo(Long value) {
            addCriterion("INDEX_CATEGORY_ID =", value, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdNotEqualTo(Long value) {
            addCriterion("INDEX_CATEGORY_ID <>", value, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdGreaterThan(Long value) {
            addCriterion("INDEX_CATEGORY_ID >", value, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INDEX_CATEGORY_ID >=", value, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdLessThan(Long value) {
            addCriterion("INDEX_CATEGORY_ID <", value, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("INDEX_CATEGORY_ID <=", value, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdIn(List<Long> values) {
            addCriterion("INDEX_CATEGORY_ID in", values, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdNotIn(List<Long> values) {
            addCriterion("INDEX_CATEGORY_ID not in", values, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdBetween(Long value1, Long value2) {
            addCriterion("INDEX_CATEGORY_ID between", value1, value2, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andIndexCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("INDEX_CATEGORY_ID not between", value1, value2, "indexCategoryId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andResourceIsNull() {
            addCriterion("RESOURCE is null");
            return (Criteria) this;
        }

        public Criteria andResourceIsNotNull() {
            addCriterion("RESOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEqualTo(String value) {
            addCriterion("RESOURCE =", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotEqualTo(String value) {
            addCriterion("RESOURCE <>", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThan(String value) {
            addCriterion("RESOURCE >", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE >=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThan(String value) {
            addCriterion("RESOURCE <", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE <=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLike(String value) {
            addCriterion("RESOURCE like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotLike(String value) {
            addCriterion("RESOURCE not like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceIn(List<String> values) {
            addCriterion("RESOURCE in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotIn(List<String> values) {
            addCriterion("RESOURCE not in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceBetween(String value1, String value2) {
            addCriterion("RESOURCE between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotBetween(String value1, String value2) {
            addCriterion("RESOURCE not between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andTitlePictureIsNull() {
            addCriterion("TITLE_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andTitlePictureIsNotNull() {
            addCriterion("TITLE_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andTitlePictureEqualTo(String value) {
            addCriterion("TITLE_PICTURE =", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureNotEqualTo(String value) {
            addCriterion("TITLE_PICTURE <>", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureGreaterThan(String value) {
            addCriterion("TITLE_PICTURE >", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_PICTURE >=", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureLessThan(String value) {
            addCriterion("TITLE_PICTURE <", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureLessThanOrEqualTo(String value) {
            addCriterion("TITLE_PICTURE <=", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureLike(String value) {
            addCriterion("TITLE_PICTURE like", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureNotLike(String value) {
            addCriterion("TITLE_PICTURE not like", value, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureIn(List<String> values) {
            addCriterion("TITLE_PICTURE in", values, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureNotIn(List<String> values) {
            addCriterion("TITLE_PICTURE not in", values, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureBetween(String value1, String value2) {
            addCriterion("TITLE_PICTURE between", value1, value2, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andTitlePictureNotBetween(String value1, String value2) {
            addCriterion("TITLE_PICTURE not between", value1, value2, "titlePicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureIsNull() {
            addCriterion("CONTENT_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andContentPictureIsNotNull() {
            addCriterion("CONTENT_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andContentPictureEqualTo(String value) {
            addCriterion("CONTENT_PICTURE =", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotEqualTo(String value) {
            addCriterion("CONTENT_PICTURE <>", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureGreaterThan(String value) {
            addCriterion("CONTENT_PICTURE >", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_PICTURE >=", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureLessThan(String value) {
            addCriterion("CONTENT_PICTURE <", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_PICTURE <=", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureLike(String value) {
            addCriterion("CONTENT_PICTURE like", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotLike(String value) {
            addCriterion("CONTENT_PICTURE not like", value, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureIn(List<String> values) {
            addCriterion("CONTENT_PICTURE in", values, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotIn(List<String> values) {
            addCriterion("CONTENT_PICTURE not in", values, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureBetween(String value1, String value2) {
            addCriterion("CONTENT_PICTURE between", value1, value2, "contentPicture");
            return (Criteria) this;
        }

        public Criteria andContentPictureNotBetween(String value1, String value2) {
            addCriterion("CONTENT_PICTURE not between", value1, value2, "contentPicture");
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