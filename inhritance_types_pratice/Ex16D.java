package inhritance_types_pratice;

public class Ex16D extends Ex16C{
	
	public void displayD() {
		System.out.println("display() of class D");
	}

	public static void main(String[] args) {
		
		Ex16D d = new Ex16D();
		
		d.displayA();
		d.displayC();
		d.displayD();
	}

}
