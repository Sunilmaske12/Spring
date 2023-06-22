package com.Spring.springAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	 
	//                 * return any return type             Payment(..) for parameteries method
	@Before("execution(* com.Spring.springAOP.Payment.makePayment())")
	public void beforePayment() {
		System.out.println("Payment Started.......");
	}
	
	@After("execution(* com.Spring.springAOP.Payment.makePayment())")
	public void afterPayment() {
		System.out.println("Payment Done.......");
	}
	
	
	//parameterised
	@Before("execution(* com.Spring.springAOP.Payment.customer(..))")
	public void beforeCustot() {
		System.out.println("Custo 0.......");
	}
	
	@After("execution(* com.Spring.springAOP.Payment.customer(..))")
	public void afterCusto() {
		System.out.println("Custo Last.......");
	}
}
