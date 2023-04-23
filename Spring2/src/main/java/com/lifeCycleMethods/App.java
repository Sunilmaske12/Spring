package com.lifeCycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("in a main class");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lifeCycleMethods/config.xml");
		Student student=(Student)context.getBean("student");
		StudentUsingInterface studentUsingInterface=(StudentUsingInterface)context.getBean("studentInterface");
		StudentUsingAnnotation studentUsingAnnotaion =(StudentUsingAnnotation)context.getBean("studentAnnotaion");
		System.out.println(student);
		System.out.println("\n*********************************************\n");
		System.out.println(studentUsingInterface);
		System.out.println("\n*********************************************\n");
		System.out.println(studentUsingAnnotaion);
		((AbstractApplicationContext) context).close();

	}

}
