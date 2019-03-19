package com.example.demo.util;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
/**
 * 
 * @author dignzf
 *
 * 2019年3月5日
 */
public class WebServiceUtil {
    private static final ThreadLocal<Client> clientThreadLocal = new ThreadLocal<Client>();
    private static final  Client client;
    static {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        client = dcf.createClient("http://localhost:8090/services/user?wsdl");
    }
    public static ThreadLocal<Client> getConnect(){
        clientThreadLocal.set(client);
        return clientThreadLocal;
    }
}
