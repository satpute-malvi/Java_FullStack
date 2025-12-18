package method_overriding_practice;

/*
Design an online shopping system where:

Product has a method calculateDiscount() that prints a generic discount.

Electronics overrides calculateDiscount() to apply an electronics-specific discount.

Mobile further overrides calculateDiscount() to apply a mobile-specific discount.

In the main() method:

Create a Product reference pointing to a Mobile object.

Call calculateDiscount() and observe runtime polymorphism.
*/

public class Q1Product {
	
	public void calculateDiscount(double price){
		double discount = price * (2.0/100.0);
		System.out.println("2% discount: " + discount);
	}
	
	

}
