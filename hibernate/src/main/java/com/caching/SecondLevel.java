package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class SecondLevel {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//first
		Session session = factory.openSession();
		Student s1 = session.get(Student.class, 103);
		System.out.println(s1);
		
		//second
		Session session2 = factory.openSession();
		Student s2 = session2.get(Student.class, 103);
		System.out.println(s2); // query won't run again - second level cache using ehcache
		
		session.close();
		session2.close();
	}
}
