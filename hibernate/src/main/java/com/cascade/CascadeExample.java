package com.cascade;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Question;
import com.onetomany.Answer;

public class CascadeExample {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
		Transaction t = session.beginTransaction();
		
		Answer a1 = new Answer(3763, "first ans");
		Answer a2 = new Answer(3764, "second ans");
		Answer a3 = new Answer(3765, "third ans");
		
		Question q = new Question(5610, "What is Cascading", Arrays.asList(a1,a2,a3));
		
		a1.setQuestion(q);
		a2.setQuestion(q);
		a3.setQuestion(q);
		
		session.save(q);
		
		t.commit();
		
		session.close();
	}
	
}
