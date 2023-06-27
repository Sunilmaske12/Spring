package com.springAPI.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springAPI.entity.Student;

import exceptionHandling.StudentNotFoundException;

@RestController
@RequestMapping("/rest")
public class MyController {

	List<Student> stud = new ArrayList<Student>();

	@RequestMapping("/rest")
	public String rest1() {
		return "Hello Rest";
	}
	
	@PostConstruct
	public void loadData() {
		Student s1 = new Student("Sunil", "Maske");
		Student s2 = new Student("ANil", "Maske");
		Student s3 = new Student("Payal", "Salame");
		Student s4 = new Student("Aman", "Bansode");
		stud.add(s1); stud.add(s2); stud.add(s3); stud.add(s4);
	
	}
	
	@RequestMapping("/stu")
	public List<Student> getStudents() {
		return stud;
	}
	
	@RequestMapping("/stu/{Index}")
	public Student getOneStudents(@PathVariable int Index) {
		
		if(Index >= stud.size() || Index<0) {
			throw new StudentNotFoundException("Student index not found "+Index);
		}
		return stud.get(Index);
	}
	
	//we are define global exception handler in exceptionHandling package
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleExceptionNotFound(StudentNotFoundException snf){
//		StudentErrorResponse error = new StudentErrorResponse();
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(snf.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//		
//		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
//		
//	}
//	
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(Exception e){
//		StudentErrorResponse error = new StudentErrorResponse();
//		error.setStatus(HttpStatus.BAD_REQUEST.value());
//		error.setMessage(e.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//		
//		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.BAD_REQUEST);
//		
//	}
	
}
