package com.tapi.cxf.test.server;

import javax.xml.ws.Endpoint;

import org.junit.Before;
import org.junit.Test;

import com.tapi.cxf.server.facade.IGreeting;
import com.tapi.cxf.server.spring.GreetingServiceImpl;

public class ServiceTest {

	@Before
	public void init(){
		IGreeting greeting = new GreetingServiceImpl();
		String address = "http://localhost:9000/helloWorld";  
		//“‘endpoint∑¢≤º
		Endpoint.publish(address, greeting);  
	}
	
	@Test
	public void startServer() throws InterruptedException{
		System.out.println("wroking!");
		Thread.sleep(5 * 60 * 1000);
		System.out.println("stopped!");
	}
}
