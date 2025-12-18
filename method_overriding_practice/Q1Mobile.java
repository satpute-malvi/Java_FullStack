package method_overriding_practice;

public class Q1Mobile extends Q1Electronics {
	
	public void calculateDiscount(double price){
		double discount = price * (7.0/100.0);
		System.out.println("7% discount: " + discount);
	}
	
	public static void main(String[] args) {
		
		Q1Mobile m = new Q1Mobile();
		m.calculateDiscount(20000.0);
	}
}
