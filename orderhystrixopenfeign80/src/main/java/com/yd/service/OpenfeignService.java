package com.yd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "PROVIDER-HYSTRIX-PAYMENT",fallback = OpenfeignServiceImpl.class)
public interface OpenfeignService {
    @GetMapping("/payment/info/{id}")
     String paymentInfo(@PathVariable("id") int id);
    @GetMapping("/payment/hystrixout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id);
}
