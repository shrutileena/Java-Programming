package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlExampleJoin {

	public static void main(String[] args) {

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		// join
		Query<Object[]> query = session.createQuery("select q.questionId, q.question, a.answer from questionOneToMany as q INNER JOIN q.answers as a");

		List<Object[]> list = query.getResultList();
		
		for(Object[] arr: list) {
			System.out.println(Arrays.toString(arr));
		}
		
		session.close();
	}
}
