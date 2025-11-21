package control_flow_statments;
import java.util.Scanner;

/*

5. Input color name (Red, Yellow, or Green) and print the appropriate action:

Red → Stop
Yellow → Ready
Green → Go
 */

public class SwitchCaseQ5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color of the signal: ");
		String color = sc.next();
		
		switch(color) {
		case "Red": System.out.println("Stop");
			break;
		case "Yellow": System.out.println("Ready");
			break;
		case "Green": System.out.println("Go");
			break;
		default: System.out.println("Invalid input");	
		
		}
	}
}
