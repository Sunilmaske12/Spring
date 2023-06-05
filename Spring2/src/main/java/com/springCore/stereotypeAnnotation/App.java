package com.springCore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Sunil!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/stereotypeAnnotation/student.xml");
        Student student1=(Student)context.getBean("student1");
         System.out.println(student1);
         System.out.println(student1.getSubject());
        ((AbstractApplicationContext) context).close();
    }
}
