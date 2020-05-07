package baseballProblem;

public class TrackCoach implements Coach {

	private HappyFortuneService fortuneService;
	//Constructor for Dependency injection(Create a constructor in your class for injection)
	public TrackCoach(HappyFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard 5KM";
	}
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortuneService();
	}
	
	
    // Used for Literal injection in Cricket class
	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//adding init and destroy method 
	public static void doStartupStuff()
	{
		System.out.println("In Startup method");
	}
	public static void doDeleteStuff()
	{
		System.out.println("In Delete  method");
	}

}
