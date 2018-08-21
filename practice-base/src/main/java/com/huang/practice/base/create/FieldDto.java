package com.huang.practice.base.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by huang_jiangling on 2018/8/20.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldDto {
    private String tableName;
    private String tField;
    private String comment;
    private Class clazz;
}
