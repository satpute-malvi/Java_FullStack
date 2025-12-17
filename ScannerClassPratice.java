package classes_and_objects_basics;

import java.util.Scanner;

public class ScannerClassPratice {
	
	//1. Take two numbers from user and print their addition.
	public void addNum(Scanner sc) {
		System.out.println("-------Addition----------");
		System.out.print("Num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Num 2: ");
		int num2 = sc.nextInt();
		System.out.println("Addition is: " + (num1 + num2));
		
	}
	
	//2. Take name and age from user and display them.
	public void takeAgeName(Scanner sc) {
		System.out.println("--------Take name and Age-------");
		System.out.print("Enter name:");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	//3. Take three numbers and print the largest number.
	public void getLargest(Scanner sc) {
		
		System.out.println("--------------Largest of 3---------------");
		System.out.print("Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Num3 : ");
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is largest");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is largest");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is largest");
		}else if(num1 == num2 && num2 == num3){
			System.out.println("All numbers are equal");
		}else {
			System.out.println("You may entered somevsame values");
		}
	}
	
	//4. Take radius from user and calculate area of circle.
	public void calculateAreaOfCircle(Scanner sc) {
		System.out.println("---------Area of the Circle------------");
		System.out.print("Enter radius: ");
		double r = sc.nextDouble();
		double area = 3.14 * (r * r);
		System.out.println("Area is: " + area);
	}
	
	//5. Take a sentence from user using nextLine() and print it.
	public void takeSentence(Scanner sc) {
		System.out.println("------------Sentence input--------------");
		System.out.println("Enter sentance: ");
		String sentance = sc.nextLine();
		System.out.println("Sentance is:");
		System.out.println(sentance);
	}
	
	//6. Take marks of 5 subjects and print total & percentage.
	public void printTotalAndPercentage(Scanner sc) {
		System.out.println("-------Take marks of 5 subjects and print total & percentage------");
		int total = 0;
		System.out.println("Enter marks of 5 subjects:");
		for(int i = 1; i <= 5; i++) {
			System.out.println("Subject" + i + ": ");
			int marks = sc.nextInt();
			total = total + marks;
		}
		int percentage = (total / 500) * 100;
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + percentage);		
	}
	
	//7. Take length and width and calculate area of rectangle.
	public void areaOfRectangle(Scanner sc) {
		System.out.println("---------Area of rectangle-----------");
		System.out.print("Enter Length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		System.out.println("Area is: " + (length * width));
	}
	
	//8. Take a number and check if it is even or odd.
	public void chackEvenOdd(Scanner sc) {
		System.out.println("---------Check Even Odd---------");
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (num != 0 ) {
			if (num % 2 == 0) {
				System.out.println(num + " is even");
			}else {
				System.out.println(num + " is odd");
			}
		}else {
			System.err.println("You entered 0 or Invalid Input...");
		}
	}
	
	//9. Take a number and check if it is positive, negative, or zero.
	public void checkPositiveNegative(Scanner sc) {
		System.out.println("--------Check Positive Negative or zero-------");
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("You enterd zero");
		}else if(num > 0) {
			System.out.println("Number is Positive");
		}else if(num < 0){
			System.out.println("Number is negative");
		}else {
			System.err.println("Invalid Input");
		}
	}
	
	//10. Take two numbers and print multiplication & division.
	public int multiply(int a, int b) {
		return (a * b);
	}
	public int dividion(int a, int b) {
		return (a / b);
	}
	
	//11. Take temperature in Celsius and convert to Fahrenheit.
	public void celsiusFahrenheit(Scanner sc) {
		System.out.println("----------Celsius to Fahrenheit-----------");
		System.out.print("Enter temperature in celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit =  (celsius * 1.8) + 32; 
		System.out.println(celsius + "C = " + fahrenheit + "F");
	}
	
	//12. Take the price and quantity of a product and print total bill.
	public void printTotalBill(Scanner sc) {
		System.out.println("------Print Total Bill and Price-------");
		System.out.print("Enter price of the product: ");
		double price = sc.nextDouble();
		System.out.print("Enter Quantity of the product: ");
		double quantity = sc.nextDouble();
		System.out.println("Total Price: " + (price * quantity));
	}
	
	//13. Take employee name, id, and salary and print employee details.
	public void takeAndPrintDetails(Scanner sc) {
		System.out.println("----------Employee Details------------");
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("----Details----");
		System.out.println("Name   : " + name);
		System.out.println("Id     : " + id);
		System.out.println("Salary : " + salary);	
	}
	
	//14. Take a character from user and check whether it is vowel or consonant.
	public void checkVowelOrConsonant(Scanner sc) {
		System.out.println("--------Check vowel or consonant----------");
		char ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			if (ch == 'A' || ch == 'a' || 
				ch == 'E' || ch == 'e' || 
				ch == 'I' || ch == 'i' || 
				ch == 'O' || ch == 'o' || 
				ch == 'U' || ch == 'u') {
				System.out.println("It is a vowel");
			}else {
				System.out.println("It is a consonant");
			}
			
		}else {
			System.err.println("Envalid input...");
		}
	}
	//15. Take three sides of triangle and print its perimeter.
	public void perimeterOfTriangle(Scanner sc) {
		System.out.println("-------Perimeter of Triangle--------");
		System.out.println("Side1: ");
		int side1 = sc.nextInt();
		System.out.println("Side2: ");
		int side2 = sc.nextInt();
		System.out.println("Side3: ");
		int side3 = sc.nextInt();
		System.out.println("Perimeter is: " + (side1 + side2 + side3));
	}
	
	//16. Take a number and print its square and cube.
	public int square(int num) {
		return num * num;
	}
	public int cube(int num) {
		return num * num * num;
	}
	//17. Take two strings using nextLine() and print their concatenation.
	public void stringConcat(Scanner sc) {
		System.out.println("----Concat 2 Strings---------");
		System.out.print("String 1: ");
		String str1 = sc.nextLine();
		sc.nextLine();
		System.out.print("String 2: ");
		String str2 = sc.nextLine();
		System.out.println("Concatinates String is:");
		System.out.println(str1 + str2);
	}
	
	//18. Take marks as float and check whether student is pass or fail.
	public void checkPassFail(Scanner sc) {
		System.out.println("-------Check Pass Or fail---------");
		System.out.print("Enter Marks: ");
		double marks = sc.nextDouble();
		
		if(marks >= 0 && marks <= 100) {
			if(marks >= 40) {
				System.out.println("Ypu are pass...");
			}else {
				System.out.println("You are fail...");
			}
			
		}else {
			System.err.println("Invalid input...");
		}	
	}
	
	//19. Take time in seconds and convert into minutes and seconds.
	public void secondToMinute(Scanner sc) {
		System.out.println("----Convert seconds to minute and seconds----");
		System.out.print("Enter seconds: ");
		int seconds = sc.nextInt();
		int minutes = seconds / 60;
		int remiderSeconds = seconds - (minutes * 60);
		
		System.out.println(seconds + "S" + " = " + minutes + "M and " + seconds + "S" );
	}
	//20 Take principal, rate, time and calculate Simple Interest (SI = PRT/100)
	public void calculateSimpleInterst(Scanner sc) {
		System.out.println("-----Calculate simple intrest-------");
		System.out.print("Enter principle amount: ");
		int principle = sc.nextInt();
		System.out.print("Enter rate of interest: ");
		int rate = sc.nextInt();
		System.out.print("Enter time: ");
		int time = sc.nextInt();
		
		int simpleInterest = (principle * rate * time)/100;
		System.out.println("Simple interset is: " + simpleInterest);
	}

}
