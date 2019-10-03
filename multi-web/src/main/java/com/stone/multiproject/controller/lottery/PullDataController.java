package com.stone.multiproject.controller.lottery;

import com.stone.multiproject.core.dlt.DltNumberProcess;
import com.stone.multiproject.service.LotteryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/lottery")
public class PullDataController {

    @Resource
    private LotteryServiceImpl lotteryService;

    @Resource
    private DltNumberProcess dltNumberProcess;

    @GetMapping("/pull/dlt")
    public void dlt() {
        lotteryService.pullLotteryDataFromJuHeLoop();
    }

    @GetMapping("/compute/{ticketCount}")
    public void compute(@PathVariable Integer ticketCount) {
        dltNumberProcess.doProcess(ticketCount);
    }

}
