package com.example.demo.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrometheusController {
    
    @RequestMapping("/metrics")
    public void metrics(HttpServletResponse response)throws Exception {
        response.sendRedirect("/user/getAllUser");
    }
}
