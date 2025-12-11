package inhritance_types_pratice;

/*
 7.Create classes GrandParent → Parent → Child.
Each class has one variable:
a=1, b=2, c=3.
Print all values using object of Child.

 */
		

public class Ex7Child extends Ex7Parent{
	
	public int c;

	public static void main(String[] args) {
		
		Ex7Child c = new Ex7Child();
		
		c.a = 1;
		c.b = 2;
		c.c = 3;
		
		System.out.println("a = " + c.a);
		System.out.println("b = " + c.b);
		System.out.println("c = " + c.c);
	}

}
