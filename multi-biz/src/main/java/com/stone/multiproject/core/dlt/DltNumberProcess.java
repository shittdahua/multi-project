package com.stone.multiproject.core.dlt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.context.DltTicketContext;
import com.stone.multiproject.entity.TicketNumber;
import com.stone.multiproject.filter.TicketFilter;
import com.stone.multiproject.model.Lottery;
import com.stone.multiproject.service.LotteryServiceImpl;
import com.stone.multiproject.utils.DateHelp;
import com.stone.multiproject.utils.LoopQueryHelper;
import com.stone.multiproject.utils.SplitterHelper;
import com.stone.multiproject.utils.TicketNumberHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class DltNumberProcess {

    @Resource
    LotteryServiceImpl lotteryService;

    @Resource
    private List<TicketFilter> ticketFilters;

    public void doProcess(Integer ticketCount) {
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

        TicketNumber winningNumber = dbData.get(dbData.size() - 1);

        List<TicketNumber> ticket = TicketNumberHelper.createTicket(ticketCount, Constant.DLT_TICKET);

        DltTicketContext context = new DltTicketContext();
        context.setTicketPlanData(ticket);
        dbData.remove(dbData.size() - 1);
        context.setTicketHistoryData(dbData);

        ticketFilters.forEach(o -> {
            if (o.match(context)) {
                o.filter(context);
            }
        });

        List<TicketNumber> ticketPlanData = context.getTicketPlanData();

        List<Integer> collect = ticketPlanData.stream().map(o -> TicketNumberHelper.winningCompute(o, winningNumber)).collect(Collectors.toList());
        String collect2 = collect.stream()
                .filter(o -> o != 0)
                .collect(Collectors.groupingBy(o -> o))
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + Constant.UNDER_LINE + entry.getValue().size())
                .sorted((a,b) -> {
                    List<String> aList = SplitterHelper.UNDERLINE_SPLITTER.splitToList(a);
                    List<String> bList = SplitterHelper.UNDERLINE_SPLITTER.splitToList(b);
                    return new BigDecimal(bList.get(0)).compareTo(new BigDecimal(aList.get(0)));
                })
                .collect(Collectors.joining(Constant.SHUXIAN));
        int sum = collect.stream().mapToInt(o -> o).sum();
        int costMoney = ticketPlanData.size() * 2;
        log.warn(Constant.DLT_TICKET + "1买票花了" + costMoney + "元，彩票奖金：" + sum + "元，一共赚了" + (sum - costMoney) + "元,详情：" + collect2);

        List<Integer> collect1 = ticket.stream().map(o -> TicketNumberHelper.winningCompute(o, winningNumber)).collect(Collectors.toList());
        String collect3 = collect1.stream()
                .filter(o -> o != 0)
                .collect(Collectors.groupingBy(o -> o))
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + Constant.UNDER_LINE + entry.getValue().size())
                .sorted((a,b) -> {
                    List<String> aList = SplitterHelper.UNDERLINE_SPLITTER.splitToList(a);
                    List<String> bList = SplitterHelper.UNDERLINE_SPLITTER.splitToList(b);
                    return new BigDecimal(bList.get(0)).compareTo(new BigDecimal(aList.get(0)));
                })
                .collect(Collectors.joining(Constant.SHUXIAN));
        int sum1 = collect1.stream().mapToInt(o -> o).sum();
        int costMoney1 = ticket.size() * 2;
        log.warn(Constant.DLT_TICKET + "2买票花了" + costMoney1 + "元，彩票奖金：" + sum1 + "元，一共赚了" + (sum1 - costMoney1) + "元,详情：" + collect3);
    }

}
