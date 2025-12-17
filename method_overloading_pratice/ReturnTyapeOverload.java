package method_overloading_pratice;

/*
 14. Write a program to show that return type alone cannot overload a method.

 */

public class ReturnTyapeOverload {
	

	    static int add(int a, int b) {
	        return a + b;
	    }

//	    // NOT ALLOWED 
//	    static double add(int a, int b) {
//	        return a + b;
//	    }

	    public static void main(String[] args) {
	        System.out.println(add(10, 20));
	    }

}
