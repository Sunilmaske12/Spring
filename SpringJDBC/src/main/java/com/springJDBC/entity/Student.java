package com.springJDBC.entity;

public class Student {
	String name;
	String village;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", village=" + village + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String village, int age) {
		super();
		this.name = name;
		this.village = village;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

