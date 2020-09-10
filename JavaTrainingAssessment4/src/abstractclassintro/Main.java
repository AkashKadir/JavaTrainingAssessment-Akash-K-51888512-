package abstractclassintro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("List of Shapes :");
		System.out.println("1. Cirlce"+"\n"+"2. Rectangle"+"\n"+"3. Square");
		System.out.println("Enter your choice :");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: System.out.println("Enter the radius of Circle :");
				System.out.format("The perimeter is :%.2f",new Circle(sc.nextFloat()).calculatePerimeter());
				break;
				
		case 2: System.out.println("Enter the length of the rectangle :");
				float len = sc.nextFloat();
				System.out.println("Enter the breadth of the rectangle :");
				float bred = sc.nextFloat();
				System.out.format("The perimeter is :%.2f",new Rectangle(len,bred).calculatePerimeter());
				break;
		
		case 3: System.out.println("Enter the radius of Circle :");
				float side = sc.nextFloat();
				System.out.format("The perimeter is :%.2f",new Square(side).calculatePerimeter());
				break;
				
		default : System.out.println("Invalid Choice.");
				
		}

	}

}
