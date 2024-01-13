package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class HqlExampleCrud {

	public static void main(String[] args) {

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();
		
		// delete query
		String q = "delete from Student where city=:x";
		
		Query<Student> query = session.createQuery(q);
		query.setParameter("x", "Pune");
		
		
		
		
		// update query
		String q1 = "update Student set id=:i where name=:n";
		
		Query<Student> query1 = session.createQuery(q1);
		query1.setParameter("i", 112);
		query1.setParameter("n", "Shruti");
		
		
		
		
		//int r = query.executeUpdate();
		int r1 = query1.executeUpdate(); 
		t.commit();
		
		//System.out.println("Deleted rows - " + r);
		System.out.println("Updated rows - " + r1);
		
		session.close();
	}
}
