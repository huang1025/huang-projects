package com.huang.practice.mybatis.mapper;

import com.huang.practice.base.Employee;

/**
 * Created by huang_jiangling on 2018/7/10.
 */
public interface EmployeeMapper {

    int insert(Employee employee);

    int update(Employee employee);

    Employee select(int id);

    int delete(int id);
}
