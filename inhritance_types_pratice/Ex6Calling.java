package inhritance_types_pratice;

/*
 6.Create classes A → B → C.
Each class has one method:
A.showA(), B.showB(), C.showC().
Call all three using C object.
 */

public class Ex6Calling {
	
	public static void main(String[] args) {
		
		Ex6C c = new Ex6C();
		
		c.showA();
		c.showB();
		c.showC();
	}
}
