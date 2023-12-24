package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		System.out.println(c.getBean("p1"));
		
		Addition add = (Addition) c.getBean("a1");
		add.doSum();
	}

}
