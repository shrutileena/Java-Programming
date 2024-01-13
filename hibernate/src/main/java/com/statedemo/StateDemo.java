package com.statedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Certificate;
import com.hibernate.Student;

public class StateDemo {

	public static void main(String[] args) {
		
		// Hibernate object states 
		// Transient 
		// Persistent
		// detatched
		// removed
		System.out.println("example");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//transient state
		Student student = new Student();
		student.setId(106);
		student.setName("Kavya");
		student.setCity("Jamshedpur");
		student.setCerti(new Certificate("Php", "2 months"));
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		// persistent state - session, database
		session.save(student);
		
		/* student.setName("Abhay"); */
		
		t.commit();
		
		// detached state
		session.close();
		
		student.setName("Sachin");
		
		// no commit here
		
		factory.close();
	}
}
