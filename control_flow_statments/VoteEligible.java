package control_flow_statments;
import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre your age:");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("You are eligible for voting ");
			if(age >= 25) {
				System.out.println("and you are also eligible to be contest in elections");
			}else {
				System.out.println("you will be eligible to be contest in election after" + (25 - age) + "year...");
			}
	
		}else{
			System.out.println("You are not eligible for voting...");
		}
	}

}
