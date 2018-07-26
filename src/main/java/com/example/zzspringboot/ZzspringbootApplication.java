package com.example.zzspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.zzspringboot.mapper")
//开启定时任务
@EnableScheduling
//开启异步任务
@EnableAsync
public class ZzspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzspringbootApplication.class, args);
	}
}
