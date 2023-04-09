package com.spring.dependencyInjection.qualifier.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//default name of TennisCoach class is tennisCoach
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	TennisCoach(@Qualifier("randomFortuneService")  FortuneService fortuneService){
	this.fortuneService=fortuneService;	
	}
	
	@Override
	public String getDailyFortune() {
		System.out.println("in a tenniscoach");
	return fortuneService.getDailyFortune();
	}

}
