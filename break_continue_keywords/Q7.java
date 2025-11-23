package break_continue_keywords;
import java.util.Scanner;

/*
 1. Sum Until Negative

Write a program that keeps taking integer input from the user and adds them to a sum.
Stop taking input when the user enters a negative number (use break).
Finally print the total sum.
 */

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(true) {
			System.out.print("Entet number:");
			int num = sc.nextInt();
			if (num < 0) {
				break;
			}
			System.out.println(num);
			i++;
		}
	}

}
