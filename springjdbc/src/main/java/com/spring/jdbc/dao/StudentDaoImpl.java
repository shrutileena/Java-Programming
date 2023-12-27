package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO student(id, name, city) values (?, ?, ?)";
		int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return res;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name=?, city=? where id=?";
		int res = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return res;
	}

	@Override
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query, studentId);
		return res;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String query = "select * from student where id=?";
		Student s = this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), studentId);
		return s;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	

}
