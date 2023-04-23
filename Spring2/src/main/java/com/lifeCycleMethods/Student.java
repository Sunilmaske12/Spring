package com.lifeCycleMethods;

public class Student {
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
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("in a parameterised constructor");
	}
	public Student() {
		super();
		System.out.println("in a default constructor");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	 void init() {
		 System.out.println("in a init method");
	 }
	 
	 void destroy() {
		 System.out.println("in a destroy method");
	 }

}
