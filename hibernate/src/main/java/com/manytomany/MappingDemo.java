package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Employee e1 = new Employee(34, "Ram", null);
		Employee e2 = new Employee(35, "Lakshman", null);
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		
		Project p1 = new Project(12121, "Library Management System", null);
		Project p2 = new Project(14214, "chatbot", emps);
		
		List<Project> projects = new ArrayList<Project>();
		projects.add(p1);
		projects.add(p2);
		
		e1.setProjects(projects);
		
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		t.commit();
		
		s.close();
		f.close();
	}

}
