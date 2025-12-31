package string_practise_questions;
import java.util.Scanner;

// Print each character of a string on a new line.

public class PrintOnNewLine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("------Enterted String-----");
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
