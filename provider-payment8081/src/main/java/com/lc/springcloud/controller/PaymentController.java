package com.lc.springcloud.controller;

import com.lc.springcloud.entities.CommonResult;
import com.lc.springcloud.entities.Payment;
import com.lc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("payment8001")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("queryAll")
    public CommonResult queryAll() {
        List<Payment> payments = paymentService.queryAll();
        return new CommonResult(200, "查询成功", payments);
    }

    @PostMapping("insert")
    public CommonResult insert(Payment payment) {
        int result = paymentService.insert(payment);
        return new CommonResult(200, "插入成功", result);
    }
}
