package com.ppf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ppf"})
public class SpringcloudConsumerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerDeptFeignApplication.class, args);
    }

}
