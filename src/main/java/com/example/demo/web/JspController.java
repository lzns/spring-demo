package com.example.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {
    
    private static final Logger log = LoggerFactory.getLogger(JspController.class);
    
    @RequestMapping("/testJsp")
    public String testJsp() {
        System.out.println("访问到了========================");
        log.info("访问到了========================");
        return "test";
    }
    @RequestMapping("testUpload")
    public String tetUpload() {
        return "upload";
    }
    
    @RequestMapping("testMoreUpload")
    public String tetMultipartUpload() {
        return "moreUpload";
    }
}
