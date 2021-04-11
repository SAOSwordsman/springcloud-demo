package com.yd.dao;

import com.yd.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface paymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id")int id);
}
