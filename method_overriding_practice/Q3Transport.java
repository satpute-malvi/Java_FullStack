package method_overriding_practice;

/*
Transport

Bus

LuxuryBus

Problem Statement

Design a transport fare system where:

Transport has a method calculateFare() with basic fare logic.

Bus overrides calculateFare() to add per-kilometer charges.

LuxuryBus overrides calculateFare() to add luxury tax and service charges.

In the main() method:

Store a LuxuryBus object in a Transport reference.

Call calculateFare() and analyze which implementation executes. 
 */

public class Q3Transport {
	
	public void calculateFare() {
		double basicFare = 500.78;
		System.out.println("Basic fair is: " + basicFare);
	}

}
