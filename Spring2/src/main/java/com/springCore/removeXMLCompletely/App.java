package com.springCore.removeXMLCompletely;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee emp1=context.getBean("employee", Employee.class);
		Employee emp2=context.getBean("getEmp", Employee.class);
		System.out.println(emp1);
		emp1.m1();
		System.out.println(emp2);
		((AbstractApplicationContext) context).close();
	
	}

}
