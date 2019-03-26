package com.spring;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.ExampleBean;
import com.spring.bean.OneBean;
import com.spring.service.ExampleBeanService;
public class EnterTest{

	private AbstractApplicationContext context;
	public EnterTest() {
		//容器初始化
		
		context =new FileSystemXmlApplicationContext("classpath:/META-INF/application-context.xml");
		/*context =new ClassPathXmlApplicationContext("META-INF/application-context.xml");*/
		context.registerShutdownHook();
	}


	@Test
	public void testExampleBeanService() {
		//取得实例
		ExampleBean exbeanservice =context.getBean(ExampleBean.class);
		//使用实例
		exbeanservice.sayHello();	
	}
	
	@Test
	public void testOneBean() {
		OneBean oneBean = context.getBean(OneBean.class);
		oneBean.sayhello();
	}

}
