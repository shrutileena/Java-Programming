package com.hql.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PaginationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Query<Object> query = session.createQuery("from Student");
		
		// pagination implementation - hibernate
		query.setFirstResult(0);  // starting row number in page
		query.setMaxResults(5);  // number of rows required in page
		
		// query.setFirstResult(10);
		// query.setMaxResults(5);
		
		List<Object> list = query.getResultList();
		
		for(Object l: list) {
			System.out.println(l);
		}
		
		session.close();
	}

}
