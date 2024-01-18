package com.mvc.springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mvc.springmvc.model.User;

//component type
@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Integer saveUser(User user) {
		Integer id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}
	
}
