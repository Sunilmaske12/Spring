package com.springCore.standalonCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/standalonCollection/student.xml");
		Student student=(Student) context.getBean("student");
		System.out.println(student.getFriends());
		((AbstractApplicationContext) context).close();
	}
}
