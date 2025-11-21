package control_flow_statments;
import java.util.Scanner;

/*
4. Take a grade character (A, B, C, D, F) as input and print a message:

A → Excellent
B → Good
C → Average
D → Poor
F → Fail
*/

public class SwitchCaseQ4{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation to perfriom: ");
		char grade = sc.next().charAt(0);
		
		switch(grade) {
		
		case 'A':System.out.println("Excellent");
			break;
		case 'B':System.out.println("Good");
			break;
		case 'C':System.out.println("Average");
			break;
		case 'D':System.out.println("Poor");
			break;
		case 'F':System.out.println("Fail");
			break;
		default: System.out.println("Invalide input");
		}
	}

}
