package com.ppf.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //负载均衡工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
//        return new RoundRobinRule();    //轮询算法
//        return new RandomRule();    //用我们重新选择的随机算法替代轮询
        return new RetryRule();     // 轮询算法，当有宕机的服务，几次尝试连接，连接不上就不在使用
    }
}
