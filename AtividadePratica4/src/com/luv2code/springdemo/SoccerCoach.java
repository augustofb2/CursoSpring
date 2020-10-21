package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 50 corners";
	}

}
