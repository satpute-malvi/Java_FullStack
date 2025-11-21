package control_flow_statments;
import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num != 0) {
			System.out.println("Number is even");
		}else if(num == 0) {
			System.out.println("0 is an not even not an odd number");
		}else {
			System.out.println("It is a odd number");
		}
	}

}
