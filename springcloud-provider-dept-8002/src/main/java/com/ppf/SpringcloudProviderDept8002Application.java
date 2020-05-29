package com.ppf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//本服务启动后会自动注册进eureka服务
@EnableDiscoveryClient
public class SpringcloudProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDept8002Application.class, args);
    }

}
