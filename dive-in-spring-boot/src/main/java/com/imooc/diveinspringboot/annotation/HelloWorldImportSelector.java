package com.imooc.diveinspringboot.annotation;

import com.imooc.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName HelloWorldImportSelector
 * @Description HelloWorld {@link org.springframework.context.annotation.ImportSelector} 实现
 * @Author xuqianghui
 * @Date 2019/3/18 22:03
 * @Version 1.0
 */
public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
