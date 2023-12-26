package com.springcore.annotations;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
	
	private Samosa samosa;

	public Student(Samosa samosa) {
		// TODO Auto-generated constructor stub
		this.samosa = samosa;
	}

	public void study() {
		samosa.display();
		System.out.println("Student is studying");
	}
}
