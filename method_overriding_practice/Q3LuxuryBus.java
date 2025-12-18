package method_overriding_practice;

public class Q3LuxuryBus extends Q3Bus{
	
	public void calculateFare() {
		double basicFare = 500.78;
		System.out.println("Basic fair is: " + basicFare);
		double busFare = 246.89;
		double luxuryFare = 246.89;
		System.out.println("Total Fair is: " + (basicFare + busFare + luxuryFare));
	}
	
	 public static void main(String[] args) {
		 Q3LuxuryBus l = new Q3LuxuryBus();
		 l.calculateFare();
	}
}
