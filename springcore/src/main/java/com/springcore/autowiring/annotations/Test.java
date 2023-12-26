package com.springcore.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/autowiring/annotations/config.xml");

		Employee e1 = c.getBean("e1", Employee.class);

		System.out.println(e1);
	}

}
