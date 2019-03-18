package com.imooc.diveinspringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.imooc.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {
		//等效启动
		new SpringApplicationBuilder(DiveInSpringBootApplication.class)
//				.web(WebApplicationType.NONE) //不启用web容器
//				.properties("abc=1234")
				.run(args);

//		SpringApplication.run(DiveInSpringBootApplication.class, args);
	}

}
