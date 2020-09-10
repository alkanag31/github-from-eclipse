package com.wipro.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("dataService")
	private RandomService random;
	
	/*DEFAULT CONSTRUCTOR
	public TennisCoach() {
		System.out.println("inside constructor");
	}
	*/
	
	/*SETTER METHOD
	@Autowired
	public void setRandom(RandomService random) {
		this.random = random;
	}*/
	
	/*CONSTRUCTOR INJECTION
	  @Autowired
	 
	public TennisCoach(RandomService random) {
		this.random = random;
	}*/
	
	/*METHOD INJECTION
	@Autowired
	public void RandomMethod(RandomService random) {
		System.out.println("inside method");
		this.random = random;
		
	}*/



	@Override
	public void getDailyWorkout() {
		System.out.println("Practice tennis 30 mins daily");
	}



	@Override
	public void getDailyRandomService() {
		random.getRandomservice();
		
	}
	
	 /*@PostConstruct
	    public void turnOn(){
	        System.out.println("Load operating system");
	    }

	    @PreDestroy
	    public void turnOff(){
	        System.out.println("Close all programs");
	    }*/
	
	

}
