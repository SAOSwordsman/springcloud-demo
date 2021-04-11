package com.yd.service;

import com.yd.pojo.CommonResult;
import com.yd.pojo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("PROVIDERPAYMENT")
public interface PaymentOpenfeign {
    @GetMapping("/payment/gpi/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") int id);
    @GetMapping("/payment/timeout")
    void timeout();
}
