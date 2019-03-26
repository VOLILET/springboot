package com.example.enter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.ExampleBean;
import com.example.demo.service.ExampleBeanservice;


public class SampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//按包路径扫描
	    context.scan("com.example");
		context.refresh();
		context.registerShutdownHook();
		
		int count = context.getBeanDefinitionCount();	
		System.out.println("Beans的个数：" + count);
		String[] names = context.getBeanDefinitionNames();
		
		for (String name : names) {
			System.out.println(name+"--->");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());
		}		
	
		context.getBean("exampleBeanservice");
	    ExampleBeanservice bean =context.getBean("exampleBeanservice", ExampleBeanservice.class);
	    context.getBean("exampleBean");
	    ExampleBean bean1=context.getBean("exampleBean",ExampleBean.class);
	}
	 
}
