package method_overriding_practice;

public class Q3Bus extends Q3Transport{
	
	public void calculateFare() {
		double basicFare = 500.78;
		System.out.println("Basic fair is: " + basicFare);
		double busFare = 246.89;
		System.out.println("Total Fair is: " + (basicFare + busFare));
	}
	

}
