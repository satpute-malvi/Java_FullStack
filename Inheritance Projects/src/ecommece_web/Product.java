package ecommece_web;

public class Product {
	
	private String productId;
	private double basePrice;
	private double discountPrice;
	private double finalPrice;
	
	public Product(String productId, double basePrice){
		this.productId = productId;
		this.basePrice = basePrice;
		applyDiscount();
		calculateFinalPrice();
		
	}
	
	public Product() {
		this("NA" , 1000.0);
	}
	
	public void calculateFinalPrice() {
		
		this.finalPrice = this.basePrice - this.discountPrice;
		
	}
	
	public void applyDiscount() {
		
		double rate;
		if(this.basePrice >= 50000) {
			rate = 15.5;
		}else if(this.basePrice >= 20000) {
			rate = 10.0;
		}else if(this.basePrice >=5000) {
			rate = 5.0;
		}else {
			rate = 2.0;
		}
		
		this.discountPrice = (this.basePrice * rate) / 100.0;
		
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getDiscountprice() {
		return discountPrice;
	}

	public void setDiscountprice(double discountprice) {
		this.discountPrice = discountprice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	

}
