package com.yd.controller;

import com.yd.pojo.CommonResult;
import com.yd.pojo.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    public static final String Provider_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(Provider_URL+"/payment/create", payment, CommonResult.class);
    }
    @GetMapping("/consumer/payment/gpi/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") int id) {
        return restTemplate.getForObject(Provider_URL + "/payment/gpi/"+ id, CommonResult.class);
    }




}
