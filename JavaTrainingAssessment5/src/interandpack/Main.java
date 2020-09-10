package interandpack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle :");
		Polygon pol1 = new Rectangle(sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter side value :");
		Polygon pol2 = new Square(sc.nextDouble());
		System.out.println("Perimeter of Rectangle is :"+pol1.calcPeri()+"\n"+"Area of Rectangle :"+pol1.calArea());
		System.out.println("Perimeter of Square is :"+pol2.calcPeri()+"\n"+"Area of Square :"+pol2.calArea());

	}

}
