package ecommece_web;

public class SmartPhone extends Electronics{
	
	private int cameraMP;
	private int batteryCapacity;
	
	SmartPhone(){
		this("S24", 25000, 1, 15, 48, 5000);
	}
	
	SmartPhone(String productId, double basePrice, int warrantyYears, double powerRating, int cameraMP, int batterapacity){
		super(productId,basePrice, warrantyYears, powerRating);
	}
	
	public int getCameraMP() {
		return cameraMP;
	}
	public void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public String getPhoneDetails() {
		 return "Camera: " + cameraMP + "MP, Battert: " + batteryCapacity + "mAh";
	}
	
	public Boolean isBatteryGood() {
		return batteryCapacity >= 4000;
	}

}
