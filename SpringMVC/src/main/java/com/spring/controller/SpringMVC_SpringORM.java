package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.User;
import com.spring.service.UserService;

@Component
public class SpringMVC_SpringORM {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/regDB")
	public String registerUser() {
		return "registrationDB";
	}
	
	@RequestMapping(name="/registrationDB", method=RequestMethod.POST)
	public String registerUserDB(User user) {
		this.userService.createUser(user);
		return "registrationDBDetail";
	}
}
