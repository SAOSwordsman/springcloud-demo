package com.yd.Controller;

import com.yd.dao.paymentDao;
import com.yd.pojo.CommonResult;
import com.yd.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    paymentDao paymentDao;

    @PostMapping("/payment/create")
    public CommonResult creat(@RequestBody Payment payment) {
        int result = paymentDao.create(payment);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(500, "插入失败", null);
        }
    }

    @GetMapping("/payment/gpi/{id}")
    public CommonResult getPaymentById(@PathVariable("id") int id) {
        Payment result = paymentDao.getPaymentById(id);
        if (result != null) {
            return new CommonResult(200, "查询成功", result);
        } else {
            return new CommonResult(500, "查询失败", null);
        }
    }
    @GetMapping("/payment/timeout")
    public void timeout() throws InterruptedException {
        Thread.sleep(3000);
    }
}


