package com.stone.multiproject.filter;

import com.stone.multiproject.context.TicketContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
        long l = System.currentTimeMillis();
        TicketContext ticketContext = filterByContext(context);
        log.warn("{} cost time :{}ms", this.getClass().getName(), System.currentTimeMillis() - l);
        return ticketContext;
    }

    protected abstract TicketContext filterByContext(TicketContext context);
}
