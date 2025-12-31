package string_practise_questions;
import java.util.Scanner;

public class CovertCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		// Convert string to uppercase.
		System.out.println("Upper case string: " + str.toUpperCase());
		
		// Convert string to lowercase. 
		System.out.println("Lower case string: " + str.toLowerCase());
	}

}
