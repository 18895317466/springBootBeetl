package com.yang.beetl;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class BeetlApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeetlApplication.class, args);
    }
}
