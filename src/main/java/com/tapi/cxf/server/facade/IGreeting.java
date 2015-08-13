package com.tapi.cxf.server.facade;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;

/**
 * ½Ó¿Ú
 * @author Administrator
 *
 */
@WebService
public interface IGreeting {

	public String sayXml(String userName); 
	
	public String sayJson(String userName);
}
