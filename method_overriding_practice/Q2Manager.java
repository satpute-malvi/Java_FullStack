package method_overriding_practice;

public class Q2Manager extends Q2FullTimeEmployee{
	public void calculateSalary() {
		double baseSalary = 45000.50;
		System.out.println("Base Salary is: " + baseSalary);
		double managerialBonus = 5500.89;
		System.out.println("Total Salary for manager is: " + (baseSalary + managerialBonus));
	}
}
