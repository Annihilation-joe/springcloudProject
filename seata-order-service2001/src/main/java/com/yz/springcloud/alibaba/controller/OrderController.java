package com.yz.springcloud.alibaba.controller;

import com.yz.springcloud.alibaba.domain.CommonResult;
import com.yz.springcloud.alibaba.domain.Order;
import com.yz.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yz
 * @create 2021-09-01 20:28
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
