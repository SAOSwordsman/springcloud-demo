package com.yd.service;

import org.springframework.stereotype.Service;

@Service
public class OpenfeignServiceImpl implements OpenfeignService {
    @Override
    public String paymentInfo(int id) {
        return "paymentInfo异常";
    }

    @Override
    public String paymentTimeout(Integer id) {

        return "paymentTimeout异常";
    }
}
