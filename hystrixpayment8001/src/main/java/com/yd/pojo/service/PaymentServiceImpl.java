package com.yd.pojo.service;

import ch.qos.logback.core.util.TimeUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo(int id) {
        return "线程池" + Thread.currentThread().getName() + "==id:" + id;
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentTimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")})
    public String paymentTimeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName()+"timeout" + "==id:" + id;
    }
    public String paymentTimeoutHandler(Integer id){
        return "请求超时===>"+ Thread.currentThread().getName()+"启用另一个方法===》"+id;
    }
}
