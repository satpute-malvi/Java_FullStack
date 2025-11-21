package control_flow_statments;
import  java.util.Scanner;

public class CheckAge2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		if(age >= 0 && age <= 12) {
			System.out.println("You are an child");
		}else if(age >= 13 && age <= 19){
			System.out.println("You are a Teenager");
		}else if(age >= 20 && age <= 59){
			System.out.println("You are an Adult");
		}else if(age >= 60 && age <= 120){
			System.out.println("Senior Citize");
		}else if(age >= 120){
			System.out.println("😏😏");
		}else {
			System.out.println("Invalid input");
		}
		

	}

}
