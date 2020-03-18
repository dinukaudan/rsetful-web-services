package com.in28minutes.rest.webservices.restfulwebservice.service;

import net.bytebuddy.asm.Advice.Return;

public class HelloWorldBean {

	private String messege;

	public HelloWorldBean(String messege, String name) {
	
		this.messege = messege;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [messege=" + messege + "]";
	}
	
	
	}

