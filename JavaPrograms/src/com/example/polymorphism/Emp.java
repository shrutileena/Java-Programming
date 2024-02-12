package com.example.polymorphism;

public class Emp extends Person {

	// overriding
	public void showDetail() {
		System.out.println("basic details of emp");
	}
	
	public void showDetails(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.showDetail();
		
		Person person = new Person();
		person.showDetail();
		
		Person person2 = new Emp();
		person2.showDetail();
		
//		Emp emp2 = (Emp) new Person();	// incorrect
//		Emp emp3 = (Emp) new Person();
//		emp3.showDetails("shruti");
	}
}
