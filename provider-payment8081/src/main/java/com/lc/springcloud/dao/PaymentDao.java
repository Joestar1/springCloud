package com.lc.springcloud.dao;

import com.lc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentDao {
    int insert(Payment payment);

    List<Payment> queryAll();
}
