package string_builder_practice;

import java.util.Scanner;

// Reverse a string using StringBuilder.

public class RevereseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		System.out.println("Reverse: " + sb);
		
		sc.close();
	}
	

}
