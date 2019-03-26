package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.impl.MessageService;

@SpringBootApplication
/*@ComponentScan(basePackages="com.example.controller")*/
public class SpringBootDemo2Application implements CommandLineRunner{

	@Autowired
	private MessageService msg;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}


	/*public void run(String... args){
		// TODO Auto-generated method stub
		System.out.println(msg.getMessage());
		
	}*/
	@Override
	public void run(String...args) {
		System.out.println(msg.getMessage());
	}



	
	
}
