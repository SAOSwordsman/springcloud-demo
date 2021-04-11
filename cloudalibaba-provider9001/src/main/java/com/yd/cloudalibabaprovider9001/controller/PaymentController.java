package com.yd.cloudalibabaprovider9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/payment/nacos/{id}")
    public String getServerPort(@PathVariable("id")int id) {
        return "nacos registry,server.port"+serverPort+"   流水号:"+id;
    }
}
