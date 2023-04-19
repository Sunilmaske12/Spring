package com.springCore.ConstructorInjection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	int id;
	String name;
	int marks;
	List<String> subject;
	Map<String, String> relative;
	Set<String> friends;
	public Student(int id, String name, int marks,List<String> subject,Map<String, String> relative, Set<String> friends ) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.subject=subject;
		this.relative=relative;
		this.friends=friends;
	}
	
	public void display() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("marks "+marks); 
		Iterator<String> it=subject.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
