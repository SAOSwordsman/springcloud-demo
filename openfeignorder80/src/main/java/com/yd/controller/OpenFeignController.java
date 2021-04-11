package com.yd.controller;

import com.yd.pojo.CommonResult;
import com.yd.pojo.Payment;
import com.yd.service.PaymentOpenfeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OpenFeignController {
    @Autowired
    private PaymentOpenfeign paymentOpenfeign;

    @GetMapping("/payment/gpi/{id}")
    public CommonResult<Payment> getId(@PathVariable("id")int id) {
        return paymentOpenfeign.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/timeout")
    public void timeout() {
         paymentOpenfeign.timeout();
         return;
    }
}
