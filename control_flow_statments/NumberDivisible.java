package control_flow_statments;
import java.util.Scanner;

public class NumberDivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divisible:");
		int num = sc.nextInt();
		System.out.println("Enter number to check divider: ");
		int divider = sc.nextInt();
		
		if(num % divider == 0) {
			System.out.println(num + " is divisible by " + divider);
		}else {
			System.out.println(num + " is not divisibele by " + divider);
		}
			

	}

}
