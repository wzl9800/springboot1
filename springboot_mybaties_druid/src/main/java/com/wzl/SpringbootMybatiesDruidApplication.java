package com.wzl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzl.dao")
public class SpringbootMybatiesDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatiesDruidApplication.class, args);
    }

}
