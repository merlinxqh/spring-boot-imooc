package com.imooc.diveinspringboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @ClassName OnSystemPropertyCondition
 * @Description 系统条件判断
 * @Author xuqianghui
 * @Date 2019/3/20 21:38
 * @Version 1.0
 */
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String,Object>  attributesMap =   metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String propertyName = String.valueOf(attributesMap.get("name"));
        String propertyValue = String.valueOf(attributesMap.get("value"));

        String systemPropertyValue = System.getProperty("user.name");
        return propertyValue.equals(systemPropertyValue);
    }
}
