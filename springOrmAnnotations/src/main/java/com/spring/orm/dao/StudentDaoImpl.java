package com.spring.orm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	@Transactional // To save data in DB
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
