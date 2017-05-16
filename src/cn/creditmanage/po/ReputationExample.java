package cn.creditmanage.po;

import java.util.ArrayList;
import java.util.List;

public class ReputationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReputationExample() {
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

        public Criteria andReidIsNull() {
            addCriterion("reid is null");
            return (Criteria) this;
        }

        public Criteria andReidIsNotNull() {
            addCriterion("reid is not null");
            return (Criteria) this;
        }

        public Criteria andReidEqualTo(Integer value) {
            addCriterion("reid =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(Integer value) {
            addCriterion("reid <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(Integer value) {
            addCriterion("reid >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reid >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(Integer value) {
            addCriterion("reid <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(Integer value) {
            addCriterion("reid <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<Integer> values) {
            addCriterion("reid in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<Integer> values) {
            addCriterion("reid not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(Integer value1, Integer value2) {
            addCriterion("reid between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(Integer value1, Integer value2) {
            addCriterion("reid not between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andRescoreIsNull() {
            addCriterion("rescore is null");
            return (Criteria) this;
        }

        public Criteria andRescoreIsNotNull() {
            addCriterion("rescore is not null");
            return (Criteria) this;
        }

        public Criteria andRescoreEqualTo(Integer value) {
            addCriterion("rescore =", value, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreNotEqualTo(Integer value) {
            addCriterion("rescore <>", value, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreGreaterThan(Integer value) {
            addCriterion("rescore >", value, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("rescore >=", value, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreLessThan(Integer value) {
            addCriterion("rescore <", value, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreLessThanOrEqualTo(Integer value) {
            addCriterion("rescore <=", value, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreIn(List<Integer> values) {
            addCriterion("rescore in", values, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreNotIn(List<Integer> values) {
            addCriterion("rescore not in", values, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreBetween(Integer value1, Integer value2) {
            addCriterion("rescore between", value1, value2, "rescore");
            return (Criteria) this;
        }

        public Criteria andRescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("rescore not between", value1, value2, "rescore");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPaytuitionIsNull() {
            addCriterion("paytuition is null");
            return (Criteria) this;
        }

        public Criteria andPaytuitionIsNotNull() {
            addCriterion("paytuition is not null");
            return (Criteria) this;
        }

        public Criteria andPaytuitionEqualTo(String value) {
            addCriterion("paytuition =", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionNotEqualTo(String value) {
            addCriterion("paytuition <>", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionGreaterThan(String value) {
            addCriterion("paytuition >", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionGreaterThanOrEqualTo(String value) {
            addCriterion("paytuition >=", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionLessThan(String value) {
            addCriterion("paytuition <", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionLessThanOrEqualTo(String value) {
            addCriterion("paytuition <=", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionLike(String value) {
            addCriterion("paytuition like", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionNotLike(String value) {
            addCriterion("paytuition not like", value, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionIn(List<String> values) {
            addCriterion("paytuition in", values, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionNotIn(List<String> values) {
            addCriterion("paytuition not in", values, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionBetween(String value1, String value2) {
            addCriterion("paytuition between", value1, value2, "paytuition");
            return (Criteria) this;
        }

        public Criteria andPaytuitionNotBetween(String value1, String value2) {
            addCriterion("paytuition not between", value1, value2, "paytuition");
            return (Criteria) this;
        }

        public Criteria andNationalloanIsNull() {
            addCriterion("nationalloan is null");
            return (Criteria) this;
        }

        public Criteria andNationalloanIsNotNull() {
            addCriterion("nationalloan is not null");
            return (Criteria) this;
        }

        public Criteria andNationalloanEqualTo(String value) {
            addCriterion("nationalloan =", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanNotEqualTo(String value) {
            addCriterion("nationalloan <>", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanGreaterThan(String value) {
            addCriterion("nationalloan >", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanGreaterThanOrEqualTo(String value) {
            addCriterion("nationalloan >=", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanLessThan(String value) {
            addCriterion("nationalloan <", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanLessThanOrEqualTo(String value) {
            addCriterion("nationalloan <=", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanLike(String value) {
            addCriterion("nationalloan like", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanNotLike(String value) {
            addCriterion("nationalloan not like", value, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanIn(List<String> values) {
            addCriterion("nationalloan in", values, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanNotIn(List<String> values) {
            addCriterion("nationalloan not in", values, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanBetween(String value1, String value2) {
            addCriterion("nationalloan between", value1, value2, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andNationalloanNotBetween(String value1, String value2) {
            addCriterion("nationalloan not between", value1, value2, "nationalloan");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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