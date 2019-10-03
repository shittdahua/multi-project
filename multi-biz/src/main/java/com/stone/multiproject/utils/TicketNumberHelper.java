package com.stone.multiproject.utils;

import com.stone.multiproject.constant.Constant;
import com.stone.multiproject.entity.TicketMatchRule;
import com.stone.multiproject.entity.TicketNumber;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@UtilityClass
@Slf4j
public class TicketNumberHelper {

    /**
     * 1
     * 5+2
     * 2
     * 5+1
     * 3
     * 5+0
     * 4
     * 4+2
     * 5
     * 4+1
     * 6
     * 3+2
     * 7
     * 4+0
     * 8
     * 3+1	2+2
     * 9
     * 3+0	1+2	2+1	0+2
     */
    private final List<TicketMatchRule> DLT_WINNING_RULE = Arrays.asList(
            TicketMatchRule.of(1, 5, 2, 1000000),
            TicketMatchRule.of(2, 5, 1, 1000000),
            TicketMatchRule.of(3, 5, 0, 10000),
            TicketMatchRule.of(4, 4, 2, 3000),
            TicketMatchRule.of(5, 4, 1, 300),
            TicketMatchRule.of(6, 3, 2, 200),
            TicketMatchRule.of(7, 4, 0, 100),
            TicketMatchRule.of(8, 3, 1, 15),
            TicketMatchRule.of(8, 2, 2, 15),
            TicketMatchRule.of(9, 3, 0, 5),
            TicketMatchRule.of(9, 1, 2, 5),
            TicketMatchRule.of(9, 2, 1, 5),
            TicketMatchRule.of(9, 0, 2, 5)
    );

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
        TicketNumberHelper.createTicket(20000, "dlt")
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
            ticketNumber.setNormalNumber(createTicketNum(thresholdArr[0], thresholdArr[1]));
            ticketNumber.setSpecialNumber(createTicketNum(thresholdArr[2], thresholdArr[3]));
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

    public int winningCompute(TicketNumber toCheck, TicketNumber winningNumber) {
        List<Integer> winningNormalNumber = winningNumber.getNormalNumber();
        List<Integer> winningSpecialNumber = winningNumber.getSpecialNumber();

        List<Integer> toCheckNormalNumber = toCheck.getNormalNumber();
        List<Integer> toCheckSpecialNumber = toCheck.getSpecialNumber();

        int specialNumber = ListUtils.intersection(winningSpecialNumber, toCheckSpecialNumber).size();
        int normalNumber = ListUtils.intersection(winningNormalNumber, toCheckNormalNumber).size();

        TicketMatchRule toCheckNumber = TicketMatchRule.of(0, normalNumber, specialNumber, 0);

        TicketMatchRule ticketMatchRule = DLT_WINNING_RULE.stream().filter(o -> o.equals(toCheckNumber)).findFirst().orElse(null);
        if (ticketMatchRule != null) {
            if (ticketMatchRule.getWinningLevel() >= 6){
                //log.warn("WINNING WINNING WINNING,toCheck:{},match :{}", toCheck, ticketMatchRule);
            }
            return ticketMatchRule.getMoney();
        }
        return 0;
    }

}
