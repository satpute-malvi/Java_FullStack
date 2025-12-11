package inhritance_types_pratice;

public class Ex17Tiger extends Ex17Cat{
	
	public void messageTiger() {
		System.out.println("messageTiger() of class Tiger");
	}

	public static void main(String[] args) {
		
		Ex17Tiger t = new Ex17Tiger();
		
		t.messageAnimal();
		t.messageCat();
		t.messageTiger();

	}

}
