package com.yz.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yz
 * @create 2021-08-26 13:15
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
        //随机算法
        return new RandomRule();
    }
}
