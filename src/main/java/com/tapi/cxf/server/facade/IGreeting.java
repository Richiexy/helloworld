package com.tapi.cxf.server.facade;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;

/**
 * �ӿ�
 * @author Administrator
 *
 */
@WebService
public interface IGreeting {

	public String sayXml(String userName); 
	
	public String sayJson(String userName);
}
