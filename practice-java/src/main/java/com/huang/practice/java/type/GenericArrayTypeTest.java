package com.huang.practice.java.type;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by huang_jiangling on 2018/9/11.
 */
public class GenericArrayTypeTest<T> {

    private T[] t;
    private List<String>[] list;

    public static void main(String[] args) throws NoSuchFieldException {

        Field fieldT = GenericArrayTypeTest.class.getDeclaredField("t");
        Type genericType = fieldT.getGenericType();
        System.out.println(genericType instanceof GenericArrayType);//true
        Type genericComponentType = ((GenericArrayType) genericType).getGenericComponentType();
        System.out.println(genericComponentType);//T
        System.out.println(genericComponentType.getClass().getName());//sun.reflect.generics.reflectiveObjects.TypeVariableImpl

        Field fieldList = GenericArrayTypeTest.class.getDeclaredField("list");
        Type genericType1 = fieldList.getGenericType();
        System.out.println(genericType1 instanceof GenericArrayType);//true
        Type genericComponentType1 = ((GenericArrayType) genericType1).getGenericComponentType();
        System.out.println(genericComponentType1);//java.util.List<java.lang.String>
        System.out.println(genericComponentType1.getClass().getName());//sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl
    }
}
