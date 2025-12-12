package device_laptop_gaminglaptop;

public class Device {
	
	String brand;
    double price;

    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayDevice() {
        System.out.println("Device Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------------------");
    }

}
