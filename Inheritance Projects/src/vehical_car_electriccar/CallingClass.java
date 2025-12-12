package vehical_car_electriccar;

public class CallingClass {

	public static void main(String[] args) {
		ElectricCar e1 = new ElectricCar("Tesla", "Model 3", 2025,
                5, "Electric", 75, 520);

        e1.display();          
        e1.displayCar();       
        e1.displayElectricCar();
    }


}
