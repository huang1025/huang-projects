package com.huang.practice.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huang_jiangling on 2018/7/10.
 */
@Configuration
@MapperScan(basePackages = "com.huang.practice.mybatis.mapper")
public class MybatisConfig {
}
