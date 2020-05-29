package com.ppf.service.Impl;


import com.ppf.dao.DeptDao;
import com.ppf.service.DeptService;
import com.ppf.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:04
 * @description
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}