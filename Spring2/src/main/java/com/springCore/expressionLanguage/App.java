package com.springCore.expressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/expressionLanguage/configSpEL.xml");
		SpEL spel=context.getBean("expression123", SpEL.class);
		System.out.println(spel);
		((AbstractApplicationContext) context).close();
	}

}
