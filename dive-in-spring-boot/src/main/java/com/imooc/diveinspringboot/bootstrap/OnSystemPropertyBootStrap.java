package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.condition.ConditionOnSystemProperty;
import com.imooc.diveinspringboot.repository.MySecondRepositoryBean;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName OnSystemPropertyBootStrap
 * @Description java系统条件判断 引导类
 * @Author xuqianghui
 * @Date 2019/3/20 21:51
 * @Version 1.0
 */

public class OnSystemPropertyBootStrap {

    @Bean
    @ConditionOnSystemProperty(name = "user.name", value = "leoftd11")
    public String helloWorld(){
        return "Hello, World 徐强辉";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(OnSystemPropertyBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("HelloWorld bean:"+ helloWorld);
        context.close();
    }
}
