package cn.creditmanage.po;

import java.util.ArrayList;
import java.util.List;

public class RewardPunishmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardPunishmentExample() {
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

        public Criteria andRpidIsNull() {
            addCriterion("rpid is null");
            return (Criteria) this;
        }

        public Criteria andRpidIsNotNull() {
            addCriterion("rpid is not null");
            return (Criteria) this;
        }

        public Criteria andRpidEqualTo(Integer value) {
            addCriterion("rpid =", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotEqualTo(Integer value) {
            addCriterion("rpid <>", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThan(Integer value) {
            addCriterion("rpid >", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rpid >=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThan(Integer value) {
            addCriterion("rpid <", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThanOrEqualTo(Integer value) {
            addCriterion("rpid <=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidIn(List<Integer> values) {
            addCriterion("rpid in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotIn(List<Integer> values) {
            addCriterion("rpid not in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidBetween(Integer value1, Integer value2) {
            addCriterion("rpid between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotBetween(Integer value1, Integer value2) {
            addCriterion("rpid not between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpscoreIsNull() {
            addCriterion("rpscore is null");
            return (Criteria) this;
        }

        public Criteria andRpscoreIsNotNull() {
            addCriterion("rpscore is not null");
            return (Criteria) this;
        }

        public Criteria andRpscoreEqualTo(Integer value) {
            addCriterion("rpscore =", value, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreNotEqualTo(Integer value) {
            addCriterion("rpscore <>", value, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreGreaterThan(Integer value) {
            addCriterion("rpscore >", value, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("rpscore >=", value, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreLessThan(Integer value) {
            addCriterion("rpscore <", value, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreLessThanOrEqualTo(Integer value) {
            addCriterion("rpscore <=", value, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreIn(List<Integer> values) {
            addCriterion("rpscore in", values, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreNotIn(List<Integer> values) {
            addCriterion("rpscore not in", values, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreBetween(Integer value1, Integer value2) {
            addCriterion("rpscore between", value1, value2, "rpscore");
            return (Criteria) this;
        }

        public Criteria andRpscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("rpscore not between", value1, value2, "rpscore");
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

        public Criteria andGoodthingIsNull() {
            addCriterion("goodthing is null");
            return (Criteria) this;
        }

        public Criteria andGoodthingIsNotNull() {
            addCriterion("goodthing is not null");
            return (Criteria) this;
        }

        public Criteria andGoodthingEqualTo(String value) {
            addCriterion("goodthing =", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingNotEqualTo(String value) {
            addCriterion("goodthing <>", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingGreaterThan(String value) {
            addCriterion("goodthing >", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingGreaterThanOrEqualTo(String value) {
            addCriterion("goodthing >=", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingLessThan(String value) {
            addCriterion("goodthing <", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingLessThanOrEqualTo(String value) {
            addCriterion("goodthing <=", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingLike(String value) {
            addCriterion("goodthing like", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingNotLike(String value) {
            addCriterion("goodthing not like", value, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingIn(List<String> values) {
            addCriterion("goodthing in", values, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingNotIn(List<String> values) {
            addCriterion("goodthing not in", values, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingBetween(String value1, String value2) {
            addCriterion("goodthing between", value1, value2, "goodthing");
            return (Criteria) this;
        }

        public Criteria andGoodthingNotBetween(String value1, String value2) {
            addCriterion("goodthing not between", value1, value2, "goodthing");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardIsNull() {
            addCriterion("schoolreward is null");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardIsNotNull() {
            addCriterion("schoolreward is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardEqualTo(String value) {
            addCriterion("schoolreward =", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardNotEqualTo(String value) {
            addCriterion("schoolreward <>", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardGreaterThan(String value) {
            addCriterion("schoolreward >", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardGreaterThanOrEqualTo(String value) {
            addCriterion("schoolreward >=", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardLessThan(String value) {
            addCriterion("schoolreward <", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardLessThanOrEqualTo(String value) {
            addCriterion("schoolreward <=", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardLike(String value) {
            addCriterion("schoolreward like", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardNotLike(String value) {
            addCriterion("schoolreward not like", value, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardIn(List<String> values) {
            addCriterion("schoolreward in", values, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardNotIn(List<String> values) {
            addCriterion("schoolreward not in", values, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardBetween(String value1, String value2) {
            addCriterion("schoolreward between", value1, value2, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andSchoolrewardNotBetween(String value1, String value2) {
            addCriterion("schoolreward not between", value1, value2, "schoolreward");
            return (Criteria) this;
        }

        public Criteria andBreakruleIsNull() {
            addCriterion("breakrule is null");
            return (Criteria) this;
        }

        public Criteria andBreakruleIsNotNull() {
            addCriterion("breakrule is not null");
            return (Criteria) this;
        }

        public Criteria andBreakruleEqualTo(String value) {
            addCriterion("breakrule =", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleNotEqualTo(String value) {
            addCriterion("breakrule <>", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleGreaterThan(String value) {
            addCriterion("breakrule >", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleGreaterThanOrEqualTo(String value) {
            addCriterion("breakrule >=", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleLessThan(String value) {
            addCriterion("breakrule <", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleLessThanOrEqualTo(String value) {
            addCriterion("breakrule <=", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleLike(String value) {
            addCriterion("breakrule like", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleNotLike(String value) {
            addCriterion("breakrule not like", value, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleIn(List<String> values) {
            addCriterion("breakrule in", values, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleNotIn(List<String> values) {
            addCriterion("breakrule not in", values, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleBetween(String value1, String value2) {
            addCriterion("breakrule between", value1, value2, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreakruleNotBetween(String value1, String value2) {
            addCriterion("breakrule not between", value1, value2, "breakrule");
            return (Criteria) this;
        }

        public Criteria andBreaklawIsNull() {
            addCriterion("breaklaw is null");
            return (Criteria) this;
        }

        public Criteria andBreaklawIsNotNull() {
            addCriterion("breaklaw is not null");
            return (Criteria) this;
        }

        public Criteria andBreaklawEqualTo(String value) {
            addCriterion("breaklaw =", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawNotEqualTo(String value) {
            addCriterion("breaklaw <>", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawGreaterThan(String value) {
            addCriterion("breaklaw >", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawGreaterThanOrEqualTo(String value) {
            addCriterion("breaklaw >=", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawLessThan(String value) {
            addCriterion("breaklaw <", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawLessThanOrEqualTo(String value) {
            addCriterion("breaklaw <=", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawLike(String value) {
            addCriterion("breaklaw like", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawNotLike(String value) {
            addCriterion("breaklaw not like", value, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawIn(List<String> values) {
            addCriterion("breaklaw in", values, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawNotIn(List<String> values) {
            addCriterion("breaklaw not in", values, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawBetween(String value1, String value2) {
            addCriterion("breaklaw between", value1, value2, "breaklaw");
            return (Criteria) this;
        }

        public Criteria andBreaklawNotBetween(String value1, String value2) {
            addCriterion("breaklaw not between", value1, value2, "breaklaw");
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