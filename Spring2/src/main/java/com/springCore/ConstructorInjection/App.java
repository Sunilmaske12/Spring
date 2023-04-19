package com.springCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/ConstructorInjection/student.xml");
		Student student=(Student) context.getBean("student");
		student.display();
		((AbstractApplicationContext) context).close();
	}
}
