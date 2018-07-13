package com.huang.practice.spring.boot.common;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huang_jiangling on 2018/7/13.
 */
@Data
@Configuration
public class ConfigurationTest {

    private String name;

    public ConfigurationTest() {
        this.name = "huang";
    }
}
