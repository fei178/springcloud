package com.ppf.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ppf.entity.Dept;
import com.ppf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:07
 * @description
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService = null;

    @RequestMapping(value = "/dept/findById/{deptNo}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {

        Dept dept = deptService.findById(deptNo);

        if (null == dept) {
            throw new RuntimeException("该ID：" + deptNo + "没有对应信息");
        }

        return dept;
    }

    public Dept processHystrix_Get(@PathVariable Long deptNo) {
        return new Dept().setDeptNo(deptNo).setDeptName("该ID：" + deptNo + "没有对应信息，null--@HystrixCommand")
                .setDbSource("no this database in MySQL");
    }

}