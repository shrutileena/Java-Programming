package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Answer ans1 = new Answer(1, "Platform independent");
		Answer ans2 = new Answer(2, "Secure");
		List<Answer> answers1 = new ArrayList<Answer>();
		answers1.add(ans1);
		answers1.add(ans2);
		Question ques1 = new Question(1, "What are the features of Java", answers1);
		
		ans1.setQuestion(ques1);
		ans2.setQuestion(ques1);
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(ques1);
		session.save(ans1);
		session.save(ans2);
		
		t.commit();
		
		Question firstQ = session.get(Question.class, 1);
		System.out.println(firstQ.getQuestion());
		List<Answer> answers = firstQ.getAnswers();
		for(Answer ans : answers) {
			System.out.println(ans.getAnswer());
		}
		
		session.close();
		factory.close();
	}

}
