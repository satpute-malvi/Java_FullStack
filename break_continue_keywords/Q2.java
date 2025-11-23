package break_continue_keywords;

// Print even numbers from 1 to 100 but stop when you get first odd number.

public class Q2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}

	}

}
