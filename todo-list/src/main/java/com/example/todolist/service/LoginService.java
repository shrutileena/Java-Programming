package com.example.todolist.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userId, String password) {
		return userId.equalsIgnoreCase("shruti") && password.equalsIgnoreCase("shruti");
	}

}
