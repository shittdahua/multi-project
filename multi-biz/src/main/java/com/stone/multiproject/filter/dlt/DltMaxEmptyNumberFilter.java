package com.stone.multiproject.filter.dlt;

import com.alibaba.fastjson.JSON;
import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.context.TicketContext;
import com.stone.multiproject.entity.TicketNumber;
import com.stone.multiproject.filter.AbstractTicketFilter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Slf4j
public class DltMaxEmptyNumberFilter extends AbstractTicketFilter {

    @Override
    protected boolean matchByCode(TicketContext context) {
        return Constant.DLT_TICKET.equals(context.getTicketCode());
    }

    @Override
    protected TicketContext filterByContext(TicketContext context) {
        int[] dltThreshold = Constant.DLT_THRESHOLD;
        List<TicketNumber> ticketHistoryData = context.getTicketHistoryData();
        Map<Integer, Integer> maxEmptyCountMap = new HashMap<>(35);
        for (Integer i = 1; i <= dltThreshold[1]; i++) {
            int oldDataSize = ticketHistoryData.size();
            List<Integer> normalNumber = ticketHistoryData.get(0).getNormalNumber();
            int historyMaxValue = normalNumber.contains(i) ? 1 : 0;
            int maxValue = historyMaxValue;
            for (Integer j = 1; j < oldDataSize; j++) {
                if (ticketHistoryData.get(j).getNormalNumber().contains(i)) {
                    historyMaxValue = historyMaxValue > maxValue ? historyMaxValue : maxValue;
                    maxValue = 0;
                } else {
                    maxValue++;
                }
            }
            historyMaxValue = historyMaxValue > maxValue ? historyMaxValue : maxValue;
            maxEmptyCountMap.put(i, historyMaxValue);
        }
        log.warn("DltMaxEmptyNumberFilter maxEmptyCountMap: " + JSON.toJSONString(maxEmptyCountMap));
        Map<Integer, Integer> maxEmptySpecialCountMap = new HashMap<>(35);
        for (Integer i = 1; i <= dltThreshold[3]; i++) {
            int oldDataSize = ticketHistoryData.size();
            List<Integer> specialNumber = ticketHistoryData.get(0).getSpecialNumber();
            int historyMaxValue = specialNumber.contains(i) ? 1 : 0;
            int maxValue = historyMaxValue;
            for (Integer j = 1; j < oldDataSize; j++) {
                if (ticketHistoryData.get(j).getNormalNumber().contains(i)) {
                    historyMaxValue = historyMaxValue > maxValue ? historyMaxValue : maxValue;
                    maxValue = 0;
                } else {
                    maxValue++;
                }
            }
            historyMaxValue = historyMaxValue > maxValue ? historyMaxValue : maxValue;
            maxEmptySpecialCountMap.put(i, historyMaxValue);
        }
        log.warn("DltMaxEmptyNumberFilter maxEmptySpecialCountMap: " + JSON.toJSONString(maxEmptySpecialCountMap));
        List<TicketNumber> ticketPlanData = context.getTicketPlanData();
        List<TicketNumber> result = ticketPlanData.stream()
                .filter(o ->
                        !isOverThreshold(o.getNormalNumber(), ticketHistoryData, maxEmptyCountMap, true)
                                && !isOverThreshold(o.getSpecialNumber(), ticketHistoryData, maxEmptySpecialCountMap, false))
                .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(result)) {
            context.isTerminate(true);
        }
        context.setTicketPlanData(result);
        log.warn("DltMaxEmptyNumberFilter filter old size :{}, after size:{}", ticketPlanData.size(), result.size());
        return context;
    }

    private boolean isOverThreshold(List<Integer> targetNumList, List<TicketNumber> historyDataList, Map<Integer, Integer> thresholdMap, boolean isNormal) {
        for (Integer number : targetNumList) {
            Integer threshold = thresholdMap.getOrDefault(number, Integer.MAX_VALUE);
            int count = 0;
            for (int i = historyDataList.size() - 1; i >= 0; i--) {
                List<Integer> numberList = null;
                if (isNormal) {
                    numberList = historyDataList.get(i).getNormalNumber();
                } else {
                    numberList = historyDataList.get(i).getSpecialNumber();
                }
                if (numberList.contains(number)) {
                    return false;
                } else {
                    count++;
                }
                if (count > threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}
