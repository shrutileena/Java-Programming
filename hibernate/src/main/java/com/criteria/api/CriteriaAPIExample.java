package com.criteria.api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Student;

public class CriteriaAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c = session.createCriteria(Student.class);
		
//		List<Student> l = c.list();
//		
//		for(Student s : l) {
//			System.out.println(s);
//		}
		
		// restriction
		c.add(Restrictions.eq("certi.course", "JSP")); // eq - equal to
		c.add(Restrictions.gt("id", 24));  // gt - greater than
		List<Student> l = c.list();
		
		for(Student s : l) {
			System.out.println(s);
		}
		
		session.close();
		factory.close();
		
	}

}
