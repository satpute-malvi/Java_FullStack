package control_flow_statments;
import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month:");
		String month = sc.next();
		
		switch(month) {
		
		case "Jan": System.out.println(month + " is month of winter season");
		break;
		case "Feb": System.out.println(month + " is month of winter season");
		break;
		case "March": System.out.println(month + " is month of summer season");
		break;
		case "April": System.out.println(month + " is month of summer season");
		break;
		case "May": System.out.println(month + " is month of summer season");
		break;
		case "June": System.out.println(month + " is month of summer season");
		break;
		case "July": System.out.println(month + " is month of mansoon season");
		break;
		case "Aug": System.out.println(month + " is month of mansoon season");
		break;
		case "Sep": System.out.println(month + " is month of mansoon season");
		break;
		case "Oct": System.out.println(month + " is month of mansoon season");
		break;
		case "Nov": System.out.println(month + " is month of winter season");
		break;
		case "Dec": System.out.println(month + " is month of winter season");
		break;
		default : System.out.println("Invalid input...");
		
		}	
	}
}
