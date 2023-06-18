package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.User;
import com.spring.service.UserService;

@Component
@Controller
public class SpringMVC_SpringORM {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/regDB")
	public String registerUser() {
		return "registrationDB";
	}
	
	@RequestMapping(path="/registrationDB", method=RequestMethod.POST)
	public String registerUserDB(@ModelAttribute("user") User user, Model model) {
		this.userService.createUser(user);
		//here given annotation automatically set the values, if we use jstl then we dont need to add in model also, it can directly fetch as user.name ...
		model.addAttribute("name",user.getName());
		model.addAttribute("email",user.getEmail());
		model.addAttribute("age",user.getAge());
		return "registrationDBDetail";
	}
}
