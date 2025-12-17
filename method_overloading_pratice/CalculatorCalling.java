package method_overloading_pratice;

public class CalculatorCalling {

	public static void main(String[] args) {
		
		CalculatorQ1ToQ5 c = new CalculatorQ1ToQ5();
		
		/*
		 1.Create a class Calculator and overload add() to add:
		two integers
		three integers
		 */
		System.out.println("--------add()--------");
		System.out.println();
		c.add(12, 56);
		c.add(34, 56, 67);

		/*
		 2.Overload a method multiply() to multiply:
		two int values
		two double values
		 */
		System.out.println();
		System.out.println("------multiply()--------");
		System.out.println();
		c.multiply(65, 47);
		c.multiply(6.89, 89.7);
		
		/*
		 3.Create a method area() to calculate:
			area of circle
			area of rectangle
		 */
		System.out.println();
		System.out.println("------area()--------");
		System.out.println();
		c.area(6.0);
		c.area(5.5, 8.9);
		
		/*
		 4.Overload a method display() to print:
			integer value
			string value
		 */
		System.out.println();
		System.out.println("------diplay()--------");
		System.out.println();
		c.diaplay(67);
		c.display("Malvi");
		
		/*
		 5.Overload sum() using different data types:
			sum(int, int)
			sum(float, float)
		 */
		System.out.println();
		System.out.println("------sum()--------");
		System.out.println();
		c.sum(89, 4);
		c.sum(64.6f, 69.6f);
	}

}
