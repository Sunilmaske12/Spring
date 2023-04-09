package com.spring.dependencyInjection.qualifier.field;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	String str[]= {
		"My name is sunil"	, "my friend is aman", "my friend is vishal", "my friend is shivam", "my friend is ashok", "my friend is payal"
	};
	
	Random rd=new Random();
	int randomSize=rd.nextInt(str.length);
	
	@Override
	public String getDailyFortune() {
		return str[randomSize];
	}

}
