package interface_practice;

public class Q1CashPayment implements Q1Payment{
	
	double cashReceived;
	
	Q1CashPayment(double cashReceived){
		this.cashReceived = cashReceived;
	}

	@Override
	public void payAmount(double amount) {
		System.out.println("Amount: " + amount);
		
	}
	
	public static void main(String[] args) {
		Q1CashPayment cp = new Q1CashPayment(4589.38d);
		cp.payAmount(678.8);
	}
	
}
