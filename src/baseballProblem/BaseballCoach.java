package baseballProblem;

public class BaseballCoach implements Coach {

	//Constructor for Dependency injection(Create a constructor in your class for injection)
	private HappyFortuneService fortuneService;
	//Practicing literal Injection from property file
	private String emailAddress;
	
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
 
	@Override
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	private String team;
	
    public BaseballCoach(HappyFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Spend 10 minutes in batting practice";
	}
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortuneService();
	}
	
    //Used for literal injection in Cricket Class
}
