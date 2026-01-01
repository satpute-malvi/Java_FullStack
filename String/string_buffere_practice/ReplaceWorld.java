package string_buffere_practice;

// Replace "India" with "Bharat" using StringBuffer.

public class ReplaceWorld {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("India");
		System.out.println("Before replacement: " + sb);
		sb.replace(0, sb.length(), "Bharat");
		System.out.println("After replacement: " + sb);
	}

}
