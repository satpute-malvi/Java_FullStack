package constructor_pratice_questions;

/* 
 * Write a program to create a class Car with:
Non-parameterized constructor that prints “Car Started”.
Parameterized constructor that takes model name and price.
Create both objects.

*/
public class Car {
	
	public String model; 
	public double price;
	
	Car(){
		System.out.println("Car Started...");
	}
	Car(String model, double price){
		this.model = model;
		this.price = price;
		
	}

}
