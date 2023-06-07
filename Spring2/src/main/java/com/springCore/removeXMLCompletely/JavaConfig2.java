package com.springCore.removeXMLCompletely;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//another way to configure
@Configuration
public class JavaConfig2 {
	 
	@Bean
	public Employee getEmp() {
		System.out.println("Inside employee be getEmp()");
		Employee emp=new Employee();
		return emp;
	}
}
