package com.huang.practice.base.create;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by huang_jiangling on 2018/8/20.
 */
public class CodeTemplate {

    public static String fieldTemplate(String tField, String comment, Class clazz) {
        return new StringBuilder(60)
                .append("/**").append("\n")
                .append(" * ").append(StringUtils.isNoneBlank(comment) ? comment : tField).append(";").append("\n")
                .append(" */").append("\n")
                .append("@TableField(\"").append(tField).append("\")").append("\n")
                .append("private ").append(clazz.getSimpleName()).append(" ").append(StringUtil.underline2Camel(tField)).append(";")
                .toString();
    }

    public static String mapperResultSet(String tField) {
        return new StringBuilder(50)
                .append("<result column=\"")
                .append(tField).append("\" property=\"")
                .append(StringUtil.underline2Camel(tField))
                .append("\"/>")
                .toString();
    }

    public static String alterTableAdd(String field, Class<?> clazz, String tableName) {
        return new StringBuilder(30)
                .append("ALTER TABLE ")
                .append(tableName)
                .append(" ADD ")
                .append(field)
                .append(" ")
                .append(dbType(clazz))
                .append(";")
                .toString();
    }

    private static String dbType(Class<?> clazz) {
        if (Integer.class == clazz || int.class == clazz) {
            return "NUMBER(10,0)";
        } else if (double.class == clazz || Double.class == clazz) {
            return "NUMBER(20,2)";
        } else {
            return "VARCHAR2 (200)";
        }
    }

    public static String commentColumn(String tField, String tableName, String comment) {
        return new StringBuilder(50)
                .append("COMMENT ON COLUMN ")
                .append(tableName)
                .append(".")
                .append(tField)
                .append(" IS '")
                .append(StringUtils.isNotBlank(comment) ? comment : tField)
                .append("';")
                .toString();
    }
}
