package string_buffere_practice;
import java.util.Scanner;

// Print length and capacity of StringBuffer.

public class CapcityOfStringBuffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String length: " + sb.length());
		System.out.println("String Capacity: " + sb.capacity());
	}

}
