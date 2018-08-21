package com.huang.practice.base.create;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huang_jiangling on 2018/8/20.
 */
public class StringUtil {
    /**
     * 下划线转驼峰
     *
     * @param underline 需要转换的字符串；
     * @return 返回驼峰式字符串；
     */
    public static String underline2Camel(String underline) {

        /* 如果已经是驼峰式，则直接返回*/
        if (isCamel(underline)) {
            return underline;
        }

        Pattern pattern = Pattern.compile("[_]\\w");
        String camel = underline.toLowerCase();
        Matcher matcher = pattern.matcher(camel);
        while (matcher.find()) {
            String w = matcher.group().trim();
            camel = camel.replace(w, w.toUpperCase().replace("_", ""));
        }
        return camel;
    }

    /**
     * 判断字符串是否是驼峰式；
     *
     * @param string 要判断的字符串；
     * @return 返回判断结果；
     */
    public static boolean isCamel(String string) {

        /* 驼峰式不能包含下划线；*/
        if (StringUtils.isBlank(string) || string.contains("_")) {
            return false;
        }

        /* 驼峰式不能全大写；*/
        return !string.equals(string.toUpperCase());
    }

    /**
     * 驼峰转下划线
     *
     * @param camel 给定的驼峰式字符串；
     * @return 返回带下划线的字符串；
     */
    public static String camel2Underline(String camel) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(camel);
        while (matcher.find()) {
            String w = matcher.group().trim();
            camel = camel.replace(w, "_" + w);
        }
        return camel.toUpperCase();
    }
}
