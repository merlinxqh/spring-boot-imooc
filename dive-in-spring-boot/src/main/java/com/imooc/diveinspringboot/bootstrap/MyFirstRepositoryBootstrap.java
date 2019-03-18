package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.repository.MySecondRepositoryBean;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName MyFirstRepositoryBootstrap
 * @Description TODO
 * @Author xuqianghui
 * @Date 2019/3/14 22:24
 * @Version 1.0
 */
@ComponentScan(basePackages = "com.imooc.diveinspringboot.repository")
public class MyFirstRepositoryBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(MyFirstRepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        MySecondRepositoryBean firstRepository = context.getBean("mySecondRepository", MySecondRepositoryBean.class);
        System.out.println("bean 是否存在:"+firstRepository);
        context.close();
    }
}
