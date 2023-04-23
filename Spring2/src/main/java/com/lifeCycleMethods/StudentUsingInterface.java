package com.lifeCycleMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentUsingInterface implements InitializingBean, DisposableBean{
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
	public StudentUsingInterface(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("in a parameterised constructor");
	}
	public StudentUsingInterface() {
		super();
		System.out.println("in a default constructor");
	}
	@Override
	public String toString() {
		return "StudentUsingInterface [id=" + id + ", name=" + name + "]";
	}
	
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("In a interface init method");
		
	}
	public void destroy() throws Exception {
		System.out.println("In a interface destroy method");
	}

}
