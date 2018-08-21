package com.huang.practice.java.proxy;

/**
 * Created by huang_jiangling on 2018/8/16.
 */
public abstract class AbstractTeacher implements Person {

    @Override
    public void eat() {
        System.out.println("teacher eating...");
    }

    public abstract void teach();
}
