package com.tapi.cxf.server.spring;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONObject;
import com.tapi.cxf.server.facade.IGreeting;

@WebService(endpointInterface = "com.tapi.cxf.server.facade.IGreeting")
public class GreetingServiceImpl implements IGreeting {

	public String sayXml(String userName) {
		 System.out.println("web Xml services���óɹ�");
		 return createXml(userName);
	}

//	@WebMethod(exclude=true)
	public String sayJson(String userName) {
		System.out.println("web Json services���óɹ�");
		return createJsonObject(userName).toJSONString();
	}
	
	/**
	   * ���ݴ��ݵ��ַ������ɶ�Ӧ��xml��
	   * 
	   * @param ���ݹ����Ĳ���name
	   * @return ����xml���ַ���
	   */
	  public String createXml(String name) {

	    StringBuffer sb = new StringBuffer();
	    sb.append("<?xml version='1.0' encoding='UTF-8'?>");
	    sb.append("<Result>");
	    sb.append("<cinamaName>��еս��</cinamaName>");
	    sb.append("<director>" + name + "</director>");
	    sb.append("<introduce>һ���������Ƭ��3D��Ӱ����������</introduce>");
	    sb.append("<price>25</price>");
	    sb.append("</Result>");
	    return sb.toString();
	  }
	  
	  /**
	   * ����JsonOBject����
	   * 
	   * @param �ͻ��˴��ݵĲ���Name
	   * @return ����jsonObject����
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
