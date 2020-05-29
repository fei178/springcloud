package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    //按照自己定义的负载算法
    @Bean
    public IRule myRule() {
        return new RandomRule();//随机
//        return new RoundRobinRule();//轮询
//        return new MyRandomRule(); //自定义的算法
    }
}
