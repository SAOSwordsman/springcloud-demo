package com.yd.cloudalibabaconsumer83;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConsumer83Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConsumer83Application.class, args);
    }

}
