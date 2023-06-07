package com.springJDBC.dao;

import java.util.List;

import com.springJDBC.entity.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int delete(String name);

	public Student getStudentByName(String name);

	public List<Student> getAllStudent();
}
