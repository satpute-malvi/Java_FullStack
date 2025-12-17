package method_overloading_pratice;



public class CalculatorQ1ToQ5 {
	
	/*
	 1.Create a class Calculator and overload add() to add:
	two integers
	three integers
	 */
	
	public void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
		
	}
	public void add(int a, int b, int c) {
		System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
		
	}
	
	/*
	 2.Overload a method multiply() to multiply:
	two int values
	two double values
	 */

	public void multiply(int a, int b) {
		System.out.println(a + " x " + b + " = " + (a * b));
		
	}
	public void multiply(double a, double b) {
		System.out.println(a + " x " + b + " = " + (a * b));
		
	}
	
	/*
	 3.Create a method area() to calculate:
		area of circle
		area of rectangle
	 */
	public void area(double r) {
		
		System.out.println("Area of Circle: "+ (3.14 * r * r));
		
	}
	
	public void area(double length, double width) {
		System.out.println("Area of Rectangel: " + (length * width));
	}
	
	/*
	 4.Overload a method display() to print:
		integer value
		string value
	 */
	
	public void diaplay(int a) {
		System.out.println("Integer is: " + a);
	}
	public void display(String s) {
		System.out.println("String is: " + s);
	}
	
	/*
	 5.Overload sum() using different data types:
		sum(int, int)
		sum(float, float)
	 */
	
	public void sum(int a, int b) {
		System.out.println("Sum of integer:" + (a + b));
	}
	public void sum(float a, float b) {
		System.out.println("Sum of float:" + (a + b));
	}
}
