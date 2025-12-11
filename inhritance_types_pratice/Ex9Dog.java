package inhritance_types_pratice;

/*
 9.Create a chain LivingThing → Animal → Dog.
Add one method in each class and call all using Dog object.
 */

public class Ex9Dog extends Ex9Animal{
	
	public void dogMeassge() {
		System.out.println("dogMessage() of class Dog");
	}

	public static void main(String[] args) {
		
		Ex9Dog d = new Ex9Dog();
		d.livingThingMessage();
		d.animalMeaasge();
		d.dogMeassge();
		

	}

}
