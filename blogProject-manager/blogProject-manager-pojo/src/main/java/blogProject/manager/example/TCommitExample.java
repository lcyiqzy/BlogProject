package blogProject.manager.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCommitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCommitExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCommitContentIsNull() {
            addCriterion("commit_content is null");
            return (Criteria) this;
        }

        public Criteria andCommitContentIsNotNull() {
            addCriterion("commit_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommitContentEqualTo(String value) {
            addCriterion("commit_content =", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotEqualTo(String value) {
            addCriterion("commit_content <>", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentGreaterThan(String value) {
            addCriterion("commit_content >", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentGreaterThanOrEqualTo(String value) {
            addCriterion("commit_content >=", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentLessThan(String value) {
            addCriterion("commit_content <", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentLessThanOrEqualTo(String value) {
            addCriterion("commit_content <=", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentLike(String value) {
            addCriterion("commit_content like", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotLike(String value) {
            addCriterion("commit_content not like", value, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentIn(List<String> values) {
            addCriterion("commit_content in", values, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotIn(List<String> values) {
            addCriterion("commit_content not in", values, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentBetween(String value1, String value2) {
            addCriterion("commit_content between", value1, value2, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitContentNotBetween(String value1, String value2) {
            addCriterion("commit_content not between", value1, value2, "commitContent");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdIsNull() {
            addCriterion("commit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdIsNotNull() {
            addCriterion("commit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdEqualTo(Integer value) {
            addCriterion("commit_user_id =", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdNotEqualTo(Integer value) {
            addCriterion("commit_user_id <>", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdGreaterThan(Integer value) {
            addCriterion("commit_user_id >", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_user_id >=", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdLessThan(Integer value) {
            addCriterion("commit_user_id <", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("commit_user_id <=", value, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdIn(List<Integer> values) {
            addCriterion("commit_user_id in", values, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdNotIn(List<Integer> values) {
            addCriterion("commit_user_id not in", values, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdBetween(Integer value1, Integer value2) {
            addCriterion("commit_user_id between", value1, value2, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_user_id not between", value1, value2, "commitUserId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdIsNull() {
            addCriterion("commit_article_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdIsNotNull() {
            addCriterion("commit_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdEqualTo(Integer value) {
            addCriterion("commit_article_id =", value, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdNotEqualTo(Integer value) {
            addCriterion("commit_article_id <>", value, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdGreaterThan(Integer value) {
            addCriterion("commit_article_id >", value, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_article_id >=", value, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdLessThan(Integer value) {
            addCriterion("commit_article_id <", value, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("commit_article_id <=", value, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdIn(List<Integer> values) {
            addCriterion("commit_article_id in", values, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdNotIn(List<Integer> values) {
            addCriterion("commit_article_id not in", values, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("commit_article_id between", value1, value2, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_article_id not between", value1, value2, "commitArticleId");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNull() {
            addCriterion("commit_date is null");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNotNull() {
            addCriterion("commit_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommitDateEqualTo(Date value) {
            addCriterionForJDBCDate("commit_date =", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("commit_date <>", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("commit_date >", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commit_date >=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThan(Date value) {
            addCriterionForJDBCDate("commit_date <", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commit_date <=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateIn(List<Date> values) {
            addCriterionForJDBCDate("commit_date in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("commit_date not in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commit_date between", value1, value2, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commit_date not between", value1, value2, "commitDate");
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