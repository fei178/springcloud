package com.ppf.dao;


import com.ppf.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 14:48
 * @description
 */
@Mapper
public interface DeptDao {

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