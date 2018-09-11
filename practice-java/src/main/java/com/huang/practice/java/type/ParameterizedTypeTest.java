package com.huang.practice.java.type;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/**
 * Created by huang_jiangling on 2018/9/11.
 */
public class ParameterizedTypeTest<T> {

    private Map<String, Map<String, String>> map;
    private ParameterizedTypeTest<String> stringParameterizedTypeTest = new ParameterizedTypeTest<>();
    private Map.Entry<String, String> mapEntry;

    public static void main(String[] args) throws NoSuchFieldException {
        methodOfGetAcctualTypeArguments();
    }

    private static void methodOfGetAcctualTypeArguments() throws NoSuchFieldException {
        TypeVariable<Class<ParameterizedTypeTest>>[] typeParameters = ParameterizedTypeTest.class.getTypeParameters();
        System.out.println(typeParameters[0]);//T

        Field field = ParameterizedTypeTest.class.getDeclaredField("stringParameterizedTypeTest");
        Type genericType = field.getGenericType();
        System.out.println(genericType instanceof ParameterizedType);//true
        ParameterizedType parameterizedType = (ParameterizedType) genericType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0]);//class java.lang.String

        Field map = ParameterizedTypeTest.class.getDeclaredField("map");
        parameterizedType = (ParameterizedType) map.getGenericType();
        actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0]);//class java.lang.String
        System.out.println(actualTypeArguments[1]);//java.util.Map<java.lang.String, java.lang.String>
        System.out.println(actualTypeArguments[0].getClass().getName());//java.lang.Class
        System.out.println(actualTypeArguments[1].getClass().getName());//sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl
    }

    private static void methodGetRawType() throws NoSuchFieldException {
        Field field = ParameterizedTypeTest.class
                .getDeclaredField("stringParameterizedTypeTest");
        Type genericType = field.getGenericType();
        Type rawType = ((ParameterizedType) genericType).getRawType();
        System.out.println(rawType);//class com.huang.practice.java.type.ParameterizedTypeTest
    }

    private static void methodGetOwnerType() throws NoSuchFieldException {
        Field field = ParameterizedTypeTest.class.getDeclaredField("mapEntry");
        Type ownerType = ((ParameterizedType) field.getGenericType()).getOwnerType();
        System.out.println(ownerType);//interface java.util.Map
    }
}
