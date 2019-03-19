package com.example.demo;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8090/services/user?wsdl");
        Object[] objects = new Object[0];
      //  QName opName = new QName("http://service.demo.example.com/", "getMsg");
        try {
//            objects = client.invoke(opName, "maple");
            objects = client.invoke("getMsg", "maple");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    
}
