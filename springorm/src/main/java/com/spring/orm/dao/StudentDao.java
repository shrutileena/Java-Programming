package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	
	// get single object
	public Student getStudent(int studentId);
	
	// get multiple students
	public List<Student> getStudents();
	
	public void deleteStudent(int studentId);
	
	public void updateStudent(Student student);
	
}
