package com.spring.service;

public class ExampleBeanService {
	private String name;

	public void sayHello() {
		System.out.println("Hello " + this.name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
