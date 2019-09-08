//package com.stone.multiproject.demo;
//
//import com.stone.multiproject.quartz.config.QuartzManager;
//import org.quartz.SchedulerException;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController`
//public class ModifyCronController {
//
//    @Resource
//    private QuartzManager quartzManager;
//
//    @GetMapping("modify")
//    public String modify() throws SchedulerException {
//        /**10秒执行一次*/
//        String cron="*/10 * * * * ?";
//        quartzManager.pauseJob(QuartzManager.JOB1,QuartzManager.GROUP1);
//        quartzManager.modifyJob(QuartzManager.JOB1,QuartzManager.GROUP1,cron);
//        return "ok";
//    }
//
//}
