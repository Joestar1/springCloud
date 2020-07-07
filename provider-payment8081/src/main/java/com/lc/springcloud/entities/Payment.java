package com.lc.springcloud.entities;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Payment implements Serializable {

    private Integer id;

    private BigDecimal goodsPrice;
}
