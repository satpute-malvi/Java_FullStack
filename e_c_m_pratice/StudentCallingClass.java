package e_c_m_pratice;

/*
 1. Create a class Student with private variables id and name.
Provide getters and setters. Write a program to set values and print them.**
 */

public class StudentCallingClass {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setId(45);
		int studId = s.getId();
		System.out.println("Student id is: " + studId);
		
		s.setName("Malvi");
		String studName = s.getName();
		System.out.println("Student name is: " + studName);
	}

}
