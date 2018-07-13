package com.huang.practice.spring.boot.importannotation.ware;

import com.huang.practice.spring.boot.common.ConfigurationTest;
import com.huang.practice.spring.boot.common.People;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by huang_jiangling on 2018/7/13.
 */
@Component
public class ApplicationAwareTest implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");

        ConfigurationTest bean = applicationContext.getBean(ConfigurationTest.class);
        System.out.println(bean.getName());

        People people = applicationContext.getBean(People.class);
        System.out.println(people.getClass().getName());

        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");
        System.out.println("=============");
    }
}
