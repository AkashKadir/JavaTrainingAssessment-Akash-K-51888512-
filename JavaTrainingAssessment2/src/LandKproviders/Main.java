package LandKproviders;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Product Code: ");
		p1.setProduct_code(sc.nextInt());
		System.out.print("Name: ");
		sc.nextLine();
		p1.setProduct_name(sc.nextLine());
		System.out.print("Price: ");
		p1.setPrice(sc.nextDouble());
		System.out.print("Stock: ");
		p1.setStock(sc.nextInt());
		System.out.println();
		
		System.out.print("Product Code: ");
		p2.setProduct_code(sc.nextInt());
		System.out.print("Name: ");
		sc.nextLine();
		p2.setProduct_name(sc.nextLine());
		System.out.print("Price: ");
		p2.setPrice(sc.nextDouble());
		System.out.print("Stock: ");
		p2.setStock(sc.nextInt());
		System.out.println();
		
		System.out.println("Product Details: ");
		
		System.out.println("Product code: "+p1.getProduct_code()+"\n"+"Name: "+p1.getProduct_name()+"\n"+"Price: "+p1.getPrice()+"\n"+"Stock: "+p1.getStock());
		System.out.println();
		System.out.println("Product code: "+p2.getProduct_code()+"\n"+"Name: "+p2.getProduct_name()+"\n"+"Price: "+p2.getPrice()+"\n"+"Stock: "+p2.getStock());

		p1.checkPrice(p1,p2);
		
	}
}
