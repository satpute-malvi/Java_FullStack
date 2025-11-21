package control_flow_statments;
import java.util.Scanner;

public class CheckTemperature2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Temperature:");
			
			int temperature = sc.nextInt();
			
			if(temperature > 30) {
				System.out.println("🔥 Hot Day");
			}else if(temperature <= 30 && temperature >= 20) {
				System.out.println("🌤️ Warm Day");
			}else if(temperature <= 19 && temperature >= 10) {
				System.out.println("🌥️ Cool Day");
			}else if(temperature < 10) {
				System.out.println("❄️ Cold Day");
			}else {
				System.out.println("Wrong input");
			}
			
	}
}
