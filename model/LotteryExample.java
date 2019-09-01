package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public LotteryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(String value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(String value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(String value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(String value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(String value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLike(String value) {
            addCriterion("lottery_id like", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotLike(String value) {
            addCriterion("lottery_id not like", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<String> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<String> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(String value1, String value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(String value1, String value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNull() {
            addCriterion("lottery_name is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNotNull() {
            addCriterion("lottery_name is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameEqualTo(String value) {
            addCriterion("lottery_name =", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotEqualTo(String value) {
            addCriterion("lottery_name <>", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThan(String value) {
            addCriterion("lottery_name >", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_name >=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThan(String value) {
            addCriterion("lottery_name <", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThanOrEqualTo(String value) {
            addCriterion("lottery_name <=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLike(String value) {
            addCriterion("lottery_name like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotLike(String value) {
            addCriterion("lottery_name not like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIn(List<String> values) {
            addCriterion("lottery_name in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotIn(List<String> values) {
            addCriterion("lottery_name not in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameBetween(String value1, String value2) {
            addCriterion("lottery_name between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotBetween(String value1, String value2) {
            addCriterion("lottery_name not between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryResIsNull() {
            addCriterion("lottery_res is null");
            return (Criteria) this;
        }

        public Criteria andLotteryResIsNotNull() {
            addCriterion("lottery_res is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryResEqualTo(String value) {
            addCriterion("lottery_res =", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResNotEqualTo(String value) {
            addCriterion("lottery_res <>", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResGreaterThan(String value) {
            addCriterion("lottery_res >", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_res >=", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResLessThan(String value) {
            addCriterion("lottery_res <", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResLessThanOrEqualTo(String value) {
            addCriterion("lottery_res <=", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResLike(String value) {
            addCriterion("lottery_res like", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResNotLike(String value) {
            addCriterion("lottery_res not like", value, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResIn(List<String> values) {
            addCriterion("lottery_res in", values, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResNotIn(List<String> values) {
            addCriterion("lottery_res not in", values, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResBetween(String value1, String value2) {
            addCriterion("lottery_res between", value1, value2, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryResNotBetween(String value1, String value2) {
            addCriterion("lottery_res not between", value1, value2, "lotteryRes");
            return (Criteria) this;
        }

        public Criteria andLotteryNoIsNull() {
            addCriterion("lottery_no is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNoIsNotNull() {
            addCriterion("lottery_no is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNoEqualTo(String value) {
            addCriterion("lottery_no =", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotEqualTo(String value) {
            addCriterion("lottery_no <>", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoGreaterThan(String value) {
            addCriterion("lottery_no >", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_no >=", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoLessThan(String value) {
            addCriterion("lottery_no <", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoLessThanOrEqualTo(String value) {
            addCriterion("lottery_no <=", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoLike(String value) {
            addCriterion("lottery_no like", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotLike(String value) {
            addCriterion("lottery_no not like", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoIn(List<String> values) {
            addCriterion("lottery_no in", values, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotIn(List<String> values) {
            addCriterion("lottery_no not in", values, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoBetween(String value1, String value2) {
            addCriterion("lottery_no between", value1, value2, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotBetween(String value1, String value2) {
            addCriterion("lottery_no not between", value1, value2, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryDateIsNull() {
            addCriterion("lottery_date is null");
            return (Criteria) this;
        }

        public Criteria andLotteryDateIsNotNull() {
            addCriterion("lottery_date is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryDateEqualTo(String value) {
            addCriterion("lottery_date =", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotEqualTo(String value) {
            addCriterion("lottery_date <>", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateGreaterThan(String value) {
            addCriterion("lottery_date >", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_date >=", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateLessThan(String value) {
            addCriterion("lottery_date <", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateLessThanOrEqualTo(String value) {
            addCriterion("lottery_date <=", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateLike(String value) {
            addCriterion("lottery_date like", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotLike(String value) {
            addCriterion("lottery_date not like", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateIn(List<String> values) {
            addCriterion("lottery_date in", values, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotIn(List<String> values) {
            addCriterion("lottery_date not in", values, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateBetween(String value1, String value2) {
            addCriterion("lottery_date between", value1, value2, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotBetween(String value1, String value2) {
            addCriterion("lottery_date not between", value1, value2, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateIsNull() {
            addCriterion("lottery_exdate is null");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateIsNotNull() {
            addCriterion("lottery_exdate is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateEqualTo(String value) {
            addCriterion("lottery_exdate =", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateNotEqualTo(String value) {
            addCriterion("lottery_exdate <>", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateGreaterThan(String value) {
            addCriterion("lottery_exdate >", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_exdate >=", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateLessThan(String value) {
            addCriterion("lottery_exdate <", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateLessThanOrEqualTo(String value) {
            addCriterion("lottery_exdate <=", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateLike(String value) {
            addCriterion("lottery_exdate like", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateNotLike(String value) {
            addCriterion("lottery_exdate not like", value, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateIn(List<String> values) {
            addCriterion("lottery_exdate in", values, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateNotIn(List<String> values) {
            addCriterion("lottery_exdate not in", values, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateBetween(String value1, String value2) {
            addCriterion("lottery_exdate between", value1, value2, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotteryExdateNotBetween(String value1, String value2) {
            addCriterion("lottery_exdate not between", value1, value2, "lotteryExdate");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountIsNull() {
            addCriterion("lottery_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountIsNotNull() {
            addCriterion("lottery_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountEqualTo(String value) {
            addCriterion("lottery_sale_amount =", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotEqualTo(String value) {
            addCriterion("lottery_sale_amount <>", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountGreaterThan(String value) {
            addCriterion("lottery_sale_amount >", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_sale_amount >=", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountLessThan(String value) {
            addCriterion("lottery_sale_amount <", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountLessThanOrEqualTo(String value) {
            addCriterion("lottery_sale_amount <=", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountLike(String value) {
            addCriterion("lottery_sale_amount like", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotLike(String value) {
            addCriterion("lottery_sale_amount not like", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountIn(List<String> values) {
            addCriterion("lottery_sale_amount in", values, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotIn(List<String> values) {
            addCriterion("lottery_sale_amount not in", values, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountBetween(String value1, String value2) {
            addCriterion("lottery_sale_amount between", value1, value2, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotBetween(String value1, String value2) {
            addCriterion("lottery_sale_amount not between", value1, value2, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountIsNull() {
            addCriterion("lottery_pool_amount is null");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountIsNotNull() {
            addCriterion("lottery_pool_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountEqualTo(String value) {
            addCriterion("lottery_pool_amount =", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotEqualTo(String value) {
            addCriterion("lottery_pool_amount <>", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountGreaterThan(String value) {
            addCriterion("lottery_pool_amount >", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_pool_amount >=", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountLessThan(String value) {
            addCriterion("lottery_pool_amount <", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountLessThanOrEqualTo(String value) {
            addCriterion("lottery_pool_amount <=", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountLike(String value) {
            addCriterion("lottery_pool_amount like", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotLike(String value) {
            addCriterion("lottery_pool_amount not like", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountIn(List<String> values) {
            addCriterion("lottery_pool_amount in", values, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotIn(List<String> values) {
            addCriterion("lottery_pool_amount not in", values, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountBetween(String value1, String value2) {
            addCriterion("lottery_pool_amount between", value1, value2, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotBetween(String value1, String value2) {
            addCriterion("lottery_pool_amount not between", value1, value2, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeIsNull() {
            addCriterion("lottery_prize is null");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeIsNotNull() {
            addCriterion("lottery_prize is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeEqualTo(String value) {
            addCriterion("lottery_prize =", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeNotEqualTo(String value) {
            addCriterion("lottery_prize <>", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeGreaterThan(String value) {
            addCriterion("lottery_prize >", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_prize >=", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeLessThan(String value) {
            addCriterion("lottery_prize <", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeLessThanOrEqualTo(String value) {
            addCriterion("lottery_prize <=", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeLike(String value) {
            addCriterion("lottery_prize like", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeNotLike(String value) {
            addCriterion("lottery_prize not like", value, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeIn(List<String> values) {
            addCriterion("lottery_prize in", values, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeNotIn(List<String> values) {
            addCriterion("lottery_prize not in", values, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeBetween(String value1, String value2) {
            addCriterion("lottery_prize between", value1, value2, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andLotteryPrizeNotBetween(String value1, String value2) {
            addCriterion("lottery_prize not between", value1, value2, "lotteryPrize");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNull() {
            addCriterion("prize_num is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNotNull() {
            addCriterion("prize_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumEqualTo(String value) {
            addCriterion("prize_num =", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotEqualTo(String value) {
            addCriterion("prize_num <>", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThan(String value) {
            addCriterion("prize_num >", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThanOrEqualTo(String value) {
            addCriterion("prize_num >=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThan(String value) {
            addCriterion("prize_num <", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThanOrEqualTo(String value) {
            addCriterion("prize_num <=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLike(String value) {
            addCriterion("prize_num like", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotLike(String value) {
            addCriterion("prize_num not like", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIn(List<String> values) {
            addCriterion("prize_num in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotIn(List<String> values) {
            addCriterion("prize_num not in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumBetween(String value1, String value2) {
            addCriterion("prize_num between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotBetween(String value1, String value2) {
            addCriterion("prize_num not between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNull() {
            addCriterion("prize_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNotNull() {
            addCriterion("prize_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountEqualTo(String value) {
            addCriterion("prize_amount =", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotEqualTo(String value) {
            addCriterion("prize_amount <>", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThan(String value) {
            addCriterion("prize_amount >", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThanOrEqualTo(String value) {
            addCriterion("prize_amount >=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThan(String value) {
            addCriterion("prize_amount <", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThanOrEqualTo(String value) {
            addCriterion("prize_amount <=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLike(String value) {
            addCriterion("prize_amount like", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotLike(String value) {
            addCriterion("prize_amount not like", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIn(List<String> values) {
            addCriterion("prize_amount in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotIn(List<String> values) {
            addCriterion("prize_amount not in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountBetween(String value1, String value2) {
            addCriterion("prize_amount between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotBetween(String value1, String value2) {
            addCriterion("prize_amount not between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireIsNull() {
            addCriterion("prize_require is null");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireIsNotNull() {
            addCriterion("prize_require is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireEqualTo(String value) {
            addCriterion("prize_require =", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireNotEqualTo(String value) {
            addCriterion("prize_require <>", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireGreaterThan(String value) {
            addCriterion("prize_require >", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireGreaterThanOrEqualTo(String value) {
            addCriterion("prize_require >=", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireLessThan(String value) {
            addCriterion("prize_require <", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireLessThanOrEqualTo(String value) {
            addCriterion("prize_require <=", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireLike(String value) {
            addCriterion("prize_require like", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireNotLike(String value) {
            addCriterion("prize_require not like", value, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireIn(List<String> values) {
            addCriterion("prize_require in", values, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireNotIn(List<String> values) {
            addCriterion("prize_require not in", values, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireBetween(String value1, String value2) {
            addCriterion("prize_require between", value1, value2, "prizeRequire");
            return (Criteria) this;
        }

        public Criteria andPrizeRequireNotBetween(String value1, String value2) {
            addCriterion("prize_require not between", value1, value2, "prizeRequire");
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