package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student student = new Student();
		student.setId(102);
		student.setName("Abhay");
		student.setCity("Pune");
		student.setCerti(new Certificate("Android", "6 months"));
		
		Student student2 = new Student();
		student2.setId(103);
		student2.setName("Jay");
		student2.setCity("Delhi");
		student2.setCerti(new Certificate("Hibernate", "2 months"));
		
		Transaction t = session.beginTransaction();
		
		session.save(student);
		session.save(student2);
		
		t.commit();
		
		session.close();
		factory.close();
	}

}
