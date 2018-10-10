package com.ding.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(@Configuration、@EnableAutoConfiguration、@ComponentScan)
@MapperScan("com.ding.demo.mapper")
public class DemoApplication {
    //启动应用
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
