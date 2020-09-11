package LandKProviders2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Product p2 = buildProduct();
		Product p3 = buildProduct();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Product details: ");
		System.out.println();
		System.out.println(Product.getName());
		System.out.println("Product Code: "+p2.getProduct_code());
		System.out.println("Name: "+p2.getProduct_name());
		System.out.println("Stock: "+p2.getStock());
		System.out.println("Price: "+p2.getPrice());
		System.out.println("Discounted Price: "+p2.getDiscountedPrice(p2));
		System.out.println();
		
		System.out.println(Product.getName());	
		System.out.println("Product Code: "+p3.getProduct_code());
		System.out.println("Name: "+p3.getProduct_name());
		System.out.println("Stock: "+p3.getStock());
		System.out.println("Price: "+p3.getPrice());
		System.out.println("Discounted Price: "+p3.getDiscountedPrice(p3));
		System.out.println();
		System.out.println(p3.checkPrice(p2, p3));
	}

	private static Product buildProduct() {
		
		Product p1 = new Product();
		Scanner sc = new Scanner(System.in);
		
		Product.setName("L&K Suppliers");
		System.out.println("Enter Product Code: ");
		p1.setProduct_code(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Product Name: ");
		p1.setProduct_name(sc.nextLine());
		System.out.println("Enter Price: ");
		p1.setPrice(sc.nextDouble());
		System.out.println("Enter Stock: ");
		p1.setStock(sc.nextInt());
		System.out.println();
		
		return p1;
	}
}

