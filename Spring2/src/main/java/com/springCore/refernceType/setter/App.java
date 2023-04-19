package com.springCore.refernceType.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/refernceType/setter/student.xml");
		Student student=(Student) context.getBean("student");
			System.out.println(student.getName());
			System.out.println(student.getRoll_no());
			System.out.println(student.getAddress());
			System.out.println(student);
		((AbstractApplicationContext) context).close();
	}
}
