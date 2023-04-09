package com.spring.dependencyInjection.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dependancyInjectionContextSetter.xml");
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		//default name of TennisCoach class is tennisCoach
		
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
