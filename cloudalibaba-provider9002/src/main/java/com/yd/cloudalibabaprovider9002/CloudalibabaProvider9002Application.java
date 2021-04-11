package com.yd.cloudalibabaprovider9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProvider9002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProvider9002Application.class, args);
    }

}
