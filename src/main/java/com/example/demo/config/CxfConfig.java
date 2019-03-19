package com.example.demo.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.service.WebServiceTest;

@Configuration
//名称需要唯一，value指定路径
//@PropertySource(value= {"classpath:confgi/jdbc.properties"},name="jdbc-test-dev.properties")
public class CxfConfig {

//    @Value("${jdbc.url}") //将配置文件里面的值自动的赋值给url
//    private String url;
    @Autowired
    private Bus bus;

    @Autowired
    WebServiceTest webServiceTest;

    @Bean
    public Endpoint endpoint() {
//      我是eclispe
        //我是github
        EndpointImpl endpoint = new EndpointImpl(bus, webServiceTest);
        endpoint.publish("/user");
        System.out.println("你Ian是打发第三方");
        System.out.println();
        return endpoint;
    }
}
