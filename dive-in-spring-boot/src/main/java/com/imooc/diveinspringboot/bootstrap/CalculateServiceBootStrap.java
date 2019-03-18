package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName CalculateServiceBootStrap
 * @Description {@link com.imooc.diveinspringboot.service.CalculateService} 计算服务 引导类
 * @Author xuqianghui
 * @Date 2019/3/18 22:29
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.imooc.diveinspringboot.service")
public class CalculateServiceBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);
        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println("sum(1,2,3,4,5,6,7,8,9,10)==>"+calculateService.sum(1,2,3,4,5,6,7,8,9,10));
        context.close();
    }
}
