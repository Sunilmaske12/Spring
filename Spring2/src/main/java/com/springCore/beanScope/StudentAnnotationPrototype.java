package com.springCore.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StudentAnnotationPrototype {
    int id;
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
