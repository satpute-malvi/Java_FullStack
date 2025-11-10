public class OperatorsPratice {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		System.out.println("<-------------Arithamatic Operator----------->");
		System.out.println("Addition is:" + (x + y));
		System.out.println("Subtraction is:" + (x - y));
		System.out.println("Division is:" + (x / y));
		System.out.println("Multipliation is:" + (x * y));
		System.out.println("Modulas is:" + (x % y));
		
		
		int a = 10;
		int b = 12;
		
		System.out.println("<-------------Relational/Comparison Operator----------->");
		System.out.println(a + " > " + b + ": " +(a>b)); // Greater than
		System.out.println(a + " < " + b + ": " +(a<b)); // Less than
		System.out.println(a + " >= " + b + ": " +(a>b)); //Greater than Equals to
		System.out.println(a + " <= " + b + ": " +(a<=b)); //Less than Equals to
		System.out.println(a + " == " + b + ": " +(a==b)); // Equals to
		System.out.println(a + " != " + b + ": " +(a!=b)); // Not equals to
		
		System.out.println("<-------------------Assignment Operator---------------->");
		int i = 27; // equals to
		System.out.println(i + " + 3 = "+ (i+=3));
		System.out.println(i + " - 5 = "+ (i-=5));
		System.out.println(i + " * 2 = "+ (i*=2));
		System.out.println(i + " / 5 = "+ (i/=5));
		System.out.println(i + " % 3 = "+ (i%=3));
		
		System.out.println("<-------------------Logical Operator------------------->");
		System.out.println("Logical AND (&&)");
		System.out.println("true && true:" + (true && true));
		System.out.println("true && false:" + (true && false));
		System.out.println("false && true:" + (false && true));
		System.out.println("false && false:" + (false && false));
		System.out.println("------------------------------------------");
		System.out.println("Logical OR (||)");
		System.out.println("true || true:" + (true || true));
		System.out.println("true || false:" + (true || false));
		System.out.println("false || true:" + (false || true));
		System.out.println("false || false:" + (false || false));
		System.out.println("------------------------------------------");
		System.out.println("Logical NOT (!)");
		System.out.println("!(true):" + !(true));
		System.out.println("!(false):" + !(false));
		System.out.println("<----------------Increment Decrement------------------->");
		int j = 23;
		System.out.println("j = "+ j);
		System.out.println("Pre-increment -> ++j:  " + (++j));
		System.out.println("Post-increment -> j++: " + (j++));
		System.out.println("Pre-decrement -> --j:  " + (--j));
		System.out.println("Post-decrement -> j--: " + (j--));
		
		System.out.println("<-------------Bitwise Operator----------->");
		System.out.println("12 & 15 : "+ (12 & 15));
		System.out.println("11 | 13 & 12 : " + (11 | 13 & 12));
		System.out.println("17 & 7 & 49 : " + (17 & 7 & 49));
		
	}
}
