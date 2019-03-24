package com.imooc.diveinspringboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @ClassName ConditionOnSystemProperty
 * @Description java系统属性 条件判断
 * @Author xuqianghui
 * @Date 2019/3/20 21:36
 * @Version 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionOnSystemProperty {

    /**
     * java系统属性名称
     * @return
     */
    String name();

    /**
     * java系统属性 值
     * @return
     */
    String value();
}
