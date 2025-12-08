package constructor_pratice_questions;

// Write a program to create a class Student with a non-parameterized constructor that prints “Welcome Student”.

public class Student {
	public int studId;
	public String studName;
	
	Student(){
		System.out.println("(Non-parameterized)Welcome student....");
	}
	
	// Write a program with a parameterized constructor to initialize id and name of a Student and display them. 
	Student(int studId, String studName){
		this.studId = studId;
		this.studName = studName;
	
		System.err.println("(Parameterized)Student details.....");
		System.out.println("Student Id: " + this.studId);
		System.out.println("Student name: " + this.studName);
		
	}
}
