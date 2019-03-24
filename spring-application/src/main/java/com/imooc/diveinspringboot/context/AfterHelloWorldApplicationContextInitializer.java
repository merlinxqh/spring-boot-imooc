package com.imooc.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @ClassName AfterHelloWorldApplicationContextInitializer
 * @Author xuqianghui
 * @Date 2019/3/24 19:58
 * @Version 1.0
 */
@Order//默认最低优先级
public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("after application id = "+applicationContext.getId());
    }
}
