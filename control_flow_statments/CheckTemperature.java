package control_flow_statments;
import java.util.Scanner;

public class CheckTemperature {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Temperature:");
			
			int temperature = sc.nextInt();
			
			if(temperature > 30) {
				System.out.println("It is a hot day");
			}else {
				System.out.println("Wrong input.....");
			}
			
			
	}
}
