package com.ppf.controller;

import com.ppf.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEPT";

    @Autowired
    RestTemplate restTemplate;//Spring提供用于访问Rest服务客户端模板工具类

    @RequestMapping(value = "/consumer/dept/addDept")
    public boolean addDept(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/addDept", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/findById/{deptNo}")
    public Dept findById(@PathVariable Long deptNo) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/findById/" + deptNo, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/findAll")
    public List<Dept> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/findAll", List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(
                REST_URL_PREFIX + "/dept/discovery",
                Object.class);
    }
}
