
public abstract class ParentAirCraft {
//any one method which is define as abstract then class should be treated as abstract
// every method that are in abstract must be inherited/implemented	
	public void engine()
	{
		System.out.println("Follow Engine Guidelines");
		
	}
	
	public void safetyGuidelines()
	{
		
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void bodycolor(); //this method is abstract
	
}
