package method_overloading_pratice;
import java.util.Scanner;

public class CalculateQ10Q11 {

	
	/*
	 10.Overload a method calculate() to find:
		square of a number
		cube of a number
	 */
	
	public void calculate(int num1, int num2) {
		System.out.println("Square is: " + (num1 * num2));
		
	}
	public void calculate(int num1, int num2, int num3) {
		System.out.println("Cude is: " + (num1 + num2 + num3) );
	}
	/*
		11. Create a method max() to find maximum of:
		two numbers
		three numbers
	 */
	
	public void max(int num1, int num2) {
		 if (num1 > num2) {
	            System.out.println("Maximum number is: " + num1);
	        } else if (num1 > num2) {
	            System.out.println("Maximum number is: " + num2);
	        } else {
	            System.out.println("Both numbers are equal");
	        }
	}
	
	public void max(int num1, int num2, int num3) {
		 if (num1 > num2 && num1 > num3) {
	            System.out.println("Maximum number is: " + num1);
	        } else if (num2 > num1 && num2 > num3) {
	            System.out.println("Maximum number is: " + num2);
	        } else if (num3 > num1 && num3 > num2) {
	            System.out.println("Maximum number is: " + num3);
	        } else {
	            System.out.println("Two or more numbers are equal");
	        }
		
	}
	
	
	public static void main(String[] args) {
		CalculateQ10Q11 c = new CalculateQ10Q11();
		Scanner sc = new Scanner(System.in);
		System.out.println("----Square and Cube------");
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		c.calculate(num, num);
		c.calculate(num, num, num);
		System.out.println("----Find max-----");
		System.out.println("Enter 2 numbers to comapare");
		
		System.out.print("Num1: ");
		int num1 = sc.nextInt();
		System.out.print("Num2: ");
		int num2 = sc.nextInt();
		c.max(num1, num2);
		
		System.out.println("Enter 3 numbers to comapare");
		
		System.out.print("Num1: ");
		num1 = sc.nextInt();
		System.out.print("Num2: ");
		num2 = sc.nextInt();
		System.out.print("Num3: ");
		int num3 = sc.nextInt();
		c.calculate(num1, num2, num3);
		sc.close();
	}

}
