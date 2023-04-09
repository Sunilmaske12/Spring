package com.spring.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifecycleApp {
	
	public static void main(String[] arg) {
		//create container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanScopeLifecycleContext.xml");
		//retrieve
		Coach myCoach=context.getBean("myCoach1", Coach.class);
		Coach alphaCoach=context.getBean("myCoach1", Coach.class);
		boolean result=(myCoach==alphaCoach);
		System.out.println("result : "+result);
		System.out.println("my coach :"+myCoach);
		System.out.println("alpha coach :"+alphaCoach);
		System.out.println("\n================\n");
		
		Coach myCoach2=context.getBean("myCoach2", Coach.class);
		Coach alphaCoach2=context.getBean("myCoach2", Coach.class);
		boolean result2=(myCoach2==alphaCoach2);
		System.out.println("result2 : "+result2);
		System.out.println("my coach :"+myCoach2);
		System.out.println("alpha coach :"+alphaCoach2);
		context.close();
	}
}
