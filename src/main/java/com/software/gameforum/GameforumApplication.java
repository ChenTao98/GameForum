package com.software.gameforum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.software.gameforum.dao")
public class GameforumApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameforumApplication.class, args);
    }

}
