package com.imooc.diveinspringboot.annotation;

import java.lang.annotation.*;

/**
 * @ClassName SecondLevelRepository
 * @Description TODO
 * @Author xuqianghui
 * @Date 2019/3/18 21:28
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
