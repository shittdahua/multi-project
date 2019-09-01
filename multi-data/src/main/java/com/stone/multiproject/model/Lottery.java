package com.stone.multiproject.model;

import com.stone.multiproject.base.BaseDO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Lottery extends BaseDO {

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
}
