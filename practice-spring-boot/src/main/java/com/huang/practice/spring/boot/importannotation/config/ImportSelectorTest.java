package com.huang.practice.spring.boot.importannotation.config;

import com.huang.practice.spring.boot.common.People;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * Created by huang_jiangling on 2018/7/13.
 */
public class ImportSelectorTest implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("----------");
        System.out.println("----------");

        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        for (String each : annotationTypes) {
            System.out.println(each.toString());
        }

        System.out.println("----------");
        System.out.println("----------");
        return new String[]{People.class.getName()};
    }
}
