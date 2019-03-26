package com.example.demo;

import com.example.bean.ExampleBean;
import com.example.bean.OneBean;
import com.example.bean.YetAnotherBean;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;

import com.example.bean.AnotherBean;

public class Config {
	@Bean
	public OneBean OneBean() {
		OneBean onebean = new OneBean();
		return onebean;
	}

	@Bean
	public AnotherBean getAnotherBean() {
		AnotherBean another = new AnotherBean();
		return another;
	}

	@Bean
	public YetAnotherBean getYetAnotherBean() {
		YetAnotherBean yetanother = new YetAnotherBean();
		return yetanother;
	}

	@Bean("exampleBean")
	public ExampleBean getExampleBean() {
		ExampleBean examplebean = new ExampleBean();
		examplebean.setBeanOne(getAnotherBean());
		examplebean.setBeanTwo(getYetAnotherBean());
		examplebean.setI(000);
		return examplebean;
	}

	@Bean(destroyMethod = "close")
	DataSource dataSource() {
		BasicDataSource bs = new BasicDataSource();
		bs.setDriverClassName("com.mysql.jdbc.Driver");
		bs.setUsername("app");
		bs.setPassword("app");
		bs.setUrl("jdbc:mysql://localhost:3306/app?useUnicode=true&characterEncoding=utf-8");
		return bs;
	}
}
