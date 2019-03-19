package com.example.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServiceTest {

    @WebMethod     //声明暴露服务的方法，可以不写
    public String getMsg(String msg);
}
