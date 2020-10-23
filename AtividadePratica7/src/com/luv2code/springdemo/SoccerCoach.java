package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 50 corners";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
