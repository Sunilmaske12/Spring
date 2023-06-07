package com.springCore.removeXMLCompletely;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;
	
	void m1() {
		System.out.println("Inside Employee");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
