package com.mytest.app;

public class TestPrototypePojo {

	String myMsg1;

	public String getMyMsg1() {
		return myMsg1;
	}

	public void setMyMsg1(String myMsg1) {
		this.myMsg1 = myMsg1;
	}
	
	public void init(){
		System.out.println("This is my init method");
	}
	
	public void destroy(){
		System.out.println("This is my destroy method");
	}
	
}
