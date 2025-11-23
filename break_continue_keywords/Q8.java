package break_continue_keywords;

// Print numbers from 1 to 100 but stop when number becomes 63.
public class Q8 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 100) {
			if(i == 63) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
