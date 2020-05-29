package com.ppf;

import myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//自定义ribbon类
@RibbonClient(name = "SERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class SpringcloudConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerDept80Application.class, args);
    }

}
