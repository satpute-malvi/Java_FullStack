package break_continue_keywords;

// Print characters from ‘A’ to ‘Z’ but skip vowels.

public class Q6 {

	public static void main(String[] args) {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			
			if(ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U') {
				continue;
			}
			System.out.println(ch);
		}

	}

}
