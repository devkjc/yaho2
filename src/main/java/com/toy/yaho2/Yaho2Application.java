package com.toy.yaho2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class Yaho2Application {

    public static void main(String[] args) {
        SpringApplication.run(Yaho2Application.class, args);
    }

}
