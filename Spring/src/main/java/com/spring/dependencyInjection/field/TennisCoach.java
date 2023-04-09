package com.spring.dependencyInjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//default name of TennisCoach class is tennisCoach
public class TennisCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyFortune() {
		System.out.println("in a tenniscoach");
	return fortuneService.getDailyFortune();
	}

}
