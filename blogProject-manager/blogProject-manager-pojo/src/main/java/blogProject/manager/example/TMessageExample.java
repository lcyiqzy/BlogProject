package blogProject.manager.example;

import java.util.ArrayList;
import java.util.List;

public class TMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMessageExample() {
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

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdIsNull() {
            addCriterion("message_sender_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdIsNotNull() {
            addCriterion("message_sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdEqualTo(Integer value) {
            addCriterion("message_sender_id =", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdNotEqualTo(Integer value) {
            addCriterion("message_sender_id <>", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdGreaterThan(Integer value) {
            addCriterion("message_sender_id >", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_sender_id >=", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdLessThan(Integer value) {
            addCriterion("message_sender_id <", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_sender_id <=", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdIn(List<Integer> values) {
            addCriterion("message_sender_id in", values, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdNotIn(List<Integer> values) {
            addCriterion("message_sender_id not in", values, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdBetween(Integer value1, Integer value2) {
            addCriterion("message_sender_id between", value1, value2, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_sender_id not between", value1, value2, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdIsNull() {
            addCriterion("message_receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdIsNotNull() {
            addCriterion("message_receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdEqualTo(Integer value) {
            addCriterion("message_receiver_id =", value, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdNotEqualTo(Integer value) {
            addCriterion("message_receiver_id <>", value, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdGreaterThan(Integer value) {
            addCriterion("message_receiver_id >", value, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_receiver_id >=", value, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdLessThan(Integer value) {
            addCriterion("message_receiver_id <", value, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_receiver_id <=", value, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdIn(List<Integer> values) {
            addCriterion("message_receiver_id in", values, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdNotIn(List<Integer> values) {
            addCriterion("message_receiver_id not in", values, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdBetween(Integer value1, Integer value2) {
            addCriterion("message_receiver_id between", value1, value2, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageReceiverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_receiver_id not between", value1, value2, "messageReceiverId");
            return (Criteria) this;
        }

        public Criteria andMessageDateIsNull() {
            addCriterion("message_date is null");
            return (Criteria) this;
        }

        public Criteria andMessageDateIsNotNull() {
            addCriterion("message_date is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDateEqualTo(String value) {
            addCriterion("message_date =", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotEqualTo(String value) {
            addCriterion("message_date <>", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateGreaterThan(String value) {
            addCriterion("message_date >", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateGreaterThanOrEqualTo(String value) {
            addCriterion("message_date >=", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLessThan(String value) {
            addCriterion("message_date <", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLessThanOrEqualTo(String value) {
            addCriterion("message_date <=", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLike(String value) {
            addCriterion("message_date like", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotLike(String value) {
            addCriterion("message_date not like", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateIn(List<String> values) {
            addCriterion("message_date in", values, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotIn(List<String> values) {
            addCriterion("message_date not in", values, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateBetween(String value1, String value2) {
            addCriterion("message_date between", value1, value2, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotBetween(String value1, String value2) {
            addCriterion("message_date not between", value1, value2, "messageDate");
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