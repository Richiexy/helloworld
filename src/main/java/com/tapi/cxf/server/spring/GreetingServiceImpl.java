package com.tapi.cxf.server.spring;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;
import com.tapi.cxf.server.facade.IGreeting;

@WebService(endpointInterface = "com.tapi.cxf.server.facade.IGreeting")
public class GreetingServiceImpl implements IGreeting {

	public String sayXml(String userName) {
		 System.out.println("web Xml services调用成功");
		 return createXml(userName);
	}

//	@WebMethod(exclude=true)
	public String sayJson(String userName) {
		System.out.println("web Json services调用成功");
		return createJsonObject(userName).toJSONString();
	}
	
	/**
	   * 根据传递的字符串生成对应的xml。
	   * 
	   * @param 传递过来的参数name
	   * @return 返回xml的字符串
	   */
	  public String createXml(String name) {

	    StringBuffer sb = new StringBuffer();
	    sb.append("<?xml version='1.0' encoding='UTF-8'?>");
	    sb.append("<Result>");
	    sb.append("<cinamaName>机械战警</cinamaName>");
	    sb.append("<director>" + name + "</director>");
	    sb.append("<introduce>一部好莱坞大片，3D观影，不错！！！</introduce>");
	    sb.append("<price>25</price>");
	    sb.append("</Result>");
	    return sb.toString();
	  }
	  
	  /**
	   * 创建JsonOBject对象
	   * 
	   * @param 客户端传递的参数Name
	   * @return 返回jsonObject对象
	   */
	  public JSONObject createJsonObject(String name) {
	    JSONObject jsonObj = new JSONObject();
	    jsonObj.put("name", name);
	    String[] likes = new String[] { "music", "movie", "study" };
	    jsonObj.put("hobby", likes);
	    Map<String, String> ingredients = new HashMap<String, String>();
	    ingredients.put("age", "23");
	    ingredients.put("EnglishName", "spider man");
	    ingredients.put("sex", "boy");
	    ingredients.put("love", "tangwei");
	    jsonObj.put("message", ingredients);
	    System.out.println(jsonObj.toJSONString());
	    return jsonObj;
	  }
	
}
