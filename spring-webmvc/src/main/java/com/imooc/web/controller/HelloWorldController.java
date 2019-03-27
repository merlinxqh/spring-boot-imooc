package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloWorldController
 * @Description HelloWorld {@link Controller}
 * @Author xuqianghui
 * @Date 2019/3/27 22:00
 * @Version 1.0
 */
@Controller
public class HelloWorldController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
