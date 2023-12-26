package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.annotations")
public class JavaConfig {
	
//	@Bean
	@Bean(name = {"student", "temp"})
	public Student getStudent() {
		
		//creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
}
