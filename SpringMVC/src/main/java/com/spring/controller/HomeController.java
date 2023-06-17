package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model)
	//Modal is a predefine object
	{
		model.addAttribute("name", "Anil");
		model.addAttribute("age", 45);
		List<String> friends =new ArrayList<String>();
		friends.add("Ajay");
		friends.add("Vijay");
		friends.add("Vishal");
		model.addAttribute("friends", friends);
		System.out.println("In a home controller");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(ModelAndView model)
	//Modal is a predefine object
	{
		model.addObject("name", "Raj");
		System.out.println("In a About page controller");
		return "about";
	}
}
