package com.huang.practice.spring.boot.importannotation.ware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by huang_jiangling on 2018/7/13.
 */
@Component
public class ApplicationAwareTest implements ApplicationContextAware {

    @Autowired
    private BeanFactory beanFactory;

    @PostConstruct
    public void hehe() {

        System.out.println("hhhhhhhhhhhhhhhhhhhhh");
        System.out.println(beanFactory.getClass().getName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");

        Map<String, BeanFactory> beansOfType = applicationContext.getBeansOfType(BeanFactory.class);
        for (String each : beansOfType.keySet()) {
            System.out.println(each);
        }

        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");
    }
}
