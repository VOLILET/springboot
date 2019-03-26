package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component(value="exampleBeanservice")

public class ExampleBeanservice {
	private String name="aaa";

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
