package constructor_pratice_questions;

// Create a class Employee with a parameterized constructor that accepts id, name, and salary.

public class Employee {
	
	public int empId;
	public String empName; 
	public String empSalary;
	Employee(int empId, String empName, String empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.displayDetails();
	}
	
	// Create 2 Employee objects and display the details.**
	public void displayDetails() {
		System.out.println("Employee Id: " + this.empId);
		System.out.println("Employee NAme: " + this.empName);
		System.out.println("Empolyee Salary: " + this.empSalary);
		
	}
	
		
	
}
