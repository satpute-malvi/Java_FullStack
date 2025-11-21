package control_flow_statments;
import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nuber: ");
		int num = sc.nextInt();
		if(num > 0){
			System.out.println("Number is positive");
		}else if(num == 0) {
			System.out.println("0 is an unsign number");
		}else {
			System.out.println("It is a negative  number");
		}
		
	}

}
