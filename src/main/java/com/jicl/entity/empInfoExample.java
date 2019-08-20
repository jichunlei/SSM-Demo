package com.jicl.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class empInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public empInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIsNull() {
            addCriterion("emp_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIsNotNull() {
            addCriterion("emp_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmpGenderEqualTo(String value) {
            addCriterion("emp_gender =", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotEqualTo(String value) {
            addCriterion("emp_gender <>", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderGreaterThan(String value) {
            addCriterion("emp_gender >", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderGreaterThanOrEqualTo(String value) {
            addCriterion("emp_gender >=", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLessThan(String value) {
            addCriterion("emp_gender <", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLessThanOrEqualTo(String value) {
            addCriterion("emp_gender <=", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLike(String value) {
            addCriterion("emp_gender like", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotLike(String value) {
            addCriterion("emp_gender not like", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIn(List<String> values) {
            addCriterion("emp_gender in", values, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotIn(List<String> values) {
            addCriterion("emp_gender not in", values, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderBetween(String value1, String value2) {
            addCriterion("emp_gender between", value1, value2, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotBetween(String value1, String value2) {
            addCriterion("emp_gender not between", value1, value2, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNull() {
            addCriterion("emp_salary is null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNotNull() {
            addCriterion("emp_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryEqualTo(BigDecimal value) {
            addCriterion("emp_salary =", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotEqualTo(BigDecimal value) {
            addCriterion("emp_salary <>", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThan(BigDecimal value) {
            addCriterion("emp_salary >", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_salary >=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThan(BigDecimal value) {
            addCriterion("emp_salary <", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_salary <=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIn(List<BigDecimal> values) {
            addCriterion("emp_salary in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotIn(List<BigDecimal> values) {
            addCriterion("emp_salary not in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_salary between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_salary not between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNull() {
            addCriterion("emp_birthday is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNotNull() {
            addCriterion("emp_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday =", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday <>", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_birthday >", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday >=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("emp_birthday <", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday <=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("emp_birthday in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_birthday not in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_birthday between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_birthday not between", value1, value2, "empBirthday");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_emp_info
     *
     * @mbg.generated do_not_delete_during_merge Tue Aug 20 22:36:56 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_emp_info
     *
     * @mbg.generated Tue Aug 20 22:36:56 CST 2019
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