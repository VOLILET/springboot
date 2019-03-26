package com.example.demo;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.AnotherBean;
import com.example.bean.ExampleBean;
import com.example.demo.service.ExampleBeanservice;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class D3SpringApplicationTests {

	/*@Autowired
	private ExampleBean exampleBean;
	@Resource
	public void test() {
		System.out.println(exampleBean.getBeanOne().getName());
		System.out.println(exampleBean.getBeanTwo().getName());
	}*/
	private AnnotationConfigApplicationContext context;
	
	@Before
	public void contextLoads() {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.example");
		context.refresh();
	    context.registerShutdownHook();
	    int count =context.getBeanDefinitionCount();
	    System.out.println("Bean的个数："+count);
	    String [] names=context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name + "--->");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());
		}
	    
	}
	@Test
	public void test01() {
		ExampleBeanservice bean=context.getBean("exampleBeanservice",ExampleBeanservice.class);
		bean.sayHello();
		ExampleBean bean1=context.getBean("examplebean",ExampleBean.class);
		bean1.toString();
		AnotherBean bean2=context.getBean("anotherBean", AnotherBean.class);
		bean2.show();
		
	}
	
	

}
