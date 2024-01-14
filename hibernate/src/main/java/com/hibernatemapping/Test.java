package com.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Person p = new Person(000, "Shruti", "Pune", "8673927463");
		
		session.save(p);
		
		t.commit();
		session.close();
	}

}
