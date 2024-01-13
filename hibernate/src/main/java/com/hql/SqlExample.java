package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class SqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		String q = "select * from student";
		
		NativeQuery<Object[]> nq = session.createSQLQuery(q);
		
		List<Object[]> students = nq.list();
		
		for(Object[] s: students) {
			System.out.println(Arrays.toString(s));
			System.out.println(s[3]);
		}
		
		session.close();
	}

}
