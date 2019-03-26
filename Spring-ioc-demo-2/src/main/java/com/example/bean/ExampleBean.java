package com.example.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="examplebean")
public class ExampleBean {
	@Autowired
	private AnotherBean beanOne;
	@Autowired
	private YetAnotherBean beanTwo;
	private int i;

	public ExampleBean() {
		
	}

	public ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
		super();
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.i = i;
	}
	
	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}
	
	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public AnotherBean getBeanOne() {
		return beanOne;
	}

	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}

	@Override
	public String toString() {
		return "ExampleBean [beanOne=" + beanOne + ", beanTwo=" + beanTwo + ", i=" + i + "]";
	}



}
