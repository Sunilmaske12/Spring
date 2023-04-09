package com.spring.dependencyInjection.qualifier.field;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "In a good Fortune";
	}

}
