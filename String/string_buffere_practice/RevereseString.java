package string_buffere_practice;
import java.util.Scanner;

// Reverse a string using StringBuffer.

public class RevereseString {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		System.out.println("Reverse: " + sb);
		
		sc.close();
	}

}
