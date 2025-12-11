package inhritance_types_pratice;

/*
 4.Create class Vehicle with method start().
Create class Car extending Vehicle with method drive().
Call both using child object.

 */

public class Ex4Calling {
	
	public static void main(String[] args) {
		Ex4Car c = new Ex4Car();
		
		c.start();
		c.drive();
	}

}
