package com.yd.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yd.pojo.User;
import com.yd.pojo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class paymentController {
   @Autowired
    PaymentService paymentService;
   @GetMapping("/payment/info/{id}")
   public String paymentInfo(@PathVariable("id") int id){
       String info = paymentService.paymentInfo(id);
       log.info("===info==="+info);
       return info;
   }
    @GetMapping("/payment/hystrixout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id) {
        String timeout = paymentService.paymentTimeout(id);
        log.info("===timeout!===="+timeout);
        return timeout;
    }
}
