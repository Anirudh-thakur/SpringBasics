package baseballProblem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationInterface.xml");
		
		//Retrive bean from container to show prototype 
		Coach theCoach = context.getBean("MyCoach",Coach.class);
		Coach AlphaCoach = context.getBean("MyCoach",Coach.class);
		
		boolean result = (theCoach == AlphaCoach);
		System.out.println("Pointing to the same object:"+result);
		System.out.println("Memory location of theCoach:"+theCoach);
		System.out.println("Memory location of AlphaCoach:"+AlphaCoach);
		
		context.close();
	}

}
