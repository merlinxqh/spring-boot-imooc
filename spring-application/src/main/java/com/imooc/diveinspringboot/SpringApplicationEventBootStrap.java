package com.imooc.diveinspringboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SpringApplicationEventBootStrap
 * @Description spring framework应用事件 引导类
 * @Author xuqianghui
 * @Date 2019/3/24 21:28
 * @Version 1.0
 */
public class SpringApplicationEventBootStrap {
    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册应用监听事件
        context.addApplicationListener(event -> {
            System.out.println("监听到事件: "+event);
        });
        //启动上下文
        context.refresh();

        //手动发布事件
        context.publishEvent("HelloWorld");
        context.publishEvent("2019");
        context.publishEvent(new ApplicationEvent("小马哥") {
        });

        //关闭上下文
        context.close();
    }
}
