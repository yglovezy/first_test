package com.les.ch03mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.les.ch03mybatis.dao")
public class Ch03MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03MybatisApplication.class, args);
    }

}
