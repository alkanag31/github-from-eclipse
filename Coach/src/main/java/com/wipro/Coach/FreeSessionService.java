package com.wipro.Coach;

import org.springframework.stereotype.Component;

@Component
public class FreeSessionService implements RandomService {

	@Override
	public void getRandomservice() {
		System.out.println("Free Session Service");
	}

}
