package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class HqlExample {
	
	public static void main(String[] args) {
			
		// selecting data and printing it
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		// HQL
		String query = "from Student";
		String query1 = "from Student where city='Delhi'";
		String query2 = "from Student where city=:x";
		String query3 = "from Student as s where s.city=:x and s.name=:n";
		
		Query<Student> q = session.createQuery(query);
		
		// Where clause
		Query<Student> q1 = session.createQuery(query1);
		
		// setting parameter from outside
		Query<Student> q2 = session.createQuery(query2);
		q2.setParameter("x", "Pune");
		
		Query<Student> q3 = session.createQuery(query3);
		q3.setParameter("x", "Delhi");
		q3.setParameter("n", "Shruti");
		
		// Single result - (Unique)
//		q.uniqueResult();
		
		// Multiple result - List
		List<Student> students = q.list();
		for(Student s: students) {
			System.out.println(s.getName());
		}
		
		List<Student> students2 = q1.list();
		for(Student st: students2) {
			System.out.println(st.getName());
		}
		
		List<Student> students3 = q2.list();
		for(Student stu: students3) {
			System.out.println(stu.getName());
		}
		
		List<Student> students4 = q3.list();
		students4.stream().map(x-> x.getName()).forEach(System.out::println);
		factory.close();
	}
}
