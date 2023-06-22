package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableAnnotationController {
	
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") String id) {
		System.out.println(id);
		return"";
	}
	
}
