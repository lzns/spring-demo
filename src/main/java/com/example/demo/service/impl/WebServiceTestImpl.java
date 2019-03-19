package com.example.demo.service.impl;

import java.util.Random;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.service.WebServiceTest;

@WebService(targetNamespace="http://service.demo.example.com/",
        endpointInterface="com.example.demo.service.WebServiceTest")
@Component
public class WebServiceTestImpl implements WebServiceTest {

    private static final Logger log = LoggerFactory.getLogger(WebServiceTestImpl.class);

    @Override
    public String getMsg(String msg) {
        log.info("客户端发来的参数：{}",msg);
        String serviceMsg = "hello,I'm server client."+new Random().nextLong();
        return serviceMsg;
    }

}
