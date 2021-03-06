package com.inglc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.inglc.demo.mapper")
@SpringBootApplication
public class MybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}

}
