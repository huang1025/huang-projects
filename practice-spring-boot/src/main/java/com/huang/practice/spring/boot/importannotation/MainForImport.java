package com.huang.practice.spring.boot.importannotation;

import com.huang.practice.spring.boot.common.ConfigurationTest;
import com.huang.practice.spring.boot.importannotation.config.EnableTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by huang_jiangling on 2018/7/13.
 */
@SpringBootApplication
@Import(ConfigurationTest.class)
@EnableTest("huang_jiangling")
public class MainForImport {

    public static void main(String[] args) {
        SpringApplication.run(MainForImport.class, args);
    }
}
