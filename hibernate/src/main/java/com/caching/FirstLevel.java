package com.caching;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class FirstLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
		// by default enabled
		Student s = session.get(Student.class, 103);
		
		System.out.println(s);
		
		Student s2 = session.get(Student.class, 103);
		System.out.println(s2); // doesn't fire query again as it is in cache (by default - first level)
		
		System.out.println(session.contains(s2));
		
		session.close();
		
		// after session close query will run. nothing in cache
	}

}
