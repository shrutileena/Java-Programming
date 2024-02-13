package com.example.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	transient private String email;
	private int age;
	private String address;

	public Student(String name, String email, int age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void displayName() {
		System.out.println("My name is " + this.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}

}
