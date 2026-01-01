package string_builder_practice;

// Create a StringBuilder and insert the word "Java" in the middle of a sentence.


public class InsertJavaInMiddle {
	
	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("I am learning programming.");

	        int middle = sb.length() / 2;

	        sb.insert(middle, " Java");

	        System.out.println(sb);
		
	}

}
