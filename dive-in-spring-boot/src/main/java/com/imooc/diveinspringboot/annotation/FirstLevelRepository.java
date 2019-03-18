package com.imooc.diveinspringboot.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @ClassName FirstLevelRepository
 * @Description TODO
 * @Author xuqianghui
 * @Date 2019/3/14 22:20
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface FirstLevelRepository {
    String value() default "";
}
