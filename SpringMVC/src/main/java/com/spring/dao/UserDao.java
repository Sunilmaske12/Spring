package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public int saveUser(User user) {
		int result = (int)this.hibernateTemplate.save(user);
		return result;
	}
}
