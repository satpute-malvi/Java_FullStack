package string_builder_practice;

// Create a StringBuilder with text "Hello" and append " Java".

public class AppendString {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		
		System.out.println("String before append: " + sb);
		sb.append(" Java");
		System.out.println("String after append: " + sb);
		
	}

}
