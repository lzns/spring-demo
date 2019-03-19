package com.example.demo.web;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
    
    @Resource
    private UserService userService;
    
    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        User user = new User();
        user.setName("你猜");
        user.setId(new Random().nextInt());
        user.setCreateDate(new Date());
        request.setAttribute("user", user);
        
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setAttribute("isShow", true);
        session.setAttribute("age", 12);
        List<User> allUser = userService.getAllUser();
        request.setAttribute("userList", allUser);
        return "test";
    }
    
    
}
