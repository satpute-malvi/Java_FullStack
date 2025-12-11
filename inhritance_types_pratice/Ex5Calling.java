package inhritance_types_pratice;

/*
 5.Create class A with variable a = 100.
Class B extends A and doubles the value: b = a * 2.
Print both values.
 */

public class Ex5Calling {
	public static void main(String[] args) {
		
		Ex5B b = new Ex5B();
		
		b.a = 100;
		System.out.println("a = " + b.a);
		b.b = b.a * 2;
		
		System.out.println("b = " + b.b);
	}

}
