package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}


	@Override
	public Student getStudent(int studentId) {
		
		Student s = (Student) this.hibernateTemplate.get(Student.class, studentId);
		return s;
	}


	@Override
	public List<Student> getStudents() {
		
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}


	@Override
	@Transactional
	public void deleteStudent(int studentId) {
		Student s = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(s);
	}


	@Override
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	
}
