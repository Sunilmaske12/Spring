package com.Spring.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("confiig.xml");
        Payment pay = (Payment) context.getBean("payment");
        pay.makePayment();
        pay.customer(20);
        ((AbstractApplicationContext) context).close();
    }
}
