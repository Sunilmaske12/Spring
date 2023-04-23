package com.springCore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Sunil!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/beanScope/student.xml");
        StudentXML student1=(StudentXML)context.getBean("student1");
        StudentXML student2=(StudentXML)context.getBean("student1");
        StudentXML student3=(StudentXML)context.getBean("student1");
        
        StudentXML student4=(StudentXML)context.getBean("student2");
        StudentXML student5=(StudentXML)context.getBean("student2");
        StudentXML student6=(StudentXML)context.getBean("student2");
        
        System.out.println("Singleton :");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println("\n=======================================");
        System.out.println("Prototype :");
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());
        System.out.println(student6.hashCode());
        
        //stereotype annotation
        StudentAnnotation student7=(StudentAnnotation)context.getBean("studentAnnotation");
        StudentAnnotation student8=(StudentAnnotation)context.getBean("studentAnnotation");
        StudentAnnotation student9=(StudentAnnotation)context.getBean("studentAnnotation");
        System.out.println("\nStereotype singleton :");
        System.out.println(student7.hashCode());
        System.out.println(student8.hashCode());
        System.out.println(student9.hashCode());
        
      //prototype annotation
        StudentAnnotationPrototype student10=(StudentAnnotationPrototype)context.getBean("studentAnnotationPrototype");
        StudentAnnotationPrototype student11=(StudentAnnotationPrototype)context.getBean("studentAnnotationPrototype");
        StudentAnnotationPrototype student12=(StudentAnnotationPrototype)context.getBean("studentAnnotationPrototype");
        System.out.println("\nStereotype prototype :");
        System.out.println(student10.hashCode());
        System.out.println(student11.hashCode());
        System.out.println(student12.hashCode());
        ((AbstractApplicationContext) context).close();
    }
}
