package break_continue_keywords;
// Print numbers from 1 to 50 but stop when number becomes 25.

public class Q1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			if (i == 25) {
				break;
			}
			System.out.println(i);
		}

	}

}
