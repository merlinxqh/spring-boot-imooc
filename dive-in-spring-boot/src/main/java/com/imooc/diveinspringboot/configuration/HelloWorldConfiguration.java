package com.imooc.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloWorldConfiguration
 * @Description TODO
 * @Author xuqianghui
 * @Date 2019/3/18 21:49
 * @Version 1.0
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){//方法名 对应 bean的ID
        return "Hello world 2019..";
    }
}
