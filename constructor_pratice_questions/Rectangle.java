package constructor_pratice_questions;

// Create a class Rectangle with a non-parameterized constructor that sets length = 10 and width = 5. Print the area.

public class Rectangle {
	public int length;
	public int width;
	
	Rectangle(){
		this.length = 10;
		this.width = 5;
		this.calculateAreaOfRectangle();
		
		
	}
	// Create a class Rectangle with a parameterized constructor to set length and width, and print the area.
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
		this.calculateAreaOfRectangle();
		
	}
	
	public void calculateAreaOfRectangle() {
		System.out.println("Area of rectangle: " + (this.length * this.width));
	}
}
