package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.repository.MySecondRepositoryBean;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName EnableHelloWorldBootStrap
 * @Description EnableHelloWorld 引导类
 * @Author xuqianghui
 * @Date 2019/3/18 21:52
 * @Version 1.0
 */
@EnableHelloWorld
public class EnableHelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("===>"+helloWorld);
        context.close();
    }
}
