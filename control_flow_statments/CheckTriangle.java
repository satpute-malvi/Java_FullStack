package control_flow_statments;
import java.util.Scanner;

public class CheckTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side one:");
		int side1 = sc.nextInt();
		System.out.println();
		System.out.println("Enter side two:");
		int side2 = sc.nextInt();
		System.out.println();
		System.out.println("Enter side three:");
		int side3 = sc.nextInt();
		
		if (side1 == side2 && side2 == side3) {
			System.out.println("This is an equilateral triangle");
		}else if ((side1 == side2  && side3 != side1)|| (side2 == side3 && side2 != side1) || (side1 == side3 && side2 != side1 )) {
			System.out.println("This is an isosceles trinagle");
		}else if(side1 != side2 && side2 != side3 && side3 != side1){
			System.out.println("This is a Scalene Triangle");
		}
		
	}
}
