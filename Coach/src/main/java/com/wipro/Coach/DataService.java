package com.wipro.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataService implements RandomService {

	@Override
	public void getRandomservice() {
		System.out.println("Data Service");

	}

}
