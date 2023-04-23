package com.springCore.autowiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/autowiringAnnotation/config.xml");
		Employee emp1=context.getBean("emp1", Employee.class);
		//Employee emp2=context.getBean("emp2", Employee.class);
		//Employee emp3=context.getBean("emp3", Employee.class);
		System.out.println(emp1);
		//System.out.println("By type "+emp2);
		//System.out.println("By const "+emp3);
		((AbstractApplicationContext) context).close();
	
	}

}
