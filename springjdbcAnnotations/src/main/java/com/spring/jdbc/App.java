package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new AnnotationConfigApplicationContext(JdbcConfig.class);
		JdbcTemplate template = c.getBean("jdbcTemplate", JdbcTemplate.class);
		
		// insert query
//		String query = "INSERT INTO student(id, name, city) values (?, ?, ?)";
//		
//		int res = template.update(query, 333, "Ram", "Delhi");
//		
//		System.out.println("number of records inserted: " + res);
		
		StudentDao sd = c.getBean("studentDao", StudentDao.class);
		
		//insert
		Student student = new Student();
		student.setId(666);
		student.setName("John");
		student.setCity("Delhi");
		
		System.out.println(sd.insert(student));
		
		//update
		Student student1 = new Student();
		student1.setId(456);
		student1.setName("Abhay Malhotra");
		student1.setCity("Pune");
//		System.out.println(sd.change(student1));
		
		//delete
		System.out.println(sd.delete(666));
		
		// student - return one object
		System.out.println(sd.getStudent(222));
		
		// return all objects / rows
		System.out.println(sd.getAllStudents());
		
	}

}
