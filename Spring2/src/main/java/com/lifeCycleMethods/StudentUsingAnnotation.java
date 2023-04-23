package com.lifeCycleMethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentUsingAnnotation{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Setting id");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	public StudentUsingAnnotation(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("in a parameterised constructor");
	}
	public StudentUsingAnnotation() {
		super();
		System.out.println("in a default constructor");
	}
	@Override
	public String toString() {
		return "StudentUsingAnnotaion [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("In a Annotaion init method");
		}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("In a Annotaion destroy method");
	}

}
