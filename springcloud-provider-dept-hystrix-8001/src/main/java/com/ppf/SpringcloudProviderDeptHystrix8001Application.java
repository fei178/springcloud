package com.ppf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker   //对hystrix熔断机制支持
public class SpringcloudProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDeptHystrix8001Application.class, args);
    }

}
