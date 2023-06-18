package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormData {
	@RequestMapping("/reg")
	public String form() {
		return "Registration";
	}
	
	//by traditional method
	@RequestMapping("/registration")
	public String getData(Model model, HttpServletRequest request) {
		String name = request.getParameter("Name");
		int age = Integer.parseInt(request.getParameter("Age"));
		String email = request.getParameter("Email");
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("email", email);
		return "RegistrationDetails";
	}
	
	//by new method
	@RequestMapping("/newRegistration")
	public String getDetail(@RequestParam("Name") String name, @RequestParam("Age") int age, @RequestParam("Email") String email,Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("email", email);
		return "RegistrationDetails";
	}

}
