package control_flow_statments;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of the day: ");
		int day = sc.nextInt();
		
		if(day>1 && day <= 7) {
			if(day == 1) {
				System.out.println("Sunday");
			}else if(day == 2){
				System.out.println("Monday");
			}else if(day == 3){
				System.out.println("Tuesday");
			}else if(day == 4){
				System.out.println("Wendnesday");
			}else if(day == 5){
				System.out.println("Thursday");
			}else if(day == 6){
				System.out.println("Friday");
			}else if(day == 7){
				System.out.println("Saturday");
			}
		}else {
			System.out.println("Invalid input");
		}
	}

}
