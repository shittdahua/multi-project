package com.stone.multiproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stone.multiproject.mapper")
public class MultiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiProjectApplication.class, args);
    }

}
