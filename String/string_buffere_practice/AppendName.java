package string_buffere_practice;

// Create a StringBuffer and append your name.

public class AppendName {
	public static void main(String[] args) {
		
		String str = "My name is ";
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.append("Malvi");
		
		System.out.println("Appended String: " + sb);
		
	}
	

}
