package com.yd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class providerpayment {
    public static void main(String[] args) {
        SpringApplication.run(providerpayment.class,args);
    }
}
