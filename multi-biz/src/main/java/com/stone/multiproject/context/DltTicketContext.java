package com.stone.multiproject.context;

import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.entity.TicketNumber;

import java.util.List;

public class DltTicketContext implements TicketContext {

    private Boolean terminate = false;
    private List<TicketNumber> ticketNumberList;
    private List<TicketNumber> ticketHistoryData;

    @Override
    public String getTicketCode() {
        return Constant.DLT_TICKET;
    }

    @Override
    public List<TicketNumber> getTicketPlanData() {
        return ticketNumberList;
    }

    @Override
    public List<TicketNumber> setTicketPlanData(List<TicketNumber> ticketNumberList) {
        this.ticketNumberList = ticketNumberList;
        return ticketNumberList;
    }

    @Override
    public List<TicketNumber> getTicketHistoryData() {
        return ticketHistoryData;
    }

    public void setTicketHistoryData(List<TicketNumber> ticketHistoryData) {
        this.ticketHistoryData = ticketHistoryData;
    }

    @Override
    public boolean isTerminate() {
        return terminate;
    }

    @Override
    public boolean isTerminate(boolean isTerminate) {
        this.terminate = isTerminate;
        return terminate;
    }
}
