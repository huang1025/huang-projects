package com.huang.dubbo.service.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huang.dubbo.service.api.service.EmployeeService;
import com.huang.practice.base.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huang_jiangling on 2018/7/9.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Reference
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public List<Employee> list() {
        return employeeService.getAllEmployees();
    }
}
