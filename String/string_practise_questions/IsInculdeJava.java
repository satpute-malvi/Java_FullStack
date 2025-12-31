package string_practise_questions;
import java.util.Scanner;

//  Check whether a string contains the word "Java". 

public class IsInculdeJava {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("String include Java: " + str.contains("Java"));
		
		
	}

}
