package com.yd.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yd.service.OpenfeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HystrixController {
    @Resource
    OpenfeignService openfeignService;
    @GetMapping("/consumer/payment/info/{id}")
    public String paymentInfo(@PathVariable("id") int id){
        String info = openfeignService.paymentInfo(id);
        return info;
    }
    @GetMapping("/consumer/payment/hystrixout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id) {
        String timeout = openfeignService.paymentTimeout(id);
        return timeout;
    }

    public String paymentBroke() {
        return "服务出错，自动跳转";
    }

}
