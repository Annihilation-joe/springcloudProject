package com.yz.springcloude.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yz
 * @create 2021-08-26 17:57
 */
public interface PaymentService {
    public String paymentInfo_Ok(Integer id);
    public String paymentInfo_Timeout(Integer id);
    public String paymentInfo_TimeoutHandler(Integer id);
    public String paymentCircuitBreaker( Integer id);
    public String paymentCircuitBreaker_fallback(Integer id);
}
