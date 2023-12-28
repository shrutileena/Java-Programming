package com.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();


		Answer a1 = new Answer(11, "Programming Language");
		Question q1 = new Question(1, "What is Java", a1);
		a1.setQuestion(q1);
		
		Answer a2 = new Answer(12, "ORM Framework");
		Question q2 = new Question(2, "What is Hibernate", a2);
		a2.setQuestion(q2);
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		
		t.commit();
		
		Question question = (Question) session.get(Question.class, 2);
		System.out.println(question.getQuestion());
		System.out.println(question.getAnswer().getAnswer());
		
		session.close();
		factory.close();
	}

}
