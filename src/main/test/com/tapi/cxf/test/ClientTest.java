package com.tapi.cxf.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.tapi.cxf.client.IGreetingService;
import com.tapi.cxf.server.facade.IGreeting;

public class ClientTest {

	@Test
	public void testLocalClient(){
	        
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IGreeting.class);
        factory.setAddress("http://localhost:9000/helloWorld");
        IGreeting client = (IGreeting)factory.create();
        System.out.println(client.sayXml("foo"));
        System.out.println(JSONObject.parseObject(client.sayJson("foo").toString()));
    }
	
	@Test
	public void testWebClient(){
		IGreetingService service = new IGreetingService() ;
		com.tapi.cxf.client.IGreeting greeting = (com.tapi.cxf.client.IGreeting) service.getIGreetingPort();
		
        System.out.println(greeting.sayXml(" 俞根海！"));
        String jsonStr = greeting.sayJson(" 俞根海！");
        System.out.println(JSONObject.toJSONString(jsonStr));
		
	}
	
}
