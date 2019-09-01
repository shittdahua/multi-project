package com.stone.multiproject.test.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.base.Splitter;
import com.stone.multiproject.base.Pair;
import com.stone.multiproject.mapper.LotteryMapper;
import com.stone.multiproject.model.Lottery;
import com.stone.multiproject.utils.SplitterHelper;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryTest {

    @Resource
    private LotteryMapper lotteryMapper;

    @Test
    public void constraint() {
        QueryWrapper<Lottery> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("lottery_id", "dlt");
        List<Lottery> lotteries = lotteryMapper.selectList(queryWrapper);
        List<Integer> collect = lotteries.stream()
                .map(o -> o.getLotteryRes())
                .filter(Objects::nonNull)
                .map(o -> SplitterHelper.COMMA_SPLITTER.splitToList(o))
                .map(o -> o.stream().mapToInt(e -> NumberUtils.toInt(e)).sum())
                .sorted()
                .collect(Collectors.toList());
        List<Pair> collect1 = collect.stream().collect(Collectors.groupingBy(o -> o))
                .entrySet()
                .stream()
                .map(o -> Pair.of(o.getKey(), o.getValue().size()))
                .collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("---min:" + collect.get(0));
        System.out.println("---max:" + collect.get(collect.size() - 1));
        System.out.println(collect);
    }
}
