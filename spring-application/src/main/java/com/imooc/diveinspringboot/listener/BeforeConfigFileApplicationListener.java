package com.imooc.diveinspringboot.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.Environment;

/**
 * @ClassName BeforeConfigFileApplicationListener
 * @Description Before {@link ConfigFileApplicationListener} 实现
 * @Author xuqianghui
 * @Date 2019/3/25 22:04
 * @Version 1.0
 */
public class BeforeConfigFileApplicationListener implements SmartApplicationListener, Ordered {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent environmentEvent = (ApplicationEnvironmentPreparedEvent) event;
            Environment environment = environmentEvent.getEnvironment();
            // 打印application.properties 属性
            System.out.println("environment.getProperties(\"name\")="+environment.getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) {

        }
    }


    @Override
    public int getOrder() {
        return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
    }
}
