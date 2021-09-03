package com.yz.springcloud.alibaba.service;

/**
 * @author yz
 * @create 2021-09-01 20:58
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}