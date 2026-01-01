package string_buffere_practice;

// Insert "Programming" inside "I Love " using StringBuffer.

public class InsertString {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("I love");
		
		sb.insert(2, "Programming ");
		
		System.out.println("New String: " + sb);
	}

}
