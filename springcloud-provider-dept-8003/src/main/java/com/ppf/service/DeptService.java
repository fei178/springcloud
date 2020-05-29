package com.ppf.service;


import com.ppf.entity.Dept;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:03
 * @description
 */
public interface DeptService {

    /**
     * 插入
     *
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查找
     *
     * @param deptNo
     * @return
     */
    Dept findById(Long deptNo);

    /**
     * 查询全部
     *
     * @return
     */
    List<Dept> findAll();
}