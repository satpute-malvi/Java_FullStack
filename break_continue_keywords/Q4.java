package break_continue_keywords;

// Print numbers from 1 to 50 but skip numbers divisible by 7.

public class Q4 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
