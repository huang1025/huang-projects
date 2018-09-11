package com.huang.practice.java.type;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Map;

/**
 * Created by huang_jiangling on 2018/9/11.
 */
public class WildcardTypeTest {

    private Map<? extends Number, ? super Integer> map;

    public static void main(String[] args) throws NoSuchFieldException {
        Field field = WildcardTypeTest.class.getDeclaredField("map");
        Type[] actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        System.out.println((((WildcardType) actualTypeArguments[0]).getUpperBounds())[0]);//class java.lang.Number
        System.out.println((((WildcardType) actualTypeArguments[1]).getLowerBounds())[0]);//class java.lang.Integer
    }
}