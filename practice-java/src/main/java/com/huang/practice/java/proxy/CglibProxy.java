package com.huang.practice.java.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by huang_jiangling on 2018/8/16.
 */
public class CglibProxy {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setInterfaces(new Class[]{Person.class});
        enhancer.setSuperclass(AbstractTeacher.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println(method.getName());
                System.out.println(obj.getClass().getName());
                System.out.println(method.getDeclaringClass().getName());
                if ("eat".equals(method.getName())) {
                    return proxy.invokeSuper(obj, args);
                } else {
                    System.out.println("hehe");
                    return null;
                }
            }
        });

        AbstractTeacher teacher = (AbstractTeacher) enhancer.create();
        teacher.eat();
    }
}
