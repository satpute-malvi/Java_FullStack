package method_overriding_practice;

/*
Employee

FullTimeEmployee

Manager

Problem Statement

Create a payroll system where:

Employee defines a method calculateSalary().

FullTimeEmployee overrides calculateSalary() to include base salary.

Manager overrides calculateSalary() to include base salary plus managerial bonus.

In the main() method:

Use an Employee reference to call calculateSalary() on a Manager object.

Demonstrate dynamic method dispatch.
 */

public class Q2Employee {
	
	public void calculateSalary() {
		double baseSalary = 45000.50;
		System.out.println("Base Salary is: " + baseSalary);
	}

}
