package control_flow_statments;
import java.util.Scanner;

// 6. Take a single character input and check whether it is a vowel or consonant using a switch statement.

public class SwitchCaseQ6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation to perfriom: ");
		char alphabet = sc.next().charAt(0);
		
		switch(alphabet) {
		
		case 'a': System.out.println(alphabet + "is a vowel");
			break;
		case 'e': System.out.println(alphabet + "is a vowel");
			break;
		case 'i': System.out.println(alphabet + "is a vowel");
			break;
		case 'o': System.out.println(alphabet + "is a vowel");
			break;
		case 'u': System.out.println(alphabet + "is a vowel");
			break;
		case 'A': System.out.println(alphabet + "is a vowel");
			break;
		case 'E': System.out.println(alphabet + "is a vowel");
			break;
		case 'I': System.out.println(alphabet + "is a vowel");
			break;
		case 'O': System.out.println(alphabet + "is a vowel");
			break;
		case 'U': System.out.println(alphabet + "is a vowel");
			break;
		default:
			if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')){
				System.out.println(alphabet + "is a consonant");
			}else{ 
				System.out.println("Invalid input. Please enter an alphabet.");
			}
		}
	}
	

}
