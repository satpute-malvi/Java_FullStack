package method_overloading_pratice;

public class Student {
	/*
	 7. Overload a constructor in a Student class to initialize:
		default values
		only id
		id and name
	 */

	int id;
	String name;
	
	public Student(){
		System.out.println("Student id: " + this.id);
		System.out.println("Student name: " + this.name);
	}
	
	
	public Student(int id){
		this.id = id;
		System.out.println("Student id: " + this.id);
		System.out.println("Student name: " + this.name);
	}
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Student id: " + this.id);
		System.out.println("Student name: " + this.name);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("------------------");
		Student s2 = new Student(102);
		System.out.println("-------------------");
		Student s3 = new Student(105, "Malvi");

	}

}
