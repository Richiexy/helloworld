package com.tapi.cxf.test;

public class StrTest {

	{
		System.out.println("------------a-------------");
	}
	
	static{
		System.out.println("------------b-------------");
	}
	
	StrTest(){
		System.out.println("------------c-------------");
	}
	
	public static void main(String[] args){
		StrTest tmp = new StrTest();
	}
}
