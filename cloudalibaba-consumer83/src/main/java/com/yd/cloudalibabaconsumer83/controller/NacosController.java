package com.yd.cloudalibabaconsumer83.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class NacosController {
    public static final String serverUrl="http://nacos-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") int id) {
        return restTemplate.getForObject(serverUrl + "/payment/nacos/"+id, String.class);
    }
}
