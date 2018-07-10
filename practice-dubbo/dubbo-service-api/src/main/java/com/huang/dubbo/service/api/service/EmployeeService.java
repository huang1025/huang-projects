package com.huang.dubbo.service.api.service;

import com.huang.practice.base.Employee;

import java.util.List;

/**
 * Created by huang_jiangling on 2018/7/9.
 */
public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    int updateEmployeeById(Integer id, Employee changedEmployee);
}
