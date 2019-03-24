package com.imooc.diveinspringboot;

import com.google.common.collect.Sets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

//@SpringBootApplication
public class SpringApplicationBootStrap {

    public static void main(String[] args) {
//        SpringApplication.run(ApplicationBootStrap.class, args);
        SpringApplication application = new SpringApplication();
        Set<String> sourcesSet = Sets.newHashSet();
        sourcesSet.add(ApplicationBootStrap.class.getName());
        application.setSources(sourcesSet);
        application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("bean :"+context.getBean(ApplicationBootStrap.class));
    }

    @SpringBootApplication
    public static class ApplicationBootStrap{

    }

}
