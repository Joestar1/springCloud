package com.lc.springcloud.service.impl;

import com.lc.springcloud.dao.PaymentDao;
import com.lc.springcloud.entities.Payment;
import com.lc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public List<Payment> queryAll() {
        return paymentDao.queryAll();
    }
}
