package com.spring.dependencyInjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	TennisCoach(){
		System.out.println("in a defalt constructor");	
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService){
		this.fortuneService=fortuneService;
		System.out.println("in a setter method");
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("in a tenniscoach");
	return fortuneService.getDailyFortune();
	}

}
