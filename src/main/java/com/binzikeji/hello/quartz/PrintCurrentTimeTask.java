package com.binzikeji.hello.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author Bin
 * @Date 2019/6/1 18:02
 **/
@Component
public class PrintCurrentTimeTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void printCurrentTime(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
