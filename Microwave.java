
public class Microwave {

	
	private int time;
	private int power = 1;
	
	
	public void time() {
	
		time += 30;
		System.out.println("Time button was pressed. Time is "+time+" seconds");
		
	}
	
	public void power() {
	
		if (power==1)
		{
			power = 2;
			System.out.println("Power Button was pressed. Power level is " +power);
		}
		else
		{
			power = 1;
			System.out.println("Power Button was pressed. Power level is" +power);
		}
	}

	public void reset() {
		time = 0;
		power = 1;
		System.out.println("Reset Button was pressed. Power is 1. Time is 0 seconds.");
	}
	
	public void start() {
		System.out.println("Cooking for "+time+" seconds at level "+power+".");
		
		
	}
	
	
	
	
	
	
}
