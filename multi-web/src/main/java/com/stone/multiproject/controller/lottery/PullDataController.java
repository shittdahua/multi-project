package com.stone.multiproject.controller.lottery;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stone.multiproject.core.dlt.DltNumberProcess;
import com.stone.multiproject.model.Lottery;
import com.stone.multiproject.service.LotteryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @GetMapping("/do/compute")
    public void compute() {
        dltNumberProcess.doProcess();
    }

    @GetMapping
    public void testQueryByPage() {
        IPage page = new Page();
        page.setCurrent(1);
        page.setSize(100);
        QueryWrapper<Lottery> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("lottery_id", "dlt");
        List<Lottery> lotteries = lotteryService.queryByPage(page, queryWrapper);
        System.out.println(lotteries);
    }
}
