package com.lc.springcloud.service;

import com.lc.springcloud.entities.Payment;

import java.util.List;


public interface PaymentService {
    int insert(Payment payment);

    List<Payment> queryAll();
}
