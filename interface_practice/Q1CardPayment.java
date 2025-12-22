package interface_practice;

public class Q1CardPayment implements Q1Payment{
	
	String cardNumber;
	String cardHolderName;
	
	Q1CardPayment(String cardNumber, String cardHolderName){
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void payAmount(double amount) {
		System.out.println("Amount: " + amount);
		
	}

	public static void main(String[] args) {
		Q1CardPayment cp = new Q1CardPayment("645678384924", "Malvi");
		cp.payAmount(6899.45);
		
	}
	
}
