package com.mvc.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mvc.springmvc.dao.UserDao;
import com.mvc.springmvc.model.User;

//component type
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public Integer createUser(User user) {
		return this.userDao.saveUser(user);
	}
	
}
