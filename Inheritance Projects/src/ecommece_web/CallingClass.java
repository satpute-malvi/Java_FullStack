package ecommece_web;

public class CallingClass {
	
	public void display(SmartPhone sp) {
		System.out.println("Product ID: " + sp.getProductId());
        System.out.println("Base Price: " + sp.getBasePrice());
        System.out.println("Discount: " + sp.getDiscountprice());
        System.out.println("Final Price: " + sp.getFinalPrice());
        System.out.println("Product Warranty: " + sp.getWarranty());
        System.out.println("Energy Efficient: " + sp.isEnergyEfficient());
        System.out.println(sp.getPhoneDetails());
        System.out.println("Battery Good: " + sp.isBatteryGood());
	}

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		CallingClass cc = new CallingClass(); 
		
		cc.display(sp);

	}

}
