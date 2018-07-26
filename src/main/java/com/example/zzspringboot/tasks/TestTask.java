package com.example.zzspringboot.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    public static final SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");

    //@Scheduled(fixedRate = 3000)
    //@Scheduled(cron = "1/3 * * * * ? ")
    public void task(){
        System.out.println("现在时间是："+sdf.format(new Date()));
    }

}
