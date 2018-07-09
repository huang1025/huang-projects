package com.huang.dubbo.service.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huang.dubbo.service.api.service.EmployeeService;
import com.huang.practice.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang_jiangling on 2018/7/9.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        Employee huang = Employee.builder().age(17).name("huang").id(1).build();
        Employee jiang = Employee.builder().age(17).name("jiang").id(2).build();
        Employee ling = Employee.builder().age(17).name("ling").id(3).build();

        ArrayList<Employee> list = new ArrayList<>();
        list.add(huang);
        list.add(jiang);
        list.add(ling);
        return list;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return Employee.builder().age(17).name("huang").id(1).build();
    }

    @Override
    public int updateEmployeeById(Integer id, Employee changedEmployee) {
        return 1;
    }
}
