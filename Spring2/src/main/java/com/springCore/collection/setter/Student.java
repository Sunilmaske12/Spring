package com.springCore.collection.setter;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	String name;
	List<String> subject;
	Map<String, String> marks;
	Set<String> mob_nos;
	Properties detail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Map<String, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}
	public Set<String> getMob_nos() {
		return mob_nos;
	}
	public void setMob_nos(Set<String> mob_nos) {
		this.mob_nos = mob_nos;
	}
	
	public Properties getDetail() {
		return detail;
	}
	public void setDetail(Properties detail) {
		this.detail = detail;
	}
	public Student(String name, List<String> subject, Map<String, String> marks, Set<String> mob_nos, Properties detail) {
		super();
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.mob_nos = mob_nos;
		this.detail = detail;
	}
	public Student() {
		super();
	}
	
	
	

}
