package com.stone.multiproject.controller.lottery;

import com.stone.multiproject.service.LotteryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/lottery/pull")
public class PullDataController {

    @Resource
    private LotteryServiceImpl lotteryService;

    @GetMapping("/dlt")
    public void dlt() {
        lotteryService.pullLotteryDataFromJuHeLoop();
    }
}
