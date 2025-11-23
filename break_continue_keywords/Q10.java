package break_continue_keywords;

// Print odd numbers from 1 to 200 but stop when you encounter the first even number greater than 150.

public class Q10 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 200; i++) {
			
			if(i > 150 && i % 2 == 0) {
				break;
			}else {
				if(i % 2 == 1) {
					System.out.println(i);
				}
			}
			
		}

	}

}
