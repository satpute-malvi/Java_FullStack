package control_flow_statments;
import java.util.Scanner;

// 1. Write a Java program that takes an integer (1–7) and prints the corresponding day name (e.g., 1 → Monday)

public class SwitchCaseQ1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day:");
		int day = sc.nextInt();
		
		switch(day) {
		case 1: System.out.println("Sunday");
			break;
		case 2: System.out.println("Monday");
			break;
		case 3: System.out.println("Tuesday");
			break;
		case 4: System.out.println("Wedensday");
			break;
		case 5: System.out.println("Thursday");
			break;
		case 6: System.out.println("Friday");
			break;
		case 7: System.out.println("Saturday");
			break;
		
		default: System.out.println("Invalid input..");
		}
				
	}

}
