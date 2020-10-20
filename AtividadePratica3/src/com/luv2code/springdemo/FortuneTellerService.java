package com.luv2code.springdemo;

import java.util.Random;

public class FortuneTellerService implements FortuneService {
	
	private String[] fortunes = {
			"The sequence of the conceptions is at the same time a sequence of realisations",
			"No amount of political freedom will satisfy the hungry masses",
			"A lie told often enough becomes the truth"
	};
	
	private Random generator = new Random();

	@Override
	public String getFortune() {
		int index = generator.nextInt(fortunes.length);
		return fortunes[index];
	}

}
