package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloWorldController
 * @Description HelloWorld {@link Controller}
 * @Author xuqianghui
 * @Date 2019/3/27 22:00
 * @Version 1.0
 */
@Controller
public class HelloWorldController {


    @RequestMapping("/api/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
