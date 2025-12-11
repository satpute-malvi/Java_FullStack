package inhritance_types_pratice;

/* 
11.Create class Parent with methodP().
Create two child classes Child1 and Child2.
Call methods of all classes using objects of each child.
 */

public class Ex11Calling {

	public static void main(String[] args) {
		
		Ex11Child1 c1 = new Ex11Child1();
		c1.methodP();
		
		Ex11Child2 c2 = new Ex11Child2();
		c2.methodP();

	}

}
