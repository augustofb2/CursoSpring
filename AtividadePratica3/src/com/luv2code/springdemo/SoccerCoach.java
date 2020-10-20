package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	private String emailAddress;
	private String team;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SoccerCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("SoccerCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("SoccerCoach: inside setter method - setTeam");
		this.team = team;
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
