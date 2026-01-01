package string_buffere_practice;

// Delete last 3 characters using StringBuffer.

public class DeleteLast3Char {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello world");
		
		sb.delete(sb.length() - 3, sb.length());
		System.out.println(sb);

	}

}
