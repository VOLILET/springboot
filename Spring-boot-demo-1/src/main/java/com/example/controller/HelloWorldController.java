package com.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringBootDemo1Application;

@RestController
public class HelloWorldController {

	@Value("${name}")
	private String name;
	public static final Logger logger =LoggerFactory.getLogger(SpringBootDemo1Application.class);
	@RequestMapping(value="/hello")
	public String index() {

		logger.debug("Sample Debug Message");
		logger.info("Sample Info Message");
		logger.trace("Sample trace Message");
		logger.warn("Sample warn Message");
		logger.error("Sample error Message");
		return "Hello world";
		
	}

}
