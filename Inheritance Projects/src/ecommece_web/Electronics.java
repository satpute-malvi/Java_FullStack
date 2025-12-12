package ecommece_web;

public class Electronics extends Product{
	
	private int warrantyYears;
	private double powerRating;
	
	Electronics(){
		this("NA", 10000, 1, 5.0);
	}
	
	
	Electronics(String productId, double basePrice, int warrantyYears, double powerRationg){
		super(productId, basePrice);
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}


	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}


	public double getPowerRating() {
		return powerRating;
	}


	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	
	public String getWarranty() {
		
		return "Warranty:" + warrantyYears + "year";
		
	}
	
	public boolean isEnergyEfficient() {
		
		return powerRating <= 10;
		
	}

}
