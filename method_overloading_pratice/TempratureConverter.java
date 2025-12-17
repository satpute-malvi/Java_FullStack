package method_overloading_pratice;

/*
 13. Overload a method convert() to convert:
Celsius to Fahrenheit
Fahrenheit to Celsius

 */

public class TempratureConverter {
	
	static void convert(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    static void convert(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9.0;
        System.out.println("Celsius: " + celsius);
    }

    public static void main(String[] args) {
        convert(25.0);   
        convert(77); 
    }

}
