package string_builder_practice;

// Replace the word "Java" with "Python" using StringBuilder.

public class ReplaceWord {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("Before replacement: " + sb);
		sb.replace(0, sb.length(), "Python");
		System.out.println("After replacement: " + sb);
		
	}
	
}
