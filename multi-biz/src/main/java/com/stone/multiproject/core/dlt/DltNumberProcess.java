package com.stone.multiproject.core.dlt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.entity.TicketNumber;
import com.stone.multiproject.model.Lottery;
import com.stone.multiproject.service.LotteryServiceImpl;
import com.stone.multiproject.utils.DateHelp;
import com.stone.multiproject.utils.LoopQueryHelper;
import com.stone.multiproject.utils.TicketNumberHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DltNumberProcess {

    @Resource
    LotteryServiceImpl lotteryService;

    public void doProcess() {
        //
        QueryWrapper<Lottery> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("lottery_id", Constant.DLT_TICKET);
        List<Lottery> lotteries = new LoopQueryHelper<Lottery>() {
        }.loopQuery(iPage -> lotteryService.queryByPage(iPage, queryWrapper));

        List<TicketNumber> dbData = lotteries.stream()
                .map(o -> TicketNumber.of(
                        o.getLotteryNo(),
                        DateHelp.convert(o.getLotteryDate(), DateHelp.DATE_FORMAT),
                        TicketNumberHelper.parseNormalNumber(o.getLotteryRes(), 2),
                        TicketNumberHelper.parseSpecialNumber(o.getLotteryRes(), 2)))
                .sorted((a, b) -> a.getLotteryDate().compareTo(b.getLotteryDate()))
                .collect(Collectors.toList());

        List<TicketNumber> ticket = TicketNumberHelper.createTicket(100, Constant.DLT_TICKET);
    }

}
