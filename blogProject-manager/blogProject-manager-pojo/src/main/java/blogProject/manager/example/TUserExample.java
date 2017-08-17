package blogProject.manager.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andUserLonginacctIsNull() {
            addCriterion("user_longinacct is null");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctIsNotNull() {
            addCriterion("user_longinacct is not null");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctEqualTo(String value) {
            addCriterion("user_longinacct =", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctNotEqualTo(String value) {
            addCriterion("user_longinacct <>", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctGreaterThan(String value) {
            addCriterion("user_longinacct >", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctGreaterThanOrEqualTo(String value) {
            addCriterion("user_longinacct >=", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctLessThan(String value) {
            addCriterion("user_longinacct <", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctLessThanOrEqualTo(String value) {
            addCriterion("user_longinacct <=", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctLike(String value) {
            addCriterion("user_longinacct like", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctNotLike(String value) {
            addCriterion("user_longinacct not like", value, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctIn(List<String> values) {
            addCriterion("user_longinacct in", values, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctNotIn(List<String> values) {
            addCriterion("user_longinacct not in", values, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctBetween(String value1, String value2) {
            addCriterion("user_longinacct between", value1, value2, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserLonginacctNotBetween(String value1, String value2) {
            addCriterion("user_longinacct not between", value1, value2, "userLonginacct");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIsNull() {
            addCriterion("user_permission is null");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIsNotNull() {
            addCriterion("user_permission is not null");
            return (Criteria) this;
        }

        public Criteria andUserPermissionEqualTo(Integer value) {
            addCriterion("user_permission =", value, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNotEqualTo(Integer value) {
            addCriterion("user_permission <>", value, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionGreaterThan(Integer value) {
            addCriterion("user_permission >", value, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_permission >=", value, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionLessThan(Integer value) {
            addCriterion("user_permission <", value, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("user_permission <=", value, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionIn(List<Integer> values) {
            addCriterion("user_permission in", values, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNotIn(List<Integer> values) {
            addCriterion("user_permission not in", values, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionBetween(Integer value1, Integer value2) {
            addCriterion("user_permission between", value1, value2, "userPermission");
            return (Criteria) this;
        }

        public Criteria andUserPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("user_permission not between", value1, value2, "userPermission");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNull() {
            addCriterion("follow_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNotNull() {
            addCriterion("follow_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowNumEqualTo(Integer value) {
            addCriterion("follow_num =", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotEqualTo(Integer value) {
            addCriterion("follow_num <>", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThan(Integer value) {
            addCriterion("follow_num >", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_num >=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThan(Integer value) {
            addCriterion("follow_num <", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThanOrEqualTo(Integer value) {
            addCriterion("follow_num <=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumIn(List<Integer> values) {
            addCriterion("follow_num in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotIn(List<Integer> values) {
            addCriterion("follow_num not in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumBetween(Integer value1, Integer value2) {
            addCriterion("follow_num between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_num not between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumIsNull() {
            addCriterion("followed_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowedNumIsNotNull() {
            addCriterion("followed_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedNumEqualTo(Integer value) {
            addCriterion("followed_num =", value, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumNotEqualTo(Integer value) {
            addCriterion("followed_num <>", value, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumGreaterThan(Integer value) {
            addCriterion("followed_num >", value, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("followed_num >=", value, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumLessThan(Integer value) {
            addCriterion("followed_num <", value, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumLessThanOrEqualTo(Integer value) {
            addCriterion("followed_num <=", value, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumIn(List<Integer> values) {
            addCriterion("followed_num in", values, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumNotIn(List<Integer> values) {
            addCriterion("followed_num not in", values, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumBetween(Integer value1, Integer value2) {
            addCriterion("followed_num between", value1, value2, "followedNum");
            return (Criteria) this;
        }

        public Criteria andFollowedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("followed_num not between", value1, value2, "followedNum");
            return (Criteria) this;
        }

        public Criteria andRegistStateIsNull() {
            addCriterion("regist_state is null");
            return (Criteria) this;
        }

        public Criteria andRegistStateIsNotNull() {
            addCriterion("regist_state is not null");
            return (Criteria) this;
        }

        public Criteria andRegistStateEqualTo(Integer value) {
            addCriterion("regist_state =", value, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateNotEqualTo(Integer value) {
            addCriterion("regist_state <>", value, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateGreaterThan(Integer value) {
            addCriterion("regist_state >", value, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("regist_state >=", value, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateLessThan(Integer value) {
            addCriterion("regist_state <", value, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateLessThanOrEqualTo(Integer value) {
            addCriterion("regist_state <=", value, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateIn(List<Integer> values) {
            addCriterion("regist_state in", values, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateNotIn(List<Integer> values) {
            addCriterion("regist_state not in", values, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateBetween(Integer value1, Integer value2) {
            addCriterion("regist_state between", value1, value2, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistStateNotBetween(Integer value1, Integer value2) {
            addCriterion("regist_state not between", value1, value2, "registState");
            return (Criteria) this;
        }

        public Criteria andRegistCodeIsNull() {
            addCriterion("regist_code is null");
            return (Criteria) this;
        }

        public Criteria andRegistCodeIsNotNull() {
            addCriterion("regist_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegistCodeEqualTo(String value) {
            addCriterion("regist_code =", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeNotEqualTo(String value) {
            addCriterion("regist_code <>", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeGreaterThan(String value) {
            addCriterion("regist_code >", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeGreaterThanOrEqualTo(String value) {
            addCriterion("regist_code >=", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeLessThan(String value) {
            addCriterion("regist_code <", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeLessThanOrEqualTo(String value) {
            addCriterion("regist_code <=", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeLike(String value) {
            addCriterion("regist_code like", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeNotLike(String value) {
            addCriterion("regist_code not like", value, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeIn(List<String> values) {
            addCriterion("regist_code in", values, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeNotIn(List<String> values) {
            addCriterion("regist_code not in", values, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeBetween(String value1, String value2) {
            addCriterion("regist_code between", value1, value2, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistCodeNotBetween(String value1, String value2) {
            addCriterion("regist_code not between", value1, value2, "registCode");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlIsNull() {
            addCriterion("regist_email_url is null");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlIsNotNull() {
            addCriterion("regist_email_url is not null");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlEqualTo(String value) {
            addCriterion("regist_email_url =", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlNotEqualTo(String value) {
            addCriterion("regist_email_url <>", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlGreaterThan(String value) {
            addCriterion("regist_email_url >", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("regist_email_url >=", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlLessThan(String value) {
            addCriterion("regist_email_url <", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlLessThanOrEqualTo(String value) {
            addCriterion("regist_email_url <=", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlLike(String value) {
            addCriterion("regist_email_url like", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlNotLike(String value) {
            addCriterion("regist_email_url not like", value, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlIn(List<String> values) {
            addCriterion("regist_email_url in", values, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlNotIn(List<String> values) {
            addCriterion("regist_email_url not in", values, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlBetween(String value1, String value2) {
            addCriterion("regist_email_url between", value1, value2, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andRegistEmailUrlNotBetween(String value1, String value2) {
            addCriterion("regist_email_url not between", value1, value2, "registEmailUrl");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlIsNull() {
            addCriterion("password_retrieve_url is null");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlIsNotNull() {
            addCriterion("password_retrieve_url is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlEqualTo(String value) {
            addCriterion("password_retrieve_url =", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlNotEqualTo(String value) {
            addCriterion("password_retrieve_url <>", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlGreaterThan(String value) {
            addCriterion("password_retrieve_url >", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlGreaterThanOrEqualTo(String value) {
            addCriterion("password_retrieve_url >=", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlLessThan(String value) {
            addCriterion("password_retrieve_url <", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlLessThanOrEqualTo(String value) {
            addCriterion("password_retrieve_url <=", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlLike(String value) {
            addCriterion("password_retrieve_url like", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlNotLike(String value) {
            addCriterion("password_retrieve_url not like", value, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlIn(List<String> values) {
            addCriterion("password_retrieve_url in", values, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlNotIn(List<String> values) {
            addCriterion("password_retrieve_url not in", values, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlBetween(String value1, String value2) {
            addCriterion("password_retrieve_url between", value1, value2, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andPasswordRetrieveUrlNotBetween(String value1, String value2) {
            addCriterion("password_retrieve_url not between", value1, value2, "passwordRetrieveUrl");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNull() {
            addCriterion("regist_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNotNull() {
            addCriterion("regist_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistDateEqualTo(Date value) {
            addCriterionForJDBCDate("regist_date =", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("regist_date <>", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThan(Date value) {
            addCriterionForJDBCDate("regist_date >", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regist_date >=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThan(Date value) {
            addCriterionForJDBCDate("regist_date <", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regist_date <=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateIn(List<Date> values) {
            addCriterionForJDBCDate("regist_date in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("regist_date not in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regist_date between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regist_date not between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andArticleNumIsNull() {
            addCriterion("article_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleNumIsNotNull() {
            addCriterion("article_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNumEqualTo(Integer value) {
            addCriterion("article_num =", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumNotEqualTo(Integer value) {
            addCriterion("article_num <>", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumGreaterThan(Integer value) {
            addCriterion("article_num >", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_num >=", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumLessThan(Integer value) {
            addCriterion("article_num <", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_num <=", value, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumIn(List<Integer> values) {
            addCriterion("article_num in", values, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumNotIn(List<Integer> values) {
            addCriterion("article_num not in", values, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumBetween(Integer value1, Integer value2) {
            addCriterion("article_num between", value1, value2, "articleNum");
            return (Criteria) this;
        }

        public Criteria andArticleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_num not between", value1, value2, "articleNum");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionIsNull() {
            addCriterion("user_self_introduction is null");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionIsNotNull() {
            addCriterion("user_self_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionEqualTo(String value) {
            addCriterion("user_self_introduction =", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionNotEqualTo(String value) {
            addCriterion("user_self_introduction <>", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionGreaterThan(String value) {
            addCriterion("user_self_introduction >", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("user_self_introduction >=", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionLessThan(String value) {
            addCriterion("user_self_introduction <", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionLessThanOrEqualTo(String value) {
            addCriterion("user_self_introduction <=", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionLike(String value) {
            addCriterion("user_self_introduction like", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionNotLike(String value) {
            addCriterion("user_self_introduction not like", value, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionIn(List<String> values) {
            addCriterion("user_self_introduction in", values, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionNotIn(List<String> values) {
            addCriterion("user_self_introduction not in", values, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionBetween(String value1, String value2) {
            addCriterion("user_self_introduction between", value1, value2, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroductionNotBetween(String value1, String value2) {
            addCriterion("user_self_introduction not between", value1, value2, "userSelfIntroduction");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeIsNull() {
            addCriterion("user_getlike is null");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeIsNotNull() {
            addCriterion("user_getlike is not null");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeEqualTo(Integer value) {
            addCriterion("user_getlike =", value, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeNotEqualTo(Integer value) {
            addCriterion("user_getlike <>", value, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeGreaterThan(Integer value) {
            addCriterion("user_getlike >", value, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_getlike >=", value, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeLessThan(Integer value) {
            addCriterion("user_getlike <", value, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeLessThanOrEqualTo(Integer value) {
            addCriterion("user_getlike <=", value, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeIn(List<Integer> values) {
            addCriterion("user_getlike in", values, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeNotIn(List<Integer> values) {
            addCriterion("user_getlike not in", values, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeBetween(Integer value1, Integer value2) {
            addCriterion("user_getlike between", value1, value2, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserGetlikeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_getlike not between", value1, value2, "userGetlike");
            return (Criteria) this;
        }

        public Criteria andUserWritenumIsNull() {
            addCriterion("user_writenum is null");
            return (Criteria) this;
        }

        public Criteria andUserWritenumIsNotNull() {
            addCriterion("user_writenum is not null");
            return (Criteria) this;
        }

        public Criteria andUserWritenumEqualTo(Integer value) {
            addCriterion("user_writenum =", value, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumNotEqualTo(Integer value) {
            addCriterion("user_writenum <>", value, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumGreaterThan(Integer value) {
            addCriterion("user_writenum >", value, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_writenum >=", value, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumLessThan(Integer value) {
            addCriterion("user_writenum <", value, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumLessThanOrEqualTo(Integer value) {
            addCriterion("user_writenum <=", value, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumIn(List<Integer> values) {
            addCriterion("user_writenum in", values, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumNotIn(List<Integer> values) {
            addCriterion("user_writenum not in", values, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumBetween(Integer value1, Integer value2) {
            addCriterion("user_writenum between", value1, value2, "userWritenum");
            return (Criteria) this;
        }

        public Criteria andUserWritenumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_writenum not between", value1, value2, "userWritenum");
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