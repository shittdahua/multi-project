package com.stone.multiproject.service;

import com.stone.multiproject.mapper.LotteryMapper;
import com.stone.multiproject.model.Lottery;
import com.stone.multiproject.remote.LotteryRemote;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("lotteryService")
@Slf4j
public class LotteryServiceImpl {

    @Resource
    private LotteryMapper lotteryMapper;

    public void pullLotteryDataFromJuHeLoop() {
        log.info("LotteryServiceImpl pullLotteryDataFromJuHeLoop start...");
        long l = System.currentTimeMillis();
        int page = 1;
        final int pageSize = 50;
        int count = 1;
        int maxCount = 200;

        while (true) {
            if (count > maxCount) {
                break;
            }
            List<Lottery> lotteryList = LotteryRemote.lotteryHistory("d1b7a9e3cf957ca8218eb43fc8d055d8", "dlt", page++, pageSize);
            if (CollectionUtils.isNotEmpty(lotteryList)) {
                saveLottery(lotteryList);
                if (lotteryList.size() < pageSize) {
                    break;
                }
            } else {
                break;
            }
            count++;
        }
        log.info("LotteryServiceImpl pullLotteryDataFromJuHeLoop end...cost time:{}ms", costTime(l));
    }

    private final Long costTime(Long ago) {
        return System.currentTimeMillis() - ago;
    }

    private void saveLottery(List<Lottery> lotteryList) {
        lotteryList.forEach(o -> {
            lotteryMapper.insert(o);
        });
    }
}
