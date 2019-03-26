package com.spring.bean;

public class ExampleBean {
	private AnotherBean beanOne;

	private YetAnotherBean beanTwo;
	
	public ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int i) {
		super();
		this.beanOne = beanOne;
		this.beanTwo = beanTwo;
		this.i = i;
	}



	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}



	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}



	private int i;



	public AnotherBean getBeanOne() {
		return beanOne;
	}



	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public ExampleBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ExampleBean(AnotherBean beanOne, int i) {
		super();
		this.beanOne = beanOne;
		this.i = i;
	}



	public void sayHello() {
		System.out.println("bbbb");
	}

}
