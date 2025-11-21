package control_flow_statments;
import java.util.Scanner;

// WAP to print student is pass or fail

public class IfElsePratice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks = sc.nextInt();
		
		if(marks>=0 && marks <=100) {
			if(marks <= 100 && marks >= 90) {
				System.out.println("🥇 You pass with first class and distionction(Grade A)");
			}else if(marks <= 89 && marks >= 75) {
				System.out.println("🥈 You pass with First Class(Grade B)");
			}else if(marks <= 74 && marks >= 60) {
				System.out.println("🥉 You pass with Second Class(Grade C)");
			}else if(marks <= 59 && marks >= 50) {
				System.out.println("You pass with Pass Class(Grade D)");
			}else if(marks <= 35 && marks >= 49) {
				System.out.println("You pass with Trird class(Grade E)");
			}else {
				System.out.println("Failed...(Grade F)");
			}	
		}
		else {
			System.out.println("Ooops.....Invalid Inpute");
		}

	}

}
