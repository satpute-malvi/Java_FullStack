package string_builder_practice;
import java.util.Scanner;

// Count the number of characters using StringBuilder (without length()).

public class CountCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		 int count = 0;

	     for (char var : sb.toString().toCharArray()) {
	            count++;
	     }
	        
		System.out.println("Count is: " + count);
		sc.close();
	}

}
