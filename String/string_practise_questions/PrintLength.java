package string_practise_questions;

import java.util.Scanner;

public class PrintLength {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("Length of string: " + str.length());
	}

}
