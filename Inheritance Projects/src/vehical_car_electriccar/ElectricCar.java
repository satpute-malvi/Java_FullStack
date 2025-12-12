package vehical_car_electriccar;

public class ElectricCar extends Car {
    int batteryCapacity;
    int range;

    public ElectricCar(String brand, String model, int year, int seatingCapacity, String fuelType,
                       int batteryCapacity, int range) {
        super(brand, model, year, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void displayElectricCar() {
        System.out.println("Electric Car Details:");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " km");
        System.out.println("----------------------------------");
    }
}
