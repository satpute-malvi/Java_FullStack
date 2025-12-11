package inhritance_types_pratice;

/*
 10.Create classes X → Y → Z.
Z contains method display() that prints variable from all three classes.
 */

public class Ex10Z extends Ex10Y{
	
	public long adharNo;
	
	public void display(Ex10Z z) {
		
		z.age = 22;
		z.name = "Malvi";
		z.city = "CS";
		z.mobileNo = 58768767890L;
		z.adharNo = 34567823409876L;
		
		System.out.println("Age = " + z.age);
		System.out.println("Name = " + z.name);
		System.out.println("City = " + z.city);
		System.out.println("Mobile no. = " + z.mobileNo);
		System.out.println("Adhar no = " + z.adharNo);
		
		
	}

	public static void main(String[] args) {
		
		Ex10Z z = new Ex10Z();
		
		z.display(z);
		

	}

}
