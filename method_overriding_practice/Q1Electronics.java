package method_overriding_practice;

public class Q1Electronics extends Q1Product{
	
	public void calculateDiscount(double price){
		double discount = price * (5.0/100.0);
		System.out.println("5% discount: " + discount);
	}
}
