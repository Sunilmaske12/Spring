package com.springCore.autowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	Address address;
	 
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("inside setter");
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Employee(Address sunil) {
		super();
		this.address = sunil;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
