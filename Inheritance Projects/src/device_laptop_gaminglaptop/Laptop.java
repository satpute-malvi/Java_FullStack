package device_laptop_gaminglaptop;

public class Laptop  extends Device {
    int ram;            
    int storage;        

    public Laptop(String brand, double price, int ram, int storage) {
        super(brand, price);
        this.ram = ram;
        this.storage = storage;
    }

    public void displayLaptop() {
        System.out.println("Laptop Details:");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("----------------------------------");
    }
}
