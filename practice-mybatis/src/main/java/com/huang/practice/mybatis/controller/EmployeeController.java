package com.huang.practice.mybatis.controller;

import com.huang.practice.base.Employee;
import com.huang.practice.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang_jiangling on 2018/7/11.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("select")
    public Employee select(@RequestHeader Integer id) {
        return employeeMapper.select(id);
    }
}
