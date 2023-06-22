package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	
	//sending data through ModelAndView
	//here we will set page name by addAttribute method
	@RequestMapping("/help")
	public ModelAndView help()
	//Modal is a predefine object
	{	
		ModelAndView model = new ModelAndView();
		model.addObject("name", "Raj");
		model.addObject("Age", 67);
		model.setViewName("help");
		System.out.println("In a help page controller");
		return model;
	}
	
	@RequestMapping("/jstl")
	public String JSP_Expression(Model model) {
		model.addAttribute("name", "Akshay");
		model.addAttribute("age", 54);
		return "JSP_Expression";
	}
	
	@RequestMapping(path="/search")
	public String search() {
		return "search";
	}
	
	@RequestMapping(path="/searchSubmit", method = RequestMethod.POST)
	public String submit(HttpServletRequest req,Model model) {
		String name = req.getParameter("name");
		System.out.println(name);
		model.addAttribute("name", name);
		return "searchSubmit";
	}
	
}
