//package com.huang.dubbo.service.provider.config;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by huang_jiangling on 2018/7/9.
// */
//@Configuration
//@DubboComponentScan(basePackages = "com.huang.dubbo.service.provider")
//public class DubboConfig {
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("dubbo-provider-huang");
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("zookeeper://192.168.101.43:2181");
//        return registryConfig;
//    }
//}