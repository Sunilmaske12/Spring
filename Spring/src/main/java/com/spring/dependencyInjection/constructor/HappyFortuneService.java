package com.spring.dependencyInjection.constructor;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "In a happy Fortune";
	}

}
