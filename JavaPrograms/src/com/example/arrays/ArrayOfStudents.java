package com.example.arrays;

import java.util.Arrays;

class Student {

	String name;
	int id;

}

public class ArrayOfStudents {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "shruti";
		s1.id = 101;

		Student s2 = new Student();
		s2.name = "abhay";
		s2.id = 102;

		Student[] students = new Student[2];

		students[0] = s1;
		students[1] = s2;

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].id + " : " + students[i].name);
		}
		
		for(Student s: students) {
			System.out.println(s.id + " : " + s.name);
		}
	}

}
