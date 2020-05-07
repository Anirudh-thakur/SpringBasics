package baseballProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		//Load spring configuration file(Create spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationInterface.xml");
		
		
		
		//Retrive beans from spring container
		//Coach theCoach = context.getBean("MyCoach",Coach.class);
		System.out.println("Choose the Coach you need to follow:");
		System.out.println("1. Baseball coach");
		System.out.println("2. Track coach");
		System.out.println("3. Cricket coach");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice =Integer.parseInt(br.readLine());
		Coach theCoach;
		if(choice == 1)
		{
			 theCoach = context.getBean("BaseballCoach",Coach.class);
		}
		else if(choice == 2)
		{
			 theCoach = context.getBean("TrackCoach",Coach.class);
		}
		else
		{
			 theCoach = context.getBean("CricketCoach",Coach.class);
		}
		
		//call method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call fortune service dependency
		System.out.println(theCoach.getDailyFortune());
		
		// checking literal injection Data
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close application context
		context.close();
	}

}
