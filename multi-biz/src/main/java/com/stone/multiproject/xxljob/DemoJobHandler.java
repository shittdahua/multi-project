package com.stone.multiproject.xxljob;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@JobHandler("demoJobHandler")
@Slf4j
public class DemoJobHandler extends IJobHandler {

    @Override
    public ReturnT<String> execute(String param) throws Exception {
        log.info("DemoJobHandler execute ...");
        log.info("DemoJobHandler execute, param :{}", param);
        return ReturnT.SUCCESS;
    }
}
