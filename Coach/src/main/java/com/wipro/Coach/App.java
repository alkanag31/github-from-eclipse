package com.wipro.Coach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        TennisCoach tcoach = context.getBean(TennisCoach.class);
        //TennisCoach coach = context.getBean(TennisCoach.class);
        //boolean result = (tcoach==coach);
        //System.out.println("Address same: " + result);
        tcoach.getDailyWorkout();
        tcoach.getDailyRandomService();
    }
}
