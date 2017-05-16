package cn.creditmanage.po;

import java.util.ArrayList;
import java.util.List;

public class BasicSituationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicSituationExample() {
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

        public Criteria andBsidIsNull() {
            addCriterion("bsid is null");
            return (Criteria) this;
        }

        public Criteria andBsidIsNotNull() {
            addCriterion("bsid is not null");
            return (Criteria) this;
        }

        public Criteria andBsidEqualTo(Integer value) {
            addCriterion("bsid =", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotEqualTo(Integer value) {
            addCriterion("bsid <>", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThan(Integer value) {
            addCriterion("bsid >", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bsid >=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThan(Integer value) {
            addCriterion("bsid <", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThanOrEqualTo(Integer value) {
            addCriterion("bsid <=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidIn(List<Integer> values) {
            addCriterion("bsid in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotIn(List<Integer> values) {
            addCriterion("bsid not in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidBetween(Integer value1, Integer value2) {
            addCriterion("bsid between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotBetween(Integer value1, Integer value2) {
            addCriterion("bsid not between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsscoreIsNull() {
            addCriterion("bsscore is null");
            return (Criteria) this;
        }

        public Criteria andBsscoreIsNotNull() {
            addCriterion("bsscore is not null");
            return (Criteria) this;
        }

        public Criteria andBsscoreEqualTo(Integer value) {
            addCriterion("bsscore =", value, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreNotEqualTo(Integer value) {
            addCriterion("bsscore <>", value, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreGreaterThan(Integer value) {
            addCriterion("bsscore >", value, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("bsscore >=", value, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreLessThan(Integer value) {
            addCriterion("bsscore <", value, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreLessThanOrEqualTo(Integer value) {
            addCriterion("bsscore <=", value, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreIn(List<Integer> values) {
            addCriterion("bsscore in", values, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreNotIn(List<Integer> values) {
            addCriterion("bsscore not in", values, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreBetween(Integer value1, Integer value2) {
            addCriterion("bsscore between", value1, value2, "bsscore");
            return (Criteria) this;
        }

        public Criteria andBsscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("bsscore not between", value1, value2, "bsscore");
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

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andStartschoolIsNull() {
            addCriterion("startschool is null");
            return (Criteria) this;
        }

        public Criteria andStartschoolIsNotNull() {
            addCriterion("startschool is not null");
            return (Criteria) this;
        }

        public Criteria andStartschoolEqualTo(String value) {
            addCriterion("startschool =", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolNotEqualTo(String value) {
            addCriterion("startschool <>", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolGreaterThan(String value) {
            addCriterion("startschool >", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolGreaterThanOrEqualTo(String value) {
            addCriterion("startschool >=", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolLessThan(String value) {
            addCriterion("startschool <", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolLessThanOrEqualTo(String value) {
            addCriterion("startschool <=", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolLike(String value) {
            addCriterion("startschool like", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolNotLike(String value) {
            addCriterion("startschool not like", value, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolIn(List<String> values) {
            addCriterion("startschool in", values, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolNotIn(List<String> values) {
            addCriterion("startschool not in", values, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolBetween(String value1, String value2) {
            addCriterion("startschool between", value1, value2, "startschool");
            return (Criteria) this;
        }

        public Criteria andStartschoolNotBetween(String value1, String value2) {
            addCriterion("startschool not between", value1, value2, "startschool");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreIsNull() {
            addCriterion("classmatescore is null");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreIsNotNull() {
            addCriterion("classmatescore is not null");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreEqualTo(Integer value) {
            addCriterion("classmatescore =", value, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreNotEqualTo(Integer value) {
            addCriterion("classmatescore <>", value, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreGreaterThan(Integer value) {
            addCriterion("classmatescore >", value, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("classmatescore >=", value, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreLessThan(Integer value) {
            addCriterion("classmatescore <", value, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreLessThanOrEqualTo(Integer value) {
            addCriterion("classmatescore <=", value, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreIn(List<Integer> values) {
            addCriterion("classmatescore in", values, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreNotIn(List<Integer> values) {
            addCriterion("classmatescore not in", values, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreBetween(Integer value1, Integer value2) {
            addCriterion("classmatescore between", value1, value2, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andClassmatescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("classmatescore not between", value1, value2, "classmatescore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreIsNull() {
            addCriterion("teacherscore is null");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreIsNotNull() {
            addCriterion("teacherscore is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreEqualTo(Integer value) {
            addCriterion("teacherscore =", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotEqualTo(Integer value) {
            addCriterion("teacherscore <>", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreGreaterThan(Integer value) {
            addCriterion("teacherscore >", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherscore >=", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreLessThan(Integer value) {
            addCriterion("teacherscore <", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreLessThanOrEqualTo(Integer value) {
            addCriterion("teacherscore <=", value, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreIn(List<Integer> values) {
            addCriterion("teacherscore in", values, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotIn(List<Integer> values) {
            addCriterion("teacherscore not in", values, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreBetween(Integer value1, Integer value2) {
            addCriterion("teacherscore between", value1, value2, "teacherscore");
            return (Criteria) this;
        }

        public Criteria andTeacherscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherscore not between", value1, value2, "teacherscore");
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