package overriding_task;

public class Payment {
	
	public void checkBalance(String platfromName) {
		double balance = 1000000.00;
		System.out.println(platfromName + "Balance is: " + balance);
	}
	
	public void reward() {
		System.out.println("Rewards of different platfroms....");
	}

}
