package com.yutianhao.sc.yutianhaoconsulconsumer1.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author thyu
 * @title: BalanceConfig
 * @projectName yutianhao-consul-parent
 * @description: TODO
 * @date 2020/7/15 14:27
 */
@Configuration
public class BalanceConfig {
    @Bean
    public IRule myBalanceRule(){
        //指定使用随机的负载均衡策略
        //return new RandomRule();
        //使用轮询
        return new RoundRobinRule();
    }
}
