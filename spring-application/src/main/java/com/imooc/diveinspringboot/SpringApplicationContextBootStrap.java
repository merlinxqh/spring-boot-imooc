package com.imooc.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName SpringApplicationContextBootStrap
 * @Description spring 应用上下文
 * @Author xuqianghui
 * @Date 2019/3/25 22:17
 * @Version 1.0
 */
@SpringBootApplication
public class SpringApplicationContextBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(SpringApplicationContextBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println("ConfigurableApplicationContext 类型: "+context.getClass().getName());
        System.out.println("Environment 类型: "+context.getEnvironment().getClass().getName());
        context.close();
    }
}
