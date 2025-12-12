package device_laptop_gaminglaptop;

public class GamingLaptop extends Laptop {
    String gpu;         
    double coolingScore; 

    public GamingLaptop(String brand, double price, int ram, int storage,
                        String gpu, double coolingScore) {

        super(brand, price, ram, storage);
        this.gpu = gpu;
        this.coolingScore = coolingScore;
    }

    public void displayGamingLaptop() {
        System.out.println("Gaming Laptop Details:");
        System.out.println("GPU: " + gpu);
        System.out.println("Cooling Score: " + coolingScore + "/10");
        System.out.println("----------------------------------");
    }
}
