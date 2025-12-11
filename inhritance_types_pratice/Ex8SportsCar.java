package inhritance_types_pratice;

/*
8.Create Vehicle → Car → SportsCar.
Each class prints a message.
Create object of SportsCar and show all messages.
 */

public class Ex8SportsCar extends Ex8Car{
	
	public void printMassage() {
		System.out.println("printMessage() of calss SportsCar()");
		
	}
	
	public static void main(String[] args) {
		
		Ex8SportsCar sc = new Ex8SportsCar();
		
		sc.printMassageV();
		sc.printMassageC();
		sc.printMassage();
	
	}
	
	

}
