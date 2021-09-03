package com.yz.springcloud.service.impl;

import com.yz.springcloud.dao.PaymentDao;
import com.yz.springcloud.entities.Payment;
import com.yz.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yz
 * @create 2021-08-25 9:57
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
