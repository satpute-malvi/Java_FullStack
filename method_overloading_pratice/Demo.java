package method_overloading_pratice;



public class Demo {
	
	/*
	 6.Create a class Demo and overload show() using:
	(int, String)
	(String, int)
	 */
		public void show(int a, String str) {
			System.out.println("show(int, String)");
			System.out.println("int: " + a);
			System.out.println("String: " + str);
		}
		
		public void show(String str, int a) {
			System.out.println("show(String, int)");
			System.out.println("String: " + str);
			System.out.println("int: " + a);
		}
		
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.show(78, "Hello");
		System.out.println("----------------");
		d.show("hii", 90);
	}

}
