package baseballProblem;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// Dependency for Coach(Define dependency interface and class) , Dependency injection
		//Practice Activity #2 -> generating random fortune
		String[] fortunes = new String[3];
		fortunes[0] = "Today is your lucky day";
		fortunes[1] = "Work hard on your goals today";
		fortunes[2] = "Would meet someone new";
		
		//generating random number
		Random rand = new Random();
		int RandomFortune = rand.nextInt(3);
		
		//returning random fortune
		return fortunes[RandomFortune];
	}

}
