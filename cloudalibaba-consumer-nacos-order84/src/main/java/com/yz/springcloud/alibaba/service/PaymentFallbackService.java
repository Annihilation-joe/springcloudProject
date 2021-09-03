package com.yz.springcloud.alibaba.service;

import com.yz.springcloud.entities.CommonResult;
import com.yz.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author yz
 * @create 2021-09-01 13:44
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}