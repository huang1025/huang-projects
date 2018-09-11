package com.huang.practice.java.type;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created by huang_jiangling on 2018/9/11.
 */
public class TypeVariableTest<T extends Number & Serializable & Comparable> {

    private T t;

    public static void main(String[] args) throws NoSuchFieldException {
        methodGetBounds();
        System.out.println("======");
        methodGetGenericDeclaration();
    }

    private static void methodGetBounds() throws NoSuchFieldException {
        Field field = TypeVariableTest.class.getDeclaredField("t");
        Type[] bounds = ((TypeVariable) field.getGenericType()).getBounds();
        for (Type each : bounds) {
            System.out.println(each.getClass().getName());
            System.out.println(each);
        }
        //java.lang.Class
        //class java.lang.Number
        //java.lang.Class
        //interface java.io.Serializable
        //java.lang.Class
        //interface java.lang.Comparable
    }

    private static void methodGetGenericDeclaration() throws NoSuchFieldException {
        Field field = TypeVariableTest.class.getDeclaredField("t");
        GenericDeclaration genericDeclaration = ((TypeVariable) field.getGenericType()).getGenericDeclaration();
        System.out.println(genericDeclaration);//class com.huang.practice.java.type.TypeVariableTest
    }
}
