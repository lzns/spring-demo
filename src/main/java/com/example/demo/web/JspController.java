package com.example.demo.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;

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
    
    @RequestMapping(value = "test2")
    @ResponseBody
    public User test2(@RequestBody User user) {
        System.out.println(user);
        return user;
    }
    @RequestMapping("testMoreUpload")
    public String tetMultipartUpload() {
        return "moreUpload";
    }
    
    @RequestMapping("/html")
    public void test3(HttpServletResponse res)throws Exception {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        StringBuffer sb =new StringBuffer();
        sb.append("<!DOCTYPE html>");
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<meta charset=\"UTF-8\">");
        sb.append("<title>Insert title here</title>");
        sb.append("</head><body>");
        sb.append("<h2>秋晨是个sb,哈哈</h2>");
        sb.append("</body></html>");
        PrintWriter writer = res.getWriter();
        writer.write(sb.toString());
        writer.flush();
        writer.close();
    }
}
