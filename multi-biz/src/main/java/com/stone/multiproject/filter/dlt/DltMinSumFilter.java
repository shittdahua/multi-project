package com.stone.multiproject.filter.dlt;

import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.context.TicketContext;
import com.stone.multiproject.entity.TicketNumber;
import com.stone.multiproject.filter.AbstractTicketFilter;
import com.stone.multiproject.utils.TicketNumberHelper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class DltMinSumFilter extends AbstractTicketFilter {

    @Override
    protected boolean matchByCode(TicketContext context) {
        return Constant.DLT_TICKET.equals(context.getTicketCode());
    }

    @Override
    protected TicketContext filterByContext(TicketContext context) {
        List<TicketNumber> ticketData = context.getTicketPlanData();
        List<TicketNumber> ticketHistoryData = context.getTicketHistoryData();
        //1,常规数字最大最小和特殊数字最大最小
        Map<Integer, List<Integer>> normalNumberMap = ticketHistoryData.stream()
                .map(this::sumNormalTicketNumber)
                .collect(Collectors.groupingBy(o -> o));
        Map<Integer, List<Integer>> specialNumberMap = ticketHistoryData.stream()
                .map(this::sumSpecialTicketNumber)
                .collect(Collectors.groupingBy(o -> o));
        //2,所有最大最小
        Map<Integer, List<Integer>> allNumberMap = ticketHistoryData.stream()
                .map(this::sumAllTicketNumber)
                .collect(Collectors.groupingBy(o -> o));

        List<TicketNumber> result = ticketData.stream()
                .filter(o -> {
                    return normalNumberMap.getOrDefault(sumNormalTicketNumber(o), Collections.emptyList()).size() > 2;
                })
                .filter(o -> {
                    return specialNumberMap.getOrDefault(sumSpecialTicketNumber(o), Collections.emptyList()).size() > 2;
                })
                .filter(o -> {
                    return allNumberMap.getOrDefault(sumAllTicketNumber(o), Collections.emptyList()).size() > 2;
                })
                .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(result)) {
            context.isTerminate(true);
        }
        context.setTicketPlanData(result);
        return context;
    }

    private int sumNormalTicketNumber(TicketNumber o) {
        return TicketNumberHelper.sumList(o.getNormalNumber());
    }

    private int sumSpecialTicketNumber(TicketNumber o) {
        return TicketNumberHelper.sumList(o.getSpecialNumber());
    }

    private int sumAllTicketNumber(TicketNumber o) {
        return TicketNumberHelper.sumList(o.getNormalNumber()) + TicketNumberHelper.sumList(o.getSpecialNumber());
    }
}
