package overriding_task;

public class Application {
	
	public static void main(String[] args) {
		Payment p = new Gpay();
		p.checkBalance("Gpay");
		p.reward();
		System.err.println("-----------------------");
		p = new PhonePe();
		p.checkBalance("PhonePe");
		p.reward();
		System.err.println("-----------------------");
		p = new PayTM();
		p.checkBalance("PayTM");
		p.reward();
		System.err.println("-----------------------");
		p = new Razorpay();
		p.checkBalance("Razorpay");
		p.reward();
	}
}
