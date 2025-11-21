package control_flow_statments;
import java.util.Scanner;

/*
 9. Take month number (1–12) and print the corresponding season:

Dec–Feb → Winter
Mar–May → Summer
Jun–Aug → Monsoon
Sep–Nov → Autumn
 */

public class SwitchCaseQ9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 12:
		case 1:
		case 2: System.out.println("Dec to Feb is month form the winter season.");
			break;
			
		case 3:
		case 4:
		case 5:System.out.println("March to May is month form the Summer season.");
			break;
			
		case 6:
		case 7:
		case 8: System.out.println("June to Aug is month form the winter season.");
			break;
			
		case 9:
		case 10:
		case 11: System.out.println("Sep to Nov is month form the winter season.");
			break;
			
		default: System.out.println("Invalid month. Please enter the valid month");
	
		}
	}

}
