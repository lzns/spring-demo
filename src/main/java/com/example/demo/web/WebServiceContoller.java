package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.WebServiceService;
/**
 * 
 * @author dignzf
 *
 * 2019年3月5日
 */
@Controller
@RequestMapping("/webservice")
public class WebServiceContoller {

    @Autowired
    private WebServiceService webServiceService;
    
    @RequestMapping("/getMsg")
    @ResponseBody
    public String getMsg(){
       String msg = webServiceService.getMsg();
       return msg;
    }
}
