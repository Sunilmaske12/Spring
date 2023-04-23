package com.springCore.beanScope;

public class StudentXML {
    int id;
    String name;
    String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentXML(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public StudentXML() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
   
}
