package break_continue_keywords;

// Print numbers from 1 to 100 but skip numbers ending with digit 5.

public class Q5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if (i % 10 == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
