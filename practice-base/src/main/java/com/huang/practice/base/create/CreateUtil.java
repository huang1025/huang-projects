package com.huang.practice.base.create;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huang_jiangling on 2018/8/20.
 */
public class CreateUtil {

    private static Map<String, List<FieldDto>> cache = new HashMap<>();

    private static void add(FieldDto fieldDto) {
        List<FieldDto> fieldDtos = cache.get(fieldDto.getTableName());
        if (fieldDtos == null) {
            fieldDtos = new ArrayList<>();
            cache.put(fieldDto.getTableName(), fieldDtos);
        }
        fieldDtos.add(fieldDto);
    }

    private static void create() {
        if (cache == null || cache.size() == 0) {
            return;
        }

        for (String each : cache.keySet()) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("===============" + each + "===============");
            List<FieldDto> dtoList = cache.get(each);
            if (dtoList == null || dtoList.size() == 0) {
                return;
            } else {
                System.out.println();
                System.out.println("新增字段：");
                for (FieldDto eachDto : dtoList) {
                    System.out.println(CodeTemplate.fieldTemplate(eachDto.getTField(), eachDto.getComment(), eachDto.getClazz()));
                }
                System.out.println();
                System.out.println("新增Mapper的xml文件：");
                for (FieldDto eachDto : dtoList) {
                    System.out.println(CodeTemplate.mapperResultSet(eachDto.getTField()));
                }
                System.out.println();
                System.out.println("新增字段SQL:");
                for (FieldDto eachDto : dtoList) {
                    System.out.println(CodeTemplate.alterTableAdd(eachDto.getTField(), eachDto.getClazz(), eachDto.getTableName()));
                    System.out.println(CodeTemplate.commentColumn(eachDto.getTField(), eachDto.getTableName(), eachDto.getComment()));
                }
            }
        }
    }

    public static void main(String[] args) {

//        add(FieldDto.builder().tableName("DA_CXS_FINAL_IN").tField("FORCE_CHECK").comment("强制校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_FINAL_IN").tField("ACT_CHECK").comment("客户自觉校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_FINAL_IN").tField("IF_TOTAL").comment("是否完全循环").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_FINAL_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());
//
//        add(FieldDto.builder().tableName("DA_CXS_CREDIT_TEL_IN").tField("FORCE_CHECK").comment("强制校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_CREDIT_TEL_IN").tField("ACT_CHECK").comment("客户自觉校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_CREDIT_TEL_IN").tField("IF_TOTAL").comment("是否完全循环").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_CREDIT_TEL_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());
//
//        add(FieldDto.builder().tableName("DA_CXS_FULL_AUTO_CHECK_IN").tField("FORCE_CHECK").comment("强制校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_FULL_AUTO_CHECK_IN").tField("ACT_CHECK").comment("客户自觉校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_FULL_AUTO_CHECK_IN").tField("IF_TOTAL").comment("是否完全循环").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_FULL_AUTO_CHECK_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());
//
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("FORCE_CHECK").comment("强制校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("ACT_CHECK").comment("客户自觉校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("IF_TOTAL").comment("是否完全循环").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());
//
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("FORCE_CHECK").comment("强制校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("ACT_CHECK").comment("客户自觉校验类别").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("IF_TOTAL").comment("是否完全循环").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());


//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("GJJ_TIME").comment("公积金认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("XYK_TIME").comment("信用卡认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("SB_TIME").comment("社保认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("XD_TIME").comment("详单认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("RH_TIME").comment("人行认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_DH_CHECK_IN").tField("ZM_TIME").comment("芝麻分认证时间").clazz(Integer.class).build());
//
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("GJJ_TIME").comment("公积金认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("XYK_TIME").comment("信用卡认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("SB_TIME").comment("社保认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("XD_TIME").comment("详单认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("RH_TIME").comment("人行认证时间").clazz(Integer.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_QUESTION_IN").tField("ZM_TIME").comment("芝麻分认证时间").clazz(Integer.class).build());


//        add(FieldDto.builder().tableName("DA_CXS_CHECK_ONE_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());
//        add(FieldDto.builder().tableName("DA_CXS_CHECK_TWO_IN").tField("PRODUCT_TYPE").comment("产品模式").clazz(String.class).build());


        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("IF_TOTAL").comment("是否完全循环").clazz(String.class).build());
        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("GJJ_TIME").comment("公积金认证时间").clazz(Integer.class).build());
        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("XYK_TIME").comment("信用卡认证时间").clazz(Integer.class).build());
        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("SB_TIME").comment("社保认证时间").clazz(Integer.class).build());
        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("XD_TIME").comment("详单认证时间").clazz(Integer.class).build());
        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("RH_TIME").comment("人行认证时间").clazz(Integer.class).build());
        add(FieldDto.builder().tableName("CXS_APPLY_INFO").tField("ZM_TIME").comment("芝麻分认证时间").clazz(Integer.class).build());

        create();
    }
}
