package com.imooc.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @ClassName HelloWorldApplicationListener
 * @Description After HelloWorld {@link ApplicationListener} 监听  {@link ContextRefreshedEvent} 事件
 * @Author xuqianghui
 * @Date 2019/3/24 20:20
 * @Version 1.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE + 1)//
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("After HelloWorld:"+event.getApplicationContext().getId()+", timestamp:"+event.getTimestamp());
    }
}
