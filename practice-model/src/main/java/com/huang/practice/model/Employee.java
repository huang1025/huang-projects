package com.huang.practice.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by huang_jiangling on 2018/7/9.
 */
@Data
@Builder
public class Employee implements Serializable {

    private Integer id;
    private String name;
    private Integer age;

}
