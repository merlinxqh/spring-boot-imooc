package com.imooc.diveinspringboot.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName HelloWorldRunListener
 * @Description HelloWorld {@link SpringApplicationRunListener}
 * @Author xuqianghui
 * @Date 2019/3/24 21:40
 * @Version 1.0
 */
public class HelloWorldRunListener implements SpringApplicationRunListener {

    /**
     * SpringApplication.run() 实例化该 对象会默认传两个参数
     * @param application
     * @param args
     */
    public HelloWorldRunListener(SpringApplication application, String[] args){

    }

    @Override
    public void starting() {
        System.out.println("HelloWorldRunListener.starting()...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
