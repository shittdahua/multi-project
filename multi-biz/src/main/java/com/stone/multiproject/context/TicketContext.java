package com.stone.multiproject.context;

import com.stone.multiproject.entity.TicketNumber;

import java.util.List;

public interface TicketContext {

    /**
     * 获取彩票编码
     * @return
     */
    String getTicketCode();

    /**
     * 获取彩票的预测数据
     * @return
     */
    List<TicketNumber> getTicketPlanData();

    /**
     * 设置彩票的预测数据
     * @param ticketNumberList
     * @return
     */
    List<TicketNumber> setTicketPlanData(List<TicketNumber> ticketNumberList);

    /**
     * 获取彩票的历史数据
     * @return
     */
    List<TicketNumber> getTicketHistoryData();

    /**
     * 是否结束
     * @return
     */
    boolean isTerminate();

    /**
     * 设置是否结束
     * @param isTerminate
     * @return
     */
    boolean isTerminate(boolean isTerminate);
}
