package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@PropertySource(value="classPath:config.yml")*/
public class MyController {
	@Value("${my.name}")
	private String name;
	@Value("${my.age}")
	private int age;

	@RequestMapping(value = "/my")
	public String my() {
		return "i'm" + name + "i'm " + age +"old";
	}
	
}
