package com.example.zzspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.zzspringboot.mapper")
public class ZzspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzspringbootApplication.class, args);
	}
}
