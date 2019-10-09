package com.stone.multiproject.filter.dlt;

import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.context.TicketContext;
import com.stone.multiproject.filter.AbstractTicketFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DltSkipFilter extends AbstractTicketFilter {

    @Override
    protected boolean matchByCode(TicketContext context) {
        return Constant.DLT_TICKET.equals(context.getTicketCode());
    }

    @Override
    protected TicketContext filterByContext(TicketContext context) {
        //01 12 23 34 45 6- 跨度过滤

        //[新码] 连续五期以上未出现的号码
        //        [旧码] 前七期内出现过的号码

        //折线图：极号间距
        return context;
    }
}
