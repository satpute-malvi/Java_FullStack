package control_flow_statments;
import java.util.Scanner;

//3. Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.

public class SwitchCaseQ3 {

	public static void main(String[] args) {
		
		int a = 15, b = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation to perfriom: ");
		char operation = sc.next().charAt(0);
		
		switch(operation) {
		
		case '+':System.out.println("Addition is: "+ (a+b));
			break;
		case '-':System.out.println("Subtraction is: "+ (a-b));
			break;
		case '*':System.out.println("Multiplication is: "+ (a*b));
			break;
		case '/':System.out.println("Division is "+ (a/b));
			break;
		case '%':System.out.println("Modulo is: "+ (a%b));
			break;
		default: System.out.println("Invalide input");
		}
	}

}
