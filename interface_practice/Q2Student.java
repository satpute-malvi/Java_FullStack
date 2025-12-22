package interface_practice;

public class Q2Student implements Q2Printable{
	
	int rollNo;
	String name;
	
	Q2Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Roll no: " + this.rollNo);
		
	}
	
	public static void main(String[] args) {
		Q2Student s = new Q2Student(47, "Malvi");
		s.printDetails();
	}
}
