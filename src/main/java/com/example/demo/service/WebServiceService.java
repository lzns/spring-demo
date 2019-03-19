package com.example.demo.service;

import java.util.Random;

import org.apache.cxf.endpoint.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.util.WebServiceUtil;
/**
 * 
 * @author dignzf
 *
 * 2019年3月5日
 */
@Service
public class WebServiceService {
    private static final Logger log = LoggerFactory.getLogger(WebServiceService.class);
    
    public String getMsg() {
        ThreadLocal<Client> connect = WebServiceUtil.getConnect();
        Client client = connect.get();
        Object[] invoke = null;
        try {
            if (client!=null) {
                log.info("远程连接client:"+client.toString());
                invoke = client.invoke("getMsg", "我是客户端！"+new Random().nextLong());
                for (Object object : invoke) {
                    log.info("服务端返回的数据：{}",object);
                }
            }else {
                return "远程连接获取失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("webservice 远程调用出错：{}",e.getMessage());
            return null;
        }finally {
            connect.remove();
        }
       return invoke[0].toString();
    }
}
