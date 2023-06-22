package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionHandling {
	@RequestMapping("/myuser/{userId}")
	public String getUserDetail(@PathVariable("userId") String id) {
		System.out.println(id);
		Integer.parseInt(id);
		return"fileHandling";
	}
	
	@SuppressWarnings("null")
	@RequestMapping("/yourUser/{userId}")
	public String getUser(@PathVariable("userId") String id) {
		System.out.println(id);
		String str = null;
		System.out.println(str.length());
		Integer.parseInt(id);
		return"fileHandling";
	}
	
	//handling excption in this controller only
	@ResponseStatus(value = HttpStatus.BAD_REQUEST) //this is for sending status code like 400
	@ExceptionHandler(value =NullPointerException.class)
	public String expNullPointer(Model model) {
		model.addAttribute("msg", "Null pointer exception");
		return "null_file";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value =NumberFormatException.class)
	public String expNumberFormate(Model model) {
		model.addAttribute("msg", "Number formate exception");
		
		return "null_file";
	}
	
	//genral exception: exeption which we dont know, Exception.class is a parent class of all exception
	@ExceptionHandler(value =Exception.class)
	public String genral(Model model) {
		model.addAttribute("msg", "exception happen");
		
		return "null_file";
	}
	
	
}
