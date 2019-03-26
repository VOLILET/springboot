package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value="onebean")
public class OneBean {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public OneBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public OneBean() {
		super();
	}
	public void start() {
		System.out.println("start");
	}
	public void stop() {
		System.out.println("stop");
	}
	
}
