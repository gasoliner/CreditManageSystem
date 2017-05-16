package cn.creditmanage.po;

import java.util.ArrayList;
import java.util.List;

public class LearningAbilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LearningAbilityExample() {
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

        public Criteria andLaidIsNull() {
            addCriterion("laid is null");
            return (Criteria) this;
        }

        public Criteria andLaidIsNotNull() {
            addCriterion("laid is not null");
            return (Criteria) this;
        }

        public Criteria andLaidEqualTo(Integer value) {
            addCriterion("laid =", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidNotEqualTo(Integer value) {
            addCriterion("laid <>", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidGreaterThan(Integer value) {
            addCriterion("laid >", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("laid >=", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidLessThan(Integer value) {
            addCriterion("laid <", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidLessThanOrEqualTo(Integer value) {
            addCriterion("laid <=", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidIn(List<Integer> values) {
            addCriterion("laid in", values, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidNotIn(List<Integer> values) {
            addCriterion("laid not in", values, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidBetween(Integer value1, Integer value2) {
            addCriterion("laid between", value1, value2, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidNotBetween(Integer value1, Integer value2) {
            addCriterion("laid not between", value1, value2, "laid");
            return (Criteria) this;
        }

        public Criteria andLascoreIsNull() {
            addCriterion("lascore is null");
            return (Criteria) this;
        }

        public Criteria andLascoreIsNotNull() {
            addCriterion("lascore is not null");
            return (Criteria) this;
        }

        public Criteria andLascoreEqualTo(Integer value) {
            addCriterion("lascore =", value, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreNotEqualTo(Integer value) {
            addCriterion("lascore <>", value, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreGreaterThan(Integer value) {
            addCriterion("lascore >", value, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("lascore >=", value, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreLessThan(Integer value) {
            addCriterion("lascore <", value, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreLessThanOrEqualTo(Integer value) {
            addCriterion("lascore <=", value, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreIn(List<Integer> values) {
            addCriterion("lascore in", values, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreNotIn(List<Integer> values) {
            addCriterion("lascore not in", values, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreBetween(Integer value1, Integer value2) {
            addCriterion("lascore between", value1, value2, "lascore");
            return (Criteria) this;
        }

        public Criteria andLascoreNotBetween(Integer value1, Integer value2) {
            addCriterion("lascore not between", value1, value2, "lascore");
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

        public Criteria andJidianIsNull() {
            addCriterion("jidian is null");
            return (Criteria) this;
        }

        public Criteria andJidianIsNotNull() {
            addCriterion("jidian is not null");
            return (Criteria) this;
        }

        public Criteria andJidianEqualTo(Float value) {
            addCriterion("jidian =", value, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianNotEqualTo(Float value) {
            addCriterion("jidian <>", value, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianGreaterThan(Float value) {
            addCriterion("jidian >", value, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianGreaterThanOrEqualTo(Float value) {
            addCriterion("jidian >=", value, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianLessThan(Float value) {
            addCriterion("jidian <", value, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianLessThanOrEqualTo(Float value) {
            addCriterion("jidian <=", value, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianIn(List<Float> values) {
            addCriterion("jidian in", values, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianNotIn(List<Float> values) {
            addCriterion("jidian not in", values, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianBetween(Float value1, Float value2) {
            addCriterion("jidian between", value1, value2, "jidian");
            return (Criteria) this;
        }

        public Criteria andJidianNotBetween(Float value1, Float value2) {
            addCriterion("jidian not between", value1, value2, "jidian");
            return (Criteria) this;
        }

        public Criteria andLosemajorIsNull() {
            addCriterion("losemajor is null");
            return (Criteria) this;
        }

        public Criteria andLosemajorIsNotNull() {
            addCriterion("losemajor is not null");
            return (Criteria) this;
        }

        public Criteria andLosemajorEqualTo(Integer value) {
            addCriterion("losemajor =", value, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorNotEqualTo(Integer value) {
            addCriterion("losemajor <>", value, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorGreaterThan(Integer value) {
            addCriterion("losemajor >", value, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("losemajor >=", value, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorLessThan(Integer value) {
            addCriterion("losemajor <", value, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorLessThanOrEqualTo(Integer value) {
            addCriterion("losemajor <=", value, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorIn(List<Integer> values) {
            addCriterion("losemajor in", values, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorNotIn(List<Integer> values) {
            addCriterion("losemajor not in", values, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorBetween(Integer value1, Integer value2) {
            addCriterion("losemajor between", value1, value2, "losemajor");
            return (Criteria) this;
        }

        public Criteria andLosemajorNotBetween(Integer value1, Integer value2) {
            addCriterion("losemajor not between", value1, value2, "losemajor");
            return (Criteria) this;
        }

        public Criteria andScholarshipIsNull() {
            addCriterion("scholarship is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipIsNotNull() {
            addCriterion("scholarship is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipEqualTo(String value) {
            addCriterion("scholarship =", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipNotEqualTo(String value) {
            addCriterion("scholarship <>", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipGreaterThan(String value) {
            addCriterion("scholarship >", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipGreaterThanOrEqualTo(String value) {
            addCriterion("scholarship >=", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipLessThan(String value) {
            addCriterion("scholarship <", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipLessThanOrEqualTo(String value) {
            addCriterion("scholarship <=", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipLike(String value) {
            addCriterion("scholarship like", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipNotLike(String value) {
            addCriterion("scholarship not like", value, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipIn(List<String> values) {
            addCriterion("scholarship in", values, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipNotIn(List<String> values) {
            addCriterion("scholarship not in", values, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipBetween(String value1, String value2) {
            addCriterion("scholarship between", value1, value2, "scholarship");
            return (Criteria) this;
        }

        public Criteria andScholarshipNotBetween(String value1, String value2) {
            addCriterion("scholarship not between", value1, value2, "scholarship");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Float value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Float value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Float value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Float value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Float value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Float value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Float> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Float> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Float value1, Float value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Float value1, Float value2) {
            addCriterion("point not between", value1, value2, "point");
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