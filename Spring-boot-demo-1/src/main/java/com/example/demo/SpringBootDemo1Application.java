package com.example.demo;

import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.support.ServletRequestHandledEvent;

@SpringBootApplication
@ComponentScan(basePackages="com.example.controller")
public class SpringBootDemo1Application {

	public static final Logger logger =LoggerFactory.getLogger(SpringBootDemo1Application.class);
	@PostConstruct
	public void logSomething() {
		logger.debug("Sample Debug Message");
		logger.info("Sample Info Message");
		logger.trace("Sample trace Message");
		logger.warn("Sample warn Message");
		logger.error("Sample error Message");
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

@Bean
public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	return args -> {
		System.out.println("list beans:"+ ctx.getBeanDefinitionCount());
	

	};
}

@Bean
public ApplicationRunner appRunner() {
	return args -> {
		System.out.println();
		System.out.println("Application Runner:");
		for (String opt : args.getOptionNames()) {
			System.out.print(opt);
			System.out.print("->");
			System.out.println(args.getOptionValues(opt).stream().collect(Collectors.joining(",", "[", "]")));
			String.join(",", args.getOptionValues(opt));
		}
	};
}

@Bean
public ApplicationListener<ApplicationEvent> helloListener() {
	final String HELLO_URL = "/hello";
	return (ApplicationEvent event) -> {
		if (event instanceof ServletRequestHandledEvent) {
			ServletRequestHandledEvent e = (ServletRequestHandledEvent) event;
			if (e.getRequestUrl().equals(HELLO_URL))
				System.out.println("visit hello");
		}
	};
}
@Bean
public ApplicationListener<ApplicationEvent> myListener() {
	final String MY_URL = "/my";
	return (ApplicationEvent event) -> {
		if (event instanceof ServletRequestHandledEvent) {
			ServletRequestHandledEvent e = (ServletRequestHandledEvent) event;
			if (e.getRequestUrl().equals(MY_URL))
				System.out.println("visit my");
		}
	};
}


}

