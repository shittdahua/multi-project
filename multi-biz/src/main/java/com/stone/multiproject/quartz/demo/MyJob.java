package com.stone.multiproject.quartz.demo;

import com.stone.multiproject.utils.DateHelp;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@Slf4j
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("任务开始执行了");
        executeTask();
        log.info("任务执行结束了");
    }

    private void executeTask() {
        log.info(DateHelp.formatNow());
    }
}
