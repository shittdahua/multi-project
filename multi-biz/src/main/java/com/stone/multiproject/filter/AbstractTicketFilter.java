package com.stone.multiproject.filter;

import com.stone.multiproject.context.TicketContext;

public abstract class AbstractTicketFilter implements TicketFilter{

    @Override
    public boolean match(TicketContext context) {
        if (context == null) {
            context.isTerminate(true);
            return false;
        }
        return matchByCode(context);
    }

    protected abstract boolean matchByCode(TicketContext context);

    @Override
    public TicketContext filter(TicketContext context) {
        if (context.isTerminate()) {
            return context;
        }
        return filterByContext(context);
    }

    protected abstract TicketContext filterByContext(TicketContext context);
}
