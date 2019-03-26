package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="anotherBean")
public class AnotherBean {
	
	private String name ="AnotherBean";

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
public void show() {
	System.out.println("bbbb");
}

}
