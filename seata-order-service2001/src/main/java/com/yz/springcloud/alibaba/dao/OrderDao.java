package com.yz.springcloud.alibaba.dao;

import com.yz.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yz
 * @create 2021-09-01 18:32
 */
@Mapper
public interface OrderDao {
    //1. 新建订单
    void create(Order order);

    //2. 修改订单 0->1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
