package com.springcore.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student s1 =  c.getBean("getStudent", Student.class);
//		Student s1 =  c.getBean("student", Student.class);
		Student s1 =  c.getBean("temp", Student.class);
		s1.study();
		
	}

}
