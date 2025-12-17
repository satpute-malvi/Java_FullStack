package method_overloading_pratice;

/*
 
	8. Overload a static method print() with:
	one parameter
	two parameters

 */

public class PrintDemo {
	
	public static void print(int a) {
		System.out.println("print() one parameter");
		System.out.println("a: " + a);
		
	}
	
	public static void print(int a, int b) {
		System.out.println("print() two parameter");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}

	public static void main(String[] args) {
		PrintDemo pd = new PrintDemo();
		pd.print(67);
		pd.print(90, 10);
		
	}

}
