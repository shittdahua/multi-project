package com.stone.multiproject.filter.dlt;

import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.context.TicketContext;
import com.stone.multiproject.entity.TicketNumber;
import com.stone.multiproject.filter.AbstractTicketFilter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DltMaxEmptyNumberFilter extends AbstractTicketFilter {

    @Override
    protected boolean matchByCode(TicketContext context) {
        return Constant.DLT_TICKET.equals(context.getTicketCode());
    }

    @Override
    protected TicketContext filterByContext(TicketContext context) {
        List<TicketNumber> ticketHistoryData = context.getTicketHistoryData();
        List<TicketNumber> ticketPlanData = context.getTicketPlanData();

        return context;
    }
}
