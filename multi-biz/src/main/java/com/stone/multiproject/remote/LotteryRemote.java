package com.stone.multiproject.remote;

import com.google.common.collect.Maps;
import com.stone.multiproject.utils.HttpHelp;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
@UtilityClass
public class LotteryRemote {

    private static final String key = "d1b7a9e3cf957ca8218eb43fc8d055d8";
    private static final String queryHistoryUrl = "http://apis.juhe.cn/lottery/history";

    public void lotteryHistory(String lotteryId, Integer currentPage, Integer pageSize) {
        Map<String, String> paramMap = Maps.newHashMap();
        paramMap.put("key", key);
        paramMap.put("lottery_id", lotteryId);
        paramMap.put("page", currentPage.toString());
        paramMap.put("page_size", pageSize.toString());
        HttpHelp.doGet(queryHistoryUrl, paramMap);
    }

    public static void main(String[] args) {
        LotteryRemote.lotteryHistory("dlt", 1, 50);
    }

}
