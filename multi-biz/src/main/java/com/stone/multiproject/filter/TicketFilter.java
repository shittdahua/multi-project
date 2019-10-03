package com.stone.multiproject.filter;

import com.stone.multiproject.context.TicketContext;

public interface TicketFilter {

    boolean match(TicketContext context);

    TicketContext filter(TicketContext context);
}
