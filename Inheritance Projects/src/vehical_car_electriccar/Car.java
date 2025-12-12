package vehical_car_electriccar;

public class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, int year, int seatingCapacity, String fuelType) {
        super(brand, model, year);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public void displayCar() {
        System.out.println("Car Details:");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("----------------------------------");
    }
}
