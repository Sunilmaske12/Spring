package com.Spring.springAOP;

public class Payment {
	
	public void makePayment() {
		System.out.println("Payment debited....");
		
		System.out.println("Payment creadited....");
	}
	
	public void customer(int id) {
		System.out.println("Custo1...."+ id);
		
		System.out.println("Custo2....");
	}

}
