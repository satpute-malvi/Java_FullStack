package string_practise_questions;
import java.util.Scanner;

// Check whether two strings are equal or not.

public class CheckEqualString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string1: ");
		String str1 = sc.nextLine();
		System.out.print("Enter a string2: ");
		String str2 = sc.nextLine();
		
		System.out.println(str1 + " equal to " + str2 + ": " +(str1.equals(str2)));
	}

}
