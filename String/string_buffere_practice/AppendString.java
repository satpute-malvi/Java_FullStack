package string_buffere_practice;

//Create a StringBuilder with text "Hello" and append " Java".

public class AppendString {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		
		
		System.out.println("String before append: " + sb);
		sb.append(" Java");
		System.out.println("String after append: " + sb);
		
	}

}