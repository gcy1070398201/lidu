package com.gcy.lidu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.gcy.lidu.mapper"})
public class LiduApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiduApplication.class, args);
    }
}
