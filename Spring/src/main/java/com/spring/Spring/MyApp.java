package com.spring.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp 
{
    public static void main( String[] args )
    {
    	   
        //creation of spring container
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve spring container
        
        Coach theCoach1=context.getBean("myCoach1", Coach.class);
        Coach theCoach2=context.getBean("myCoach2", Coach.class);
        Coach theCoach3=context.getBean("myCoach3", Coach.class);
        
        System.out.println(theCoach1.getDailyWork());
        System.out.println(theCoach2.getDailyWork());
        System.out.println(theCoach3.getDailyWork());
        context.close();
        
    }
}
