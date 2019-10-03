package com.stone.multiproject.utils;

import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.entity.TicketNumber;
import lombok.experimental.UtilityClass;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@UtilityClass
public class TicketNumberHelper {

    public List<Integer> parseNormalNumber(String numberStr, int specialNumberCount) {
        if (StringUtils.isBlank(numberStr) || !numberStr.contains(Constant.COMMA)) {
            throw new RuntimeException("numberStr is parse error, " + numberStr);
        }
        List<String> allNumberList = SplitterHelper.COMMA_SPLITTER.splitToList(numberStr);
        return allNumberList.stream().map(o -> Integer.parseInt(o))
                .limit(allNumberList.size() - specialNumberCount)
                .collect(Collectors.toList());

    }

    public int sumList(List<Integer> source) {
        if (CollectionUtils.isEmpty(source)) {
            return 0;
        }
        return source.stream().mapToInt(o -> o).sum();
    }

    public List<Integer> parseSpecialNumber(String numberStr, int specialNumberCount) {
        if (StringUtils.isBlank(numberStr) || !numberStr.contains(Constant.COMMA)) {
            throw new RuntimeException("numberStr is parse error, " + numberStr);
        }
        List<String> allNumberList = SplitterHelper.COMMA_SPLITTER.splitToList(numberStr);
        return allNumberList.stream().map(o -> Integer.parseInt(o))
                .skip(allNumberList.size() - specialNumberCount)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        TicketNumberHelper.createTicket(20000,"dlt")
                .forEach(o -> System.out.println(o));
    }

    public List<TicketNumber> createTicket(int createSum, String lottertId) {
        int[] thresholdArr = null;
        if (Constant.DLT_TICKET.equals(lottertId)) {
            thresholdArr = Constant.DLT_THRESHOLD;
        }
        Set<TicketNumber> result = new HashSet<>(createSum);
        while (result.size() < createSum) {
            TicketNumber ticketNumber = new TicketNumber();
            ticketNumber.setLotteryNo(Constant.DLT_TICKET);
            ticketNumber.setNormalNumber(createTicketNum(thresholdArr[0],thresholdArr[1]));
            ticketNumber.setSpecialNumber(createTicketNum(thresholdArr[2],thresholdArr[3]));
            result.add(ticketNumber);
        }
        return new ArrayList<>(result);
    }

    private List<Integer> createTicketNum(int count, int threshold) {
        TreeSet<Integer> treeSet = new TreeSet();
        while (treeSet.size() < count) {
            int randomNum = RandomHelper.random.nextInt(threshold);
            if (randomNum == 0) {
                continue;
            }
            treeSet.add(randomNum);
        }
        return new ArrayList<>(treeSet);
    }
}
