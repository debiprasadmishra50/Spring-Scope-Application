package demo;

public class BadmintonCoach implements Coach 
{
	public BadmintonCoach()
	{
		
	}
	//define a private field
	private FortuneService fortuneService;
	
	//define parameter constructor for dependency injection
	public BadmintonCoach(FortuneService thefortuneService)
	{
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Spent 2 Hours on Badminton";
	}

	@Override
	public String getDailyFortune() {

		//Use my fortuneService to get a Fortune
		return "In BadmintonCoach : "+fortuneService.getFortune();
	}

}
