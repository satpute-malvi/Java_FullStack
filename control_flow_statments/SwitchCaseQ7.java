package control_flow_statments;
import java.util.Scanner;

//7. Use a switch statement to check if a number is even or odd (hint: use number % 2 as the expression)

public class SwitchCaseQ7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre number: ");
		int num = sc.nextInt();
		
		switch(num % 2) {
		case 1: System.out.println(num + "is an odd nummber");
			break;
		default: 
			if (num == 0 ) {
				System.out.println("Number is zero it's not even nor odd");
			}else {
				System.out.println(num + "is an even number");
			}
	
		}

	}

}
