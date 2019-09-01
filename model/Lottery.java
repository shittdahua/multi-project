package model;

import java.util.Date;

/**
 * Table: lottery
 */
public class Lottery {
    /**
     * Column: id
     */
    private Long id;

    /**
     * Column: gmt_create
     * Remark: 创建时间
     */
    private Date gmtCreate;

    /**
     * Column: gmt_modified
     * Remark: 修改时间
     */
    private Date gmtModified;

    /**
     * Column: lottery_id
     * Remark: 彩票ID
     */
    private String lotteryId;

    /**
     * Column: lottery_name
     * Remark: 彩票名称
     */
    private String lotteryName;

    /**
     * Column: lottery_res
     * Remark: 开奖结果
     */
    private String lotteryRes;

    /**
     * Column: lottery_no
     * Remark: 开奖期号
     */
    private String lotteryNo;

    /**
     * Column: lottery_date
     * Remark: 开奖日期
     */
    private String lotteryDate;

    /**
     * Column: lottery_exdate
     * Remark: 兑奖截止日期
     */
    private String lotteryExdate;

    /**
     * Column: lottery_sale_amount
     * Remark: 本期销售额，可能为空
     */
    private String lotterySaleAmount;

    /**
     * Column: lottery_pool_amount
     * Remark: 奖池滚存，可能为空
     */
    private String lotteryPoolAmount;

    /**
     * Column: lottery_prize
     * Remark: 开奖详情，可能为null
     */
    private String lotteryPrize;

    /**
     * Column: prize_name
     * Remark: 奖项名称
     */
    private String prizeName;

    /**
     * Column: prize_num
     * Remark: 中奖数量，公布数据可能延时可能为空或--
     */
    private String prizeNum;

    /**
     * Column: prize_amount
     * Remark: 中奖金额
     */
    private String prizeAmount;

    /**
     * Column: prize_require
     * Remark: 中奖条件
     */
    private String prizeRequire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId == null ? null : lotteryId.trim();
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public String getLotteryRes() {
        return lotteryRes;
    }

    public void setLotteryRes(String lotteryRes) {
        this.lotteryRes = lotteryRes == null ? null : lotteryRes.trim();
    }

    public String getLotteryNo() {
        return lotteryNo;
    }

    public void setLotteryNo(String lotteryNo) {
        this.lotteryNo = lotteryNo == null ? null : lotteryNo.trim();
    }

    public String getLotteryDate() {
        return lotteryDate;
    }

    public void setLotteryDate(String lotteryDate) {
        this.lotteryDate = lotteryDate == null ? null : lotteryDate.trim();
    }

    public String getLotteryExdate() {
        return lotteryExdate;
    }

    public void setLotteryExdate(String lotteryExdate) {
        this.lotteryExdate = lotteryExdate == null ? null : lotteryExdate.trim();
    }

    public String getLotterySaleAmount() {
        return lotterySaleAmount;
    }

    public void setLotterySaleAmount(String lotterySaleAmount) {
        this.lotterySaleAmount = lotterySaleAmount == null ? null : lotterySaleAmount.trim();
    }

    public String getLotteryPoolAmount() {
        return lotteryPoolAmount;
    }

    public void setLotteryPoolAmount(String lotteryPoolAmount) {
        this.lotteryPoolAmount = lotteryPoolAmount == null ? null : lotteryPoolAmount.trim();
    }

    public String getLotteryPrize() {
        return lotteryPrize;
    }

    public void setLotteryPrize(String lotteryPrize) {
        this.lotteryPrize = lotteryPrize == null ? null : lotteryPrize.trim();
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public String getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(String prizeNum) {
        this.prizeNum = prizeNum == null ? null : prizeNum.trim();
    }

    public String getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(String prizeAmount) {
        this.prizeAmount = prizeAmount == null ? null : prizeAmount.trim();
    }

    public String getPrizeRequire() {
        return prizeRequire;
    }

    public void setPrizeRequire(String prizeRequire) {
        this.prizeRequire = prizeRequire == null ? null : prizeRequire.trim();
    }
}