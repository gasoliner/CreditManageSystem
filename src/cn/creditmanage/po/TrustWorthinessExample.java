package cn.creditmanage.po;

import java.util.ArrayList;
import java.util.List;

public class TrustWorthinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrustWorthinessExample() {
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

        public Criteria andTwidIsNull() {
            addCriterion("twid is null");
            return (Criteria) this;
        }

        public Criteria andTwidIsNotNull() {
            addCriterion("twid is not null");
            return (Criteria) this;
        }

        public Criteria andTwidEqualTo(Integer value) {
            addCriterion("twid =", value, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidNotEqualTo(Integer value) {
            addCriterion("twid <>", value, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidGreaterThan(Integer value) {
            addCriterion("twid >", value, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("twid >=", value, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidLessThan(Integer value) {
            addCriterion("twid <", value, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidLessThanOrEqualTo(Integer value) {
            addCriterion("twid <=", value, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidIn(List<Integer> values) {
            addCriterion("twid in", values, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidNotIn(List<Integer> values) {
            addCriterion("twid not in", values, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidBetween(Integer value1, Integer value2) {
            addCriterion("twid between", value1, value2, "twid");
            return (Criteria) this;
        }

        public Criteria andTwidNotBetween(Integer value1, Integer value2) {
            addCriterion("twid not between", value1, value2, "twid");
            return (Criteria) this;
        }

        public Criteria andTwscoreIsNull() {
            addCriterion("twscore is null");
            return (Criteria) this;
        }

        public Criteria andTwscoreIsNotNull() {
            addCriterion("twscore is not null");
            return (Criteria) this;
        }

        public Criteria andTwscoreEqualTo(Integer value) {
            addCriterion("twscore =", value, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreNotEqualTo(Integer value) {
            addCriterion("twscore <>", value, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreGreaterThan(Integer value) {
            addCriterion("twscore >", value, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("twscore >=", value, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreLessThan(Integer value) {
            addCriterion("twscore <", value, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreLessThanOrEqualTo(Integer value) {
            addCriterion("twscore <=", value, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreIn(List<Integer> values) {
            addCriterion("twscore in", values, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreNotIn(List<Integer> values) {
            addCriterion("twscore not in", values, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreBetween(Integer value1, Integer value2) {
            addCriterion("twscore between", value1, value2, "twscore");
            return (Criteria) this;
        }

        public Criteria andTwscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("twscore not between", value1, value2, "twscore");
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

        public Criteria andActivitiesIsNull() {
            addCriterion("activities is null");
            return (Criteria) this;
        }

        public Criteria andActivitiesIsNotNull() {
            addCriterion("activities is not null");
            return (Criteria) this;
        }

        public Criteria andActivitiesEqualTo(String value) {
            addCriterion("activities =", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotEqualTo(String value) {
            addCriterion("activities <>", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesGreaterThan(String value) {
            addCriterion("activities >", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesGreaterThanOrEqualTo(String value) {
            addCriterion("activities >=", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesLessThan(String value) {
            addCriterion("activities <", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesLessThanOrEqualTo(String value) {
            addCriterion("activities <=", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesLike(String value) {
            addCriterion("activities like", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotLike(String value) {
            addCriterion("activities not like", value, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesIn(List<String> values) {
            addCriterion("activities in", values, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotIn(List<String> values) {
            addCriterion("activities not in", values, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesBetween(String value1, String value2) {
            addCriterion("activities between", value1, value2, "activities");
            return (Criteria) this;
        }

        public Criteria andActivitiesNotBetween(String value1, String value2) {
            addCriterion("activities not between", value1, value2, "activities");
            return (Criteria) this;
        }

        public Criteria andIscojobIsNull() {
            addCriterion("iscojob is null");
            return (Criteria) this;
        }

        public Criteria andIscojobIsNotNull() {
            addCriterion("iscojob is not null");
            return (Criteria) this;
        }

        public Criteria andIscojobEqualTo(String value) {
            addCriterion("iscojob =", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobNotEqualTo(String value) {
            addCriterion("iscojob <>", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobGreaterThan(String value) {
            addCriterion("iscojob >", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobGreaterThanOrEqualTo(String value) {
            addCriterion("iscojob >=", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobLessThan(String value) {
            addCriterion("iscojob <", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobLessThanOrEqualTo(String value) {
            addCriterion("iscojob <=", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobLike(String value) {
            addCriterion("iscojob like", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobNotLike(String value) {
            addCriterion("iscojob not like", value, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobIn(List<String> values) {
            addCriterion("iscojob in", values, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobNotIn(List<String> values) {
            addCriterion("iscojob not in", values, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobBetween(String value1, String value2) {
            addCriterion("iscojob between", value1, value2, "iscojob");
            return (Criteria) this;
        }

        public Criteria andIscojobNotBetween(String value1, String value2) {
            addCriterion("iscojob not between", value1, value2, "iscojob");
            return (Criteria) this;
        }

        public Criteria andJingdongIsNull() {
            addCriterion("jingdong is null");
            return (Criteria) this;
        }

        public Criteria andJingdongIsNotNull() {
            addCriterion("jingdong is not null");
            return (Criteria) this;
        }

        public Criteria andJingdongEqualTo(String value) {
            addCriterion("jingdong =", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongNotEqualTo(String value) {
            addCriterion("jingdong <>", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongGreaterThan(String value) {
            addCriterion("jingdong >", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongGreaterThanOrEqualTo(String value) {
            addCriterion("jingdong >=", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongLessThan(String value) {
            addCriterion("jingdong <", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongLessThanOrEqualTo(String value) {
            addCriterion("jingdong <=", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongLike(String value) {
            addCriterion("jingdong like", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongNotLike(String value) {
            addCriterion("jingdong not like", value, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongIn(List<String> values) {
            addCriterion("jingdong in", values, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongNotIn(List<String> values) {
            addCriterion("jingdong not in", values, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongBetween(String value1, String value2) {
            addCriterion("jingdong between", value1, value2, "jingdong");
            return (Criteria) this;
        }

        public Criteria andJingdongNotBetween(String value1, String value2) {
            addCriterion("jingdong not between", value1, value2, "jingdong");
            return (Criteria) this;
        }

        public Criteria andZhimaIsNull() {
            addCriterion("zhima is null");
            return (Criteria) this;
        }

        public Criteria andZhimaIsNotNull() {
            addCriterion("zhima is not null");
            return (Criteria) this;
        }

        public Criteria andZhimaEqualTo(String value) {
            addCriterion("zhima =", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaNotEqualTo(String value) {
            addCriterion("zhima <>", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaGreaterThan(String value) {
            addCriterion("zhima >", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaGreaterThanOrEqualTo(String value) {
            addCriterion("zhima >=", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaLessThan(String value) {
            addCriterion("zhima <", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaLessThanOrEqualTo(String value) {
            addCriterion("zhima <=", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaLike(String value) {
            addCriterion("zhima like", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaNotLike(String value) {
            addCriterion("zhima not like", value, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaIn(List<String> values) {
            addCriterion("zhima in", values, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaNotIn(List<String> values) {
            addCriterion("zhima not in", values, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaBetween(String value1, String value2) {
            addCriterion("zhima between", value1, value2, "zhima");
            return (Criteria) this;
        }

        public Criteria andZhimaNotBetween(String value1, String value2) {
            addCriterion("zhima not between", value1, value2, "zhima");
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