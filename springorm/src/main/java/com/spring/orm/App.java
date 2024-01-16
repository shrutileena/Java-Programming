package com.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	
	public static int askForStudentId(BufferedReader br) throws NumberFormatException, IOException{
		System.out.println("Enter Student id: ");
		int studentId = Integer.parseInt(br.readLine());
		return studentId;
	}
	
	public static Student askForStudent(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter Student details: ");
		System.out.println("id: ");
		int studentId = Integer.parseInt(br.readLine());
		System.out.println("name: ");
		String name = br.readLine();
		System.out.println("city: ");
		String city = br.readLine();
		
		Student s = new Student(studentId, name, city);
		return s;
	}
	
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");

		StudentDao sd = c.getBean("studentDao", StudentDao.class);

		/*
		 * Student s = new Student(001, "Abhay", "Pune");
		 * 
		 * // int r = sd.insert(s);
		 * 
		 * Student s2 = sd.getStudent(0);
		 * 
		 * // System.out.println(r); System.out.println(s2);
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Press 1 for adding new student");
			System.out.println("Press 2 for displaying all students");
			System.out.println("Press 3 for getting details of single student");
			System.out.println("Press 4 for deleting a student");
			System.out.println("Press 5 for updating a student");
			System.out.println("Press 6 for exit");
			System.out.println("Enter: ");

			try {

				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					sd.insert(askForStudent(br));
					System.out.println("student is added");
					break;
				case 2:
					List<Student> students = sd.getStudents();
					for(Student s: students) {
						System.out.println("Student ID: " + s.getId());
						System.out.println("Student Name: " + s.getName());
						System.out.println("Student City: " + s.getCity());
					}
					break;
				case 3:
					Student s = sd.getStudent(askForStudentId(br));
					System.out.println("Student ID: " + s.getId());
					System.out.println("Student Name: " + s.getName());
					System.out.println("Student City: " + s.getCity());
					break;
				case 4:
					sd.deleteStudent(askForStudentId(br));
					System.out.println("student is deleted");
					break;
				case 5:
					sd.updateStudent(askForStudent(br));
					System.out.println("student is updated");
					break;
				case 6:
					System.out.println("Exit? Y/N:  ");
					String i = br.readLine();
					if(i.equals("Y")) System.exit(0);
					else continue;
				}

			} catch (Exception e) {
				System.out.println("Invalid Input...");
				System.out.println("Try another option.");
				System.out.println(e.getMessage());
			}
		}

	}

}
