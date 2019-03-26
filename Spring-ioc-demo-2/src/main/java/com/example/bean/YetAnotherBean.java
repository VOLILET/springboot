package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="yetAnotherBean")
public class YetAnotherBean {
	
	private String name ="YetAnotherBean";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
