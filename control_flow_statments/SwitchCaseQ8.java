package control_flow_statments;
import java.util.Scanner;

/* 8. Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.
 Category	Rate per Unit (₹)	Formula
Domestic	₹5 per unit	      bill = units × 5
Commercial	₹8 per unit	      bill = units × 8
Industrial	₹10 per unit	  bill = units × 10
*/
public class SwitchCaseQ8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit:");
		int unit = sc.nextInt();
		System.out.println("Enter bill type: ");
		String type = sc.next();
		
		
		switch(type) {
		case "Domestic": System.out.println("Bill is:" + (unit * 5));
			break;
		case "Commercial": System.out.println("Bill is:" + (unit * 8));
			break;
		case "Industrial": System.out.println("Bill is:" + (unit * 10));
			break;
		default: System.out.println("Invalid input. Please enter valid bill type.");	
		
		}
	}

}