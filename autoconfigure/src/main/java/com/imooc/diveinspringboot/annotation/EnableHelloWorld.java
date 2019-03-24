package com.imooc.diveinspringboot.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName EnableHelloWorld
 * @Description 激活HelloWorld模块
 *  spring @Enable 模板装配
 * @Author xuqianghui
 * @Date 2019/3/18 21:46
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)//保留策略 运行时 在反射的时候 获取
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)//基于 @Enable模板 实现 注解驱动
@Import(HelloWorldImportSelector.class) // 基于接口实现 更加灵活一点
public @interface EnableHelloWorld {

}
