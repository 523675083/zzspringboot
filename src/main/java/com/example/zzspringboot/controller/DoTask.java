package com.example.zzspringboot.controller;

import com.example.zzspringboot.tasks.AsyncTask;
import com.example.zzspringboot.utils.RestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
@RequestMapping("/task")
public class DoTask {
    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("doTask")
    public RestModel doTask() throws InterruptedException {
        long start= System.currentTimeMillis();
        Future<Boolean> f1 = asyncTask.doTask1();
        Future<Boolean> f2 = asyncTask.doTask2();
        Future<Boolean> f3 = asyncTask.doTask3();
        while(!f1.isDone()||!f2.isDone()||!f3.isDone()){
            if(f1.isDone()&&f2.isDone()&&f3.isDone()){
                break;
            }
        }
        long end=System.currentTimeMillis();
        return RestModel.data("任务全部完成：共执行了"+(end-start)+"毫秒");
    }
}
