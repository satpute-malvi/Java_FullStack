package method_overriding_practice;

public class Q2FullTimeEmployee extends Q2Employee{
	
	public void calculateSalary() {
		double baseSalary = 45000.50;
		System.out.println("Base Salary is: " + baseSalary);
		double incentive = 2575.89;
		System.out.println("Total Salary of full time employee is: " + (baseSalary + incentive));
	}
	
	public static void main(String[] args) {
		Q2Employee e = new Q2Manager();
		
		e.calculateSalary();
	}

}
