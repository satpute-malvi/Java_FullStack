package classes_and_objects_basics;
import java.util.Scanner;

public class ScannerClassPraticeCalling extends ScannerClassPratice{
	
	public static void main(String[] args) {
		
		ScannerClassPratice scp = new ScannerClassPratice();
		Scanner sc = new Scanner(System.in);
	
		//1. Take two numbers from user and print their addition.
		scp.addNum(sc);
		System.out.println("--------------------------------");
		
		//2. Take name and age from user and display them.
		scp.takeAgeName(sc);
		System.out.println("--------------------------------");
		
		//3. Take three numbers and print the largest number.
		scp.getLargest(sc);
		System.out.println("--------------------------------");
		
		//4. Take radius from user and calculate area of circle.
		scp.calculateAreaOfCircle(sc);
		System.out.println("--------------------------------");
		
		//5. Take a sentence from user using nextLine() and print it.
		scp.takeSentence(sc);
		System.out.println("--------------------------------");
		
		//6. Take marks of 5 subjects and print total & percentage.
		scp.printTotalAndPercentage(sc);
		System.out.println("--------------------------------");
		
		//7. Take length and width and calculate area of rectangle.
		scp.areaOfRectangle(sc);
		System.out.println("--------------------------------");
		
		//8. Take a number and check if it is even or odd.
		scp.chackEvenOdd(sc);
		System.out.println("--------------------------------");
		
		//9. Take a number and check if it is positive, negative, or zero.
		scp.checkPositiveNegative(sc);
		System.out.println("---------------------------------");
		
		//10. Take two numbers and print multiplication & division.
		System.out.println("-----Multipication and Division--------");
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt();
		System.out.println("Multiplication is: " + scp.multiply(num1, num2));
		System.out.println("Division is: " + scp.dividion(num1, num2));
		System.out.println("----------------------------------");
		
		//11. Take temperature in Celsius and convert to Fahrenheit.
		scp.celsiusFahrenheit(sc);
		System.out.println("---------------------------------");
		
		//12. Take the price and quantity of a product and print total bill.
		scp.printTotalBill(sc);
		System.out.println("---------------------------------");
		
		//13. Take employee name, id, and salary and print employee details.
		scp.takeAndPrintDetails(sc);
		System.out.println("--------------------------------");
		
		//14. Take a character from user and check whether it is vowel or consonant.
		scp.checkVowelOrConsonant(sc);
		System.out.println("--------------------------------");
		
		//15. Take three sides of triangle and print its perimeter.
		scp.perimeterOfTriangle(sc);
		System.out.println("-------------------------------");
		
		//16. Take a number and print its square and cube.
		System.out.println("-----Print Square and Cube------");
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Square: " + scp.square(num));
		System.out.println("Cube: " + scp.cube(num));
		System.out.println("--------------------------------");
		
		//17. Take two strings using nextLine() and print their concatenation.
		scp.stringConcat(sc);
		System.out.println("---------------------------------");
		
		//18. Take marks as float and check whether student is pass or fail.
		scp.checkPassFail(sc);
		System.out.println("-------------------------------");
		
		//19. Take time in seconds and convert into minutes and seconds.
		scp.secondToMinute(sc);
		System.out.println("--------------------------------");
		//20 Take principal, rate, time and calculate Simple Interest (SI = PRT/100)
		scp.calculateSimpleInterst(sc);
		System.out.println("--------------------------------");
		
		sc.close();
	}
}
