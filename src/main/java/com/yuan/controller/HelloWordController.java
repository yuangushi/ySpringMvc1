package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
    @RequestMapping("/hello.do")
    public String sayHello(){
        System.out.println("success");
        return "success";

    }
}
