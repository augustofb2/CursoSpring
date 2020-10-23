package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: inside default constructor");
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
