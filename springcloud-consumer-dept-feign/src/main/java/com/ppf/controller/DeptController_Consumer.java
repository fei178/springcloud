package com.ppf.controller;

import com.ppf.entity.Dept;
import com.ppf.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/addDept")
    public boolean addDept(Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/findById/{deptNo}")
    public Dept findById(@PathVariable Long deptNo) {
        return service.findById(deptNo);
    }

    @RequestMapping(value = "/consumer/dept/findAll")
    public List<Dept> findAll() {
        return service.findAll();
    }
}
