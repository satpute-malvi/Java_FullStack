package method_overloading_pratice;

/*
 9. Can you overload the main() method? Write a program to prove it.
 --> Yes we can over load the main() method.
 
 */

public class MainMethodOverload {

	// JVM entry point
    public static void main(String[] args) {
        System.out.println("Inside main(String[] args)");

        // Calling overloaded main methods explicitly
        main(10);
        main("Java");
        main(20, 30);
    }

    // Overloaded main with one int parameter
    public static void main(int a) {
        System.out.println("Inside main(int a): " + a);
    }

    // Overloaded main with one String parameter
    public static void main(String s) {
        System.out.println("Inside main(String s): " + s);
    }

    // Overloaded main with two int parameters
    public static void main(int a, int b) {
        System.out.println("Inside main(int a, int b): " + a + ", " + b);
    }

}
