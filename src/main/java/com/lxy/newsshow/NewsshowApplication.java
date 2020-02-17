package com.lxy.newsshow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lxy.newsshow.Mappers")
public class NewsshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsshowApplication.class, args);
    }

}
