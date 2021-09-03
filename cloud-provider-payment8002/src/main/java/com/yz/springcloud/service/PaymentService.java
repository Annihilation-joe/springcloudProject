package com.yz.springcloud.service;

import com.yz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yz
 * @create 2021-08-25 9:56
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
