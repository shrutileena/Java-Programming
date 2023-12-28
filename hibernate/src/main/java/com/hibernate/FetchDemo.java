package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get, load
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		// get student - 101
		Student student = session.get(Student.class, 101);
		System.out.println(student);
		
		// id - 102 doesn't exists
		Student student2 = session.get(Student.class, 102);
		System.out.println(student2);
		
		// load - 101
		Student stu = session.load(Student.class, 101);
		System.out.println(stu);
		
//		Student stu2 = session.load(Student.class, 102);
//		System.out.println(stu2);
		
//		Address ad = session.get(Address.class, 1);
//		System.out.println(ad);
		
		factory.close();
	}

}
