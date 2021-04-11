package com.yd.dao;

import com.yd.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentDaoImpl implements paymentDao {
    @Autowired
    paymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(int id) {

        return paymentDao.getPaymentById(id);
    }
}
