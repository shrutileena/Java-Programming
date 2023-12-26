package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
//		System.out.println(context.getBean("ob", Student.class));
		System.out.println(context.getBean("student", Student.class));
		
		Student student = context.getBean("student", Student.class);
		System.out.println(student.hashCode());
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2.hashCode());
		
		Teacher teacher = context.getBean("t1", Teacher.class);
		Teacher teacher2 = context.getBean("t1", Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher2.hashCode());
	}
}
