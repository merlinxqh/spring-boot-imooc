package com.imooc.diveinspringboot.configuration;

import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloWorldAutoConfiguration
 * @Description HelloWorld自动装配
 * @Author xuqianghui
 * @Date 2019/3/22 22:50
 * @Version 1.0
 */
@Configuration  //spring 模式注解装配
@EnableHelloWorld //spring @Enable模块装配
@ConditionOnSystemProperty(name = "user.name", value = "leoftd") //条件装配
public class HelloWorldAutoConfiguration {

}
