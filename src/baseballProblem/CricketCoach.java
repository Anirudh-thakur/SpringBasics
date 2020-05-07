package baseballProblem;

public class CricketCoach implements Coach {

	//Constructor for Dependency injection(Create a constructor in your class for injection)
	private HappyFortuneService fortuneService;
	
	//Practicing literal Injection 
	private String emailAddress;
	private String team;
	
	//Generating getter setter methods for Literal Injection
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Ball for 30hrs a day";
	}

	public HappyFortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}
	
	

}
