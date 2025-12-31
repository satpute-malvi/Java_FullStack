package string_practise_questions;
import java.util.Scanner;

// Concatenate two strings without using + operator.

public class Concat2Strings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string1: ");
		String str1 = sc.nextLine();
		System.out.print("Enter a string2: ");
		String str2 = sc.nextLine();
		
		System.out.println(str1.concat(str2));
	}

}
