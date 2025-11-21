package control_flow_statments;
import java.util.Scanner;

public class LeapYear2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year = sc.nextInt();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
			System.out.println(year + " is a leap year");
			if (year % 100 == 0) {
				System.out.println(year + "is a century leap year");
			}
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}
}
