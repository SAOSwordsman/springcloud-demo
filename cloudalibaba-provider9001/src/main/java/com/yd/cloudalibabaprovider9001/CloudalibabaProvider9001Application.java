package com.yd.cloudalibabaprovider9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProvider9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProvider9001Application.class, args);
    }

}
