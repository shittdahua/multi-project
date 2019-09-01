package com.stone.multiproject.remote;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.stone.multiproject.model.Lottery;
import com.stone.multiproject.utils.HttpHelp;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@UtilityClass
public class LotteryRemote {

    private static final String key = "d1b7a9e3cf957ca8218eb43fc8d055d8";
    private static final String queryHistoryUrl = "http://apis.juhe.cn/lottery/history";

    public List<Lottery> lotteryHistory(String key, String lotteryId, Integer currentPage, Integer pageSize) {
        Map<String, String> paramMap = Maps.newHashMap();
        paramMap.put("key", key);
        paramMap.put("lottery_id", lotteryId);
        paramMap.put("page", currentPage.toString());
        paramMap.put("page_size", pageSize.toString());
        String str = HttpHelp.doGet(queryHistoryUrl, paramMap);
        return parse(str);
    }

    public List<Lottery> parse(String str) {
        if (StringUtils.isNotBlank(str)) {
            HashMap hashMap = JSON.parseObject(str, HashMap.class);
            JSONObject jsonObject = (JSONObject) hashMap.get("result");
            JSONArray jsonArray = (JSONArray) jsonObject.get("lotteryResList");
            return jsonArray.stream()
                    .map(o -> (JSONObject) o)
                    .map(o -> {
                        JSONObject b = new JSONObject();
                        o.entrySet().stream().forEach((entry) -> {
                            String key1 = entry.getKey();
                            key1 = HttpHelp.removeUnderLine(key1);
                            b.put(key1, entry.getValue());
                        });
                        return JSON.parseObject(JSON.toJSONString(b), Lottery.class);
                    })
                    .collect(Collectors.toList());
        }
        return null;
    }

    public static void main(String[] args) {
        List<Lottery> lotteries = LotteryRemote.lotteryHistory("d1b7a9e3cf957ca8218eb43fc8d055d8", "dlt", 1, 50);
        System.out.println(JSON.toJSONString(lotteries));
    }

}
