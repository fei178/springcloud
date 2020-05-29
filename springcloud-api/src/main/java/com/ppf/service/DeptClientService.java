package com.ppf.service;

import com.ppf.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(value = "SPRINGCLOUD-DEPT", fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/add", method = RequestMethod.GET)
    boolean add(Dept dept);

    @RequestMapping(value = "/dept/findById/{deptNo}", method = RequestMethod.GET)
    Dept findById(@PathVariable("deptNo") Long deptNo);

    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    List findAll();
}
