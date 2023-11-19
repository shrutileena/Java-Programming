package com.example.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.todolist")
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

}
