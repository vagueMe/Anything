package com.dllg.ebpay.model.generator;

import java.util.ArrayList;
import java.util.List;

public class PubPayCityExample {
    /**
     * This field was generated by MyBatis Generator, do not modify.
     * This field corresponds to the database table pub_pay_city
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator, do not modify.
     * This field corresponds to the database table pub_pay_city
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator, do not modify.
     * This field corresponds to the database table pub_pay_city
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public PubPayCityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *   pub_pay_city
     * @mbg.generated
     */
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

        public Criteria andCityAreacodeIsNull() {
            addCriterion("city_areacode is null");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeIsNotNull() {
            addCriterion("city_areacode is not null");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeEqualTo(String value) {
            addCriterion("city_areacode =", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeNotEqualTo(String value) {
            addCriterion("city_areacode <>", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeGreaterThan(String value) {
            addCriterion("city_areacode >", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_areacode >=", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeLessThan(String value) {
            addCriterion("city_areacode <", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeLessThanOrEqualTo(String value) {
            addCriterion("city_areacode <=", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeLike(String value) {
            addCriterion("city_areacode like", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeNotLike(String value) {
            addCriterion("city_areacode not like", value, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeIn(List<String> values) {
            addCriterion("city_areacode in", values, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeNotIn(List<String> values) {
            addCriterion("city_areacode not in", values, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeBetween(String value1, String value2) {
            addCriterion("city_areacode between", value1, value2, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreacodeNotBetween(String value1, String value2) {
            addCriterion("city_areacode not between", value1, value2, "cityAreacode");
            return (Criteria) this;
        }

        public Criteria andCityAreanameIsNull() {
            addCriterion("city_areaname is null");
            return (Criteria) this;
        }

        public Criteria andCityAreanameIsNotNull() {
            addCriterion("city_areaname is not null");
            return (Criteria) this;
        }

        public Criteria andCityAreanameEqualTo(String value) {
            addCriterion("city_areaname =", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameNotEqualTo(String value) {
            addCriterion("city_areaname <>", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameGreaterThan(String value) {
            addCriterion("city_areaname >", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("city_areaname >=", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameLessThan(String value) {
            addCriterion("city_areaname <", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameLessThanOrEqualTo(String value) {
            addCriterion("city_areaname <=", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameLike(String value) {
            addCriterion("city_areaname like", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameNotLike(String value) {
            addCriterion("city_areaname not like", value, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameIn(List<String> values) {
            addCriterion("city_areaname in", values, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameNotIn(List<String> values) {
            addCriterion("city_areaname not in", values, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameBetween(String value1, String value2) {
            addCriterion("city_areaname between", value1, value2, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreanameNotBetween(String value1, String value2) {
            addCriterion("city_areaname not between", value1, value2, "cityAreaname");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeIsNull() {
            addCriterion("city_areatype is null");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeIsNotNull() {
            addCriterion("city_areatype is not null");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeEqualTo(String value) {
            addCriterion("city_areatype =", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeNotEqualTo(String value) {
            addCriterion("city_areatype <>", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeGreaterThan(String value) {
            addCriterion("city_areatype >", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeGreaterThanOrEqualTo(String value) {
            addCriterion("city_areatype >=", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeLessThan(String value) {
            addCriterion("city_areatype <", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeLessThanOrEqualTo(String value) {
            addCriterion("city_areatype <=", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeLike(String value) {
            addCriterion("city_areatype like", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeNotLike(String value) {
            addCriterion("city_areatype not like", value, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeIn(List<String> values) {
            addCriterion("city_areatype in", values, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeNotIn(List<String> values) {
            addCriterion("city_areatype not in", values, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeBetween(String value1, String value2) {
            addCriterion("city_areatype between", value1, value2, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityAreatypeNotBetween(String value1, String value2) {
            addCriterion("city_areatype not between", value1, value2, "cityAreatype");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeIsNull() {
            addCriterion("city_nodecode is null");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeIsNotNull() {
            addCriterion("city_nodecode is not null");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeEqualTo(String value) {
            addCriterion("city_nodecode =", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeNotEqualTo(String value) {
            addCriterion("city_nodecode <>", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeGreaterThan(String value) {
            addCriterion("city_nodecode >", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_nodecode >=", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeLessThan(String value) {
            addCriterion("city_nodecode <", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeLessThanOrEqualTo(String value) {
            addCriterion("city_nodecode <=", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeLike(String value) {
            addCriterion("city_nodecode like", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeNotLike(String value) {
            addCriterion("city_nodecode not like", value, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeIn(List<String> values) {
            addCriterion("city_nodecode in", values, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeNotIn(List<String> values) {
            addCriterion("city_nodecode not in", values, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeBetween(String value1, String value2) {
            addCriterion("city_nodecode between", value1, value2, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityNodecodeNotBetween(String value1, String value2) {
            addCriterion("city_nodecode not between", value1, value2, "cityNodecode");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1IsNull() {
            addCriterion("city_topareacode1 is null");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1IsNotNull() {
            addCriterion("city_topareacode1 is not null");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1EqualTo(String value) {
            addCriterion("city_topareacode1 =", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1NotEqualTo(String value) {
            addCriterion("city_topareacode1 <>", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1GreaterThan(String value) {
            addCriterion("city_topareacode1 >", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1GreaterThanOrEqualTo(String value) {
            addCriterion("city_topareacode1 >=", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1LessThan(String value) {
            addCriterion("city_topareacode1 <", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1LessThanOrEqualTo(String value) {
            addCriterion("city_topareacode1 <=", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1Like(String value) {
            addCriterion("city_topareacode1 like", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1NotLike(String value) {
            addCriterion("city_topareacode1 not like", value, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1In(List<String> values) {
            addCriterion("city_topareacode1 in", values, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1NotIn(List<String> values) {
            addCriterion("city_topareacode1 not in", values, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1Between(String value1, String value2) {
            addCriterion("city_topareacode1 between", value1, value2, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode1NotBetween(String value1, String value2) {
            addCriterion("city_topareacode1 not between", value1, value2, "cityTopareacode1");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2IsNull() {
            addCriterion("city_topareacode2 is null");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2IsNotNull() {
            addCriterion("city_topareacode2 is not null");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2EqualTo(String value) {
            addCriterion("city_topareacode2 =", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2NotEqualTo(String value) {
            addCriterion("city_topareacode2 <>", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2GreaterThan(String value) {
            addCriterion("city_topareacode2 >", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2GreaterThanOrEqualTo(String value) {
            addCriterion("city_topareacode2 >=", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2LessThan(String value) {
            addCriterion("city_topareacode2 <", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2LessThanOrEqualTo(String value) {
            addCriterion("city_topareacode2 <=", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2Like(String value) {
            addCriterion("city_topareacode2 like", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2NotLike(String value) {
            addCriterion("city_topareacode2 not like", value, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2In(List<String> values) {
            addCriterion("city_topareacode2 in", values, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2NotIn(List<String> values) {
            addCriterion("city_topareacode2 not in", values, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2Between(String value1, String value2) {
            addCriterion("city_topareacode2 between", value1, value2, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode2NotBetween(String value1, String value2) {
            addCriterion("city_topareacode2 not between", value1, value2, "cityTopareacode2");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3IsNull() {
            addCriterion("city_topareacode3 is null");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3IsNotNull() {
            addCriterion("city_topareacode3 is not null");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3EqualTo(String value) {
            addCriterion("city_topareacode3 =", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3NotEqualTo(String value) {
            addCriterion("city_topareacode3 <>", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3GreaterThan(String value) {
            addCriterion("city_topareacode3 >", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3GreaterThanOrEqualTo(String value) {
            addCriterion("city_topareacode3 >=", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3LessThan(String value) {
            addCriterion("city_topareacode3 <", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3LessThanOrEqualTo(String value) {
            addCriterion("city_topareacode3 <=", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3Like(String value) {
            addCriterion("city_topareacode3 like", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3NotLike(String value) {
            addCriterion("city_topareacode3 not like", value, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3In(List<String> values) {
            addCriterion("city_topareacode3 in", values, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3NotIn(List<String> values) {
            addCriterion("city_topareacode3 not in", values, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3Between(String value1, String value2) {
            addCriterion("city_topareacode3 between", value1, value2, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityTopareacode3NotBetween(String value1, String value2) {
            addCriterion("city_topareacode3 not between", value1, value2, "cityTopareacode3");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeIsNull() {
            addCriterion("city_oraareacode is null");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeIsNotNull() {
            addCriterion("city_oraareacode is not null");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeEqualTo(String value) {
            addCriterion("city_oraareacode =", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeNotEqualTo(String value) {
            addCriterion("city_oraareacode <>", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeGreaterThan(String value) {
            addCriterion("city_oraareacode >", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_oraareacode >=", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeLessThan(String value) {
            addCriterion("city_oraareacode <", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeLessThanOrEqualTo(String value) {
            addCriterion("city_oraareacode <=", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeLike(String value) {
            addCriterion("city_oraareacode like", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeNotLike(String value) {
            addCriterion("city_oraareacode not like", value, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeIn(List<String> values) {
            addCriterion("city_oraareacode in", values, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeNotIn(List<String> values) {
            addCriterion("city_oraareacode not in", values, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeBetween(String value1, String value2) {
            addCriterion("city_oraareacode between", value1, value2, "cityOraareacode");
            return (Criteria) this;
        }

        public Criteria andCityOraareacodeNotBetween(String value1, String value2) {
            addCriterion("city_oraareacode not between", value1, value2, "cityOraareacode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator, do not modify.
     *   pub_pay_city
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *   pub_pay_city
     * @mbg.generated
     */
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