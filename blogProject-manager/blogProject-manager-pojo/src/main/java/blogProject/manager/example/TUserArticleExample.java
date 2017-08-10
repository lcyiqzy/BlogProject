package blogProject.manager.example;

import java.util.ArrayList;
import java.util.List;

public class TUserArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserArticleExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdIsNull() {
            addCriterion("write_article_id is null");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdIsNotNull() {
            addCriterion("write_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdEqualTo(Integer value) {
            addCriterion("write_article_id =", value, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdNotEqualTo(Integer value) {
            addCriterion("write_article_id <>", value, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdGreaterThan(Integer value) {
            addCriterion("write_article_id >", value, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("write_article_id >=", value, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdLessThan(Integer value) {
            addCriterion("write_article_id <", value, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("write_article_id <=", value, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdIn(List<Integer> values) {
            addCriterion("write_article_id in", values, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdNotIn(List<Integer> values) {
            addCriterion("write_article_id not in", values, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("write_article_id between", value1, value2, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andWriteArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("write_article_id not between", value1, value2, "writeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdIsNull() {
            addCriterion("like_article_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdIsNotNull() {
            addCriterion("like_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdEqualTo(Integer value) {
            addCriterion("like_article_id =", value, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdNotEqualTo(Integer value) {
            addCriterion("like_article_id <>", value, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdGreaterThan(Integer value) {
            addCriterion("like_article_id >", value, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_article_id >=", value, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdLessThan(Integer value) {
            addCriterion("like_article_id <", value, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("like_article_id <=", value, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdIn(List<Integer> values) {
            addCriterion("like_article_id in", values, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdNotIn(List<Integer> values) {
            addCriterion("like_article_id not in", values, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("like_article_id between", value1, value2, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andLikeArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("like_article_id not between", value1, value2, "likeArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdIsNull() {
            addCriterion("follow_article_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdIsNotNull() {
            addCriterion("follow_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdEqualTo(Integer value) {
            addCriterion("follow_article_id =", value, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdNotEqualTo(Integer value) {
            addCriterion("follow_article_id <>", value, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdGreaterThan(Integer value) {
            addCriterion("follow_article_id >", value, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_article_id >=", value, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdLessThan(Integer value) {
            addCriterion("follow_article_id <", value, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("follow_article_id <=", value, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdIn(List<Integer> values) {
            addCriterion("follow_article_id in", values, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdNotIn(List<Integer> values) {
            addCriterion("follow_article_id not in", values, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("follow_article_id between", value1, value2, "followArticleId");
            return (Criteria) this;
        }

        public Criteria andFollowArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_article_id not between", value1, value2, "followArticleId");
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