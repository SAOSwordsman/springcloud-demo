package com.yd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
public class Consumer80Main {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80Main.class, args);
    }
}
