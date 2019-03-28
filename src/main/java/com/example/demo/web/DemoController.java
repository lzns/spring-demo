package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello() {
        System.out.println("访问到了！！！！");
        System.out.println("访问到了！！！！");
        return "hell springboot!";
    } 
}
