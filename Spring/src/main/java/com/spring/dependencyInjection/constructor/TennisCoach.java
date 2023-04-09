package com.spring.dependencyInjection.constructor;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//default name of TennisCoach class is tennisCoach
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//@Autowired
	//in updated version 4.3+ in costructor injection for single constructor it is not neccesary to give annotation but 
	//readability it is better to write
	TennisCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
		System.out.println("in a parameterised constructor");
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("in a tenniscoach");
	return fortuneService.getDailyFortune();
	}

}
