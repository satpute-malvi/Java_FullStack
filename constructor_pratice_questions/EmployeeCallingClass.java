package constructor_pratice_questions;

public class EmployeeCallingClass {

	public static void main(String[] args) {
		// Create a class Employee with a parameterized constructor that accepts id, name, and salary.
		
		Employee e1 = new Employee(123, "ABC", "6 LPA");
		
		// Create 2 Employee objects and display the details.**
		
		// Create 2 Employee objects and display the details.
		System.out.println("<------Object 1 deatils---->");
		Employee e2 = new Employee(456, "XYZ", "10 LPA");
		
		System.out.println("<------Object 2 deatils---->");
		Employee e3 = new Employee(786, "IJK", "9 LPA");
	}

}
