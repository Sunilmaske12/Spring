package com.springCore.beanScope;

import org.springframework.stereotype.Component;

@Component
public class StudentAnnotation {
    int id;
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
