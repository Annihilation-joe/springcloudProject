package com.yz.springcloud.alibaba.service.impl;

import com.yz.springcloud.alibaba.dao.OrderDao;
import com.yz.springcloud.alibaba.domain.Order;
import com.yz.springcloud.alibaba.service.AccountService;
import com.yz.springcloud.alibaba.service.OrderService;
import com.yz.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yz
 * @create 2021-09-01 18:59
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "rollback-create-order", rollbackFor = Exception.class)  //事务回滚
    public void create(Order order) {
        log.info("------> 开始新建订单");
        orderDao.create(order);

        log.info("------> 订单微服务开始调用库存，做扣减");

        storageService.decrease(order.getProductId(), order.getCount());

        log.info("------> 订单微服务开始调用库存，做扣减end");

        log.info("------> 订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------> 订单微服务开始调用账户，做扣减end");

        log.info("------> 修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("------> 修改订单状态结束");

        log.info("------> 下订单结束了，good！");


    }
}
