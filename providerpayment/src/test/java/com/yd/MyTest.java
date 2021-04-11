package com.yd;

import com.yd.dao.paymentDao;
import com.yd.pojo.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class MyTest {
    @Autowired
    paymentDao paymentDao;
    @Autowired
    DataSource dataSource;
    @Test
    public void test1() throws SQLException {
        Payment paymentById = paymentDao.getPaymentById(4);
        System.out.println(paymentById);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
