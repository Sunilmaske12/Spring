package com.springCore.collection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/collection/setter/student.xml");
		Student student=(Student) context.getBean("student");
		System.out.println("name "+student.getName());
		System.out.println("mobile no " +student.getMob_nos());
		System.out.println("marks "+student.getMarks());
				System.out.println("subject "+student.getSubject());
				System.out.println("property "+student.getDetail());		
		((AbstractApplicationContext) context).close();
	}
}
