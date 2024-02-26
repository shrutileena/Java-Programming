package com.example.encapsulation;

class Human {
	
	// make instance variables private always for protection 
	// no one from outside should access them directly
	private String name = "shruti";
	private int age = 24;
	
	// to access them we can have methods created like getters, setters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}

public class Main {

	public static void main(String[] args) {
	
		Human human = new Human();
//		human.name;	// will not work as it is private
		
		System.out.println(human.getName());
		System.out.println(human.getAge());
		
		// encapsulation - binding data and methods like we did in Human class
		// also we protect our data using access modifiers
		// only way to access data is through setters and getters
	}

}
