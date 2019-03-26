package com.example.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ConfigBean;
@RestController
@EnableConfigurationProperties({ConfigBean.class/*,User.class*/})
public class ConfigController {
	@Autowired
	ConfigBean configBean;
	@RequestMapping(value="/cpnfig")
public String config() {
	
	return configBean.toString();
}
	

}
