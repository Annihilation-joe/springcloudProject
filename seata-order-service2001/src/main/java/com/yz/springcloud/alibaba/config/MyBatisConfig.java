package com.yz.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yz
 * @create 2021-09-01 20:30
 */
@Configuration
@MapperScan({"com.yz.springcloud.alibaba.dao"})
public class MyBatisConfig {
}