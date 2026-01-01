package string_builder_practice;
import java.util.Scanner;

// Check whether the string is palindrome using StringBuilder reverse().

public class CheckPlaidrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Emter the string: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		 sb.reverse(); // reverses the StringBuilder

	     String reversedString = sb.toString();

	     if (str.equals(reversedString)) {
	           System.out.println("String is palindrome");
	     } else {
	         System.out.println("String is not palindrome");
	     }
		sc.close();
	}

}
