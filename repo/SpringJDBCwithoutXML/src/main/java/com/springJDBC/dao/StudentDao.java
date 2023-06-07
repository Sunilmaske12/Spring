package com.springJDBC.dao;

import java.util.List;

import com.springJDBC.entity.Student;

public interface StudentDao {
	
	public int delete(String name);
	
	public int insert(Student student);
	
	public Student getOneStudent(String name);
	
	public List<Student> getAllStudent();
	
}
