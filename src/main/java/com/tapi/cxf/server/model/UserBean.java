package com.tapi.cxf.server.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class UserBean {

	private String name;
	private Integer age;
	private String account;
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserBean(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public UserBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + ", account="
				+ account + ", password=" + password + "]";
	}

}