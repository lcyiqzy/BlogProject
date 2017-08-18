package blogProject.manager.example;

import java.util.ArrayList;
import java.util.List;

public class TArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TArticleExample() {
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

        public Criteria andArticleNameIsNull() {
            addCriterion("article_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleNameIsNotNull() {
            addCriterion("article_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNameEqualTo(String value) {
            addCriterion("article_name =", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotEqualTo(String value) {
            addCriterion("article_name <>", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThan(String value) {
            addCriterion("article_name >", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_name >=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThan(String value) {
            addCriterion("article_name <", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThanOrEqualTo(String value) {
            addCriterion("article_name <=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLike(String value) {
            addCriterion("article_name like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotLike(String value) {
            addCriterion("article_name not like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameIn(List<String> values) {
            addCriterion("article_name in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotIn(List<String> values) {
            addCriterion("article_name not in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameBetween(String value1, String value2) {
            addCriterion("article_name between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotBetween(String value1, String value2) {
            addCriterion("article_name not between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNull() {
            addCriterion("article_author is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIsNotNull() {
            addCriterion("article_author is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEqualTo(String value) {
            addCriterion("article_author =", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotEqualTo(String value) {
            addCriterion("article_author <>", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThan(String value) {
            addCriterion("article_author >", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("article_author >=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThan(String value) {
            addCriterion("article_author <", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLessThanOrEqualTo(String value) {
            addCriterion("article_author <=", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorLike(String value) {
            addCriterion("article_author like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotLike(String value) {
            addCriterion("article_author not like", value, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIn(List<String> values) {
            addCriterion("article_author in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotIn(List<String> values) {
            addCriterion("article_author not in", values, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorBetween(String value1, String value2) {
            addCriterion("article_author between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorNotBetween(String value1, String value2) {
            addCriterion("article_author not between", value1, value2, "articleAuthor");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNull() {
            addCriterion("article_url is null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNotNull() {
            addCriterion("article_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlEqualTo(String value) {
            addCriterion("article_url =", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotEqualTo(String value) {
            addCriterion("article_url <>", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThan(String value) {
            addCriterion("article_url >", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_url >=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThan(String value) {
            addCriterion("article_url <", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThanOrEqualTo(String value) {
            addCriterion("article_url <=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLike(String value) {
            addCriterion("article_url like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotLike(String value) {
            addCriterion("article_url not like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIn(List<String> values) {
            addCriterion("article_url in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotIn(List<String> values) {
            addCriterion("article_url not in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlBetween(String value1, String value2) {
            addCriterion("article_url between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotBetween(String value1, String value2) {
            addCriterion("article_url not between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumIsNull() {
            addCriterion("article_read_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumIsNotNull() {
            addCriterion("article_read_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumEqualTo(Integer value) {
            addCriterion("article_read_num =", value, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumNotEqualTo(Integer value) {
            addCriterion("article_read_num <>", value, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumGreaterThan(Integer value) {
            addCriterion("article_read_num >", value, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_read_num >=", value, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumLessThan(Integer value) {
            addCriterion("article_read_num <", value, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_read_num <=", value, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumIn(List<Integer> values) {
            addCriterion("article_read_num in", values, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumNotIn(List<Integer> values) {
            addCriterion("article_read_num not in", values, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumBetween(Integer value1, Integer value2) {
            addCriterion("article_read_num between", value1, value2, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleReadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_read_num not between", value1, value2, "articleReadNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumIsNull() {
            addCriterion("article_like_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumIsNotNull() {
            addCriterion("article_like_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumEqualTo(Integer value) {
            addCriterion("article_like_num =", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumNotEqualTo(Integer value) {
            addCriterion("article_like_num <>", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumGreaterThan(Integer value) {
            addCriterion("article_like_num >", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_like_num >=", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumLessThan(Integer value) {
            addCriterion("article_like_num <", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_like_num <=", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumIn(List<Integer> values) {
            addCriterion("article_like_num in", values, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumNotIn(List<Integer> values) {
            addCriterion("article_like_num not in", values, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("article_like_num between", value1, value2, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_like_num not between", value1, value2, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumIsNull() {
            addCriterion("article_follow_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumIsNotNull() {
            addCriterion("article_follow_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumEqualTo(Integer value) {
            addCriterion("article_follow_num =", value, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumNotEqualTo(Integer value) {
            addCriterion("article_follow_num <>", value, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumGreaterThan(Integer value) {
            addCriterion("article_follow_num >", value, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_follow_num >=", value, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumLessThan(Integer value) {
            addCriterion("article_follow_num <", value, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_follow_num <=", value, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumIn(List<Integer> values) {
            addCriterion("article_follow_num in", values, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumNotIn(List<Integer> values) {
            addCriterion("article_follow_num not in", values, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumBetween(Integer value1, Integer value2) {
            addCriterion("article_follow_num between", value1, value2, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleFollowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_follow_num not between", value1, value2, "articleFollowNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumIsNull() {
            addCriterion("article_commit_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumIsNotNull() {
            addCriterion("article_commit_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumEqualTo(Integer value) {
            addCriterion("article_commit_num =", value, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumNotEqualTo(Integer value) {
            addCriterion("article_commit_num <>", value, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumGreaterThan(Integer value) {
            addCriterion("article_commit_num >", value, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_commit_num >=", value, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumLessThan(Integer value) {
            addCriterion("article_commit_num <", value, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_commit_num <=", value, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumIn(List<Integer> values) {
            addCriterion("article_commit_num in", values, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumNotIn(List<Integer> values) {
            addCriterion("article_commit_num not in", values, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumBetween(Integer value1, Integer value2) {
            addCriterion("article_commit_num between", value1, value2, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleCommitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_commit_num not between", value1, value2, "articleCommitNum");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNull() {
            addCriterion("article_date is null");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNotNull() {
            addCriterion("article_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDateEqualTo(String value) {
            addCriterion("article_date =", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotEqualTo(String value) {
            addCriterion("article_date <>", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThan(String value) {
            addCriterion("article_date >", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThanOrEqualTo(String value) {
            addCriterion("article_date >=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThan(String value) {
            addCriterion("article_date <", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThanOrEqualTo(String value) {
            addCriterion("article_date <=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLike(String value) {
            addCriterion("article_date like", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotLike(String value) {
            addCriterion("article_date not like", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateIn(List<String> values) {
            addCriterion("article_date in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotIn(List<String> values) {
            addCriterion("article_date not in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateBetween(String value1, String value2) {
            addCriterion("article_date between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotBetween(String value1, String value2) {
            addCriterion("article_date not between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlIsNull() {
            addCriterion("article_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlIsNotNull() {
            addCriterion("article_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlEqualTo(String value) {
            addCriterion("article_pic_url =", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotEqualTo(String value) {
            addCriterion("article_pic_url <>", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlGreaterThan(String value) {
            addCriterion("article_pic_url >", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_pic_url >=", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlLessThan(String value) {
            addCriterion("article_pic_url <", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlLessThanOrEqualTo(String value) {
            addCriterion("article_pic_url <=", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlLike(String value) {
            addCriterion("article_pic_url like", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotLike(String value) {
            addCriterion("article_pic_url not like", value, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlIn(List<String> values) {
            addCriterion("article_pic_url in", values, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotIn(List<String> values) {
            addCriterion("article_pic_url not in", values, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlBetween(String value1, String value2) {
            addCriterion("article_pic_url between", value1, value2, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andArticlePicUrlNotBetween(String value1, String value2) {
            addCriterion("article_pic_url not between", value1, value2, "articlePicUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlIsNull() {
            addCriterion("article_real_url is null");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlIsNotNull() {
            addCriterion("article_real_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlEqualTo(String value) {
            addCriterion("article_real_url =", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlNotEqualTo(String value) {
            addCriterion("article_real_url <>", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlGreaterThan(String value) {
            addCriterion("article_real_url >", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_real_url >=", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlLessThan(String value) {
            addCriterion("article_real_url <", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlLessThanOrEqualTo(String value) {
            addCriterion("article_real_url <=", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlLike(String value) {
            addCriterion("article_real_url like", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlNotLike(String value) {
            addCriterion("article_real_url not like", value, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlIn(List<String> values) {
            addCriterion("article_real_url in", values, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlNotIn(List<String> values) {
            addCriterion("article_real_url not in", values, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlBetween(String value1, String value2) {
            addCriterion("article_real_url between", value1, value2, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleRealUrlNotBetween(String value1, String value2) {
            addCriterion("article_real_url not between", value1, value2, "articleRealUrl");
            return (Criteria) this;
        }

        public Criteria andArticleLabelIsNull() {
            addCriterion("article_label is null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelIsNotNull() {
            addCriterion("article_label is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLabelEqualTo(Integer value) {
            addCriterion("article_label =", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelNotEqualTo(Integer value) {
            addCriterion("article_label <>", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGreaterThan(Integer value) {
            addCriterion("article_label >", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_label >=", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelLessThan(Integer value) {
            addCriterion("article_label <", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelLessThanOrEqualTo(Integer value) {
            addCriterion("article_label <=", value, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelIn(List<Integer> values) {
            addCriterion("article_label in", values, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelNotIn(List<Integer> values) {
            addCriterion("article_label not in", values, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelBetween(Integer value1, Integer value2) {
            addCriterion("article_label between", value1, value2, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleLabelNotBetween(Integer value1, Integer value2) {
            addCriterion("article_label not between", value1, value2, "articleLabel");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentIsNull() {
            addCriterion("article_simplecontent is null");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentIsNotNull() {
            addCriterion("article_simplecontent is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentEqualTo(String value) {
            addCriterion("article_simplecontent =", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentNotEqualTo(String value) {
            addCriterion("article_simplecontent <>", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentGreaterThan(String value) {
            addCriterion("article_simplecontent >", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentGreaterThanOrEqualTo(String value) {
            addCriterion("article_simplecontent >=", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentLessThan(String value) {
            addCriterion("article_simplecontent <", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentLessThanOrEqualTo(String value) {
            addCriterion("article_simplecontent <=", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentLike(String value) {
            addCriterion("article_simplecontent like", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentNotLike(String value) {
            addCriterion("article_simplecontent not like", value, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentIn(List<String> values) {
            addCriterion("article_simplecontent in", values, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentNotIn(List<String> values) {
            addCriterion("article_simplecontent not in", values, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentBetween(String value1, String value2) {
            addCriterion("article_simplecontent between", value1, value2, "articleSimplecontent");
            return (Criteria) this;
        }

        public Criteria andArticleSimplecontentNotBetween(String value1, String value2) {
            addCriterion("article_simplecontent not between", value1, value2, "articleSimplecontent");
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