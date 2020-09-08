package areaofshape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape :");
		System.out.println("1. Circle"+"\n"+"2. Rectangle"+"\n"+"3. Triangle");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: System.out.println("Enter the radius :");
				double rad = sc.nextDouble();
				Shape cir = new Circle(rad);
				cir.computeArea();
				System.out.format("Area of Circle :%.2f",cir.area);
				break;
				
		case 2: System.out.println("Enter the length and breadth :");
				double len = sc.nextDouble();
				double bre = sc.nextDouble();
				Shape rec = new Rectangle(len,bre);
				rec.computeArea();
				System.out.format("Area of Rectangle :%.2f",rec.area);
				break;
				
		case 3: System.out.println("Enter the base and height :");
				double base = sc.nextDouble();
				double hgt = sc.nextDouble();
				Shape tr = new Triangle(base,hgt);
				tr.computeArea();
				System.out.format("Area of Triangle :%.2f",tr.area);
				break;
				
		default: System.out.println("Invalid Choice");
		
		}

	}

}
