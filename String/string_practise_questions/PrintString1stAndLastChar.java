package string_practise_questions;
import java.util.Scanner;

// Find the first and last character of a string.

public class PrintString1stAndLastChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("First Character: " + str.charAt(0));
		System.out.println("Last Character: " + str.charAt(str.length()-1));
	}

}
