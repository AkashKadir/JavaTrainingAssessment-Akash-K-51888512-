package LandKProviders3;
import java.util.Scanner;

public class Main {
	
	static int NOP = 5;

	public static void main(String[] args){
		
		Product[] prodArr = new Product[NOP];
		
		for(int j=0;j<NOP;j++)
		{
			Product p = buildProduct();
			prodArr[j]= p;
		}
		
		System.out.println("Product details: ");
		
		for(int j=0;j<NOP;j++) {
			
			System.out.println();
			System.out.println(Product.getName());
			System.out.println("Product Code: "+prodArr[j].getProduct_code());
			System.out.println("Name: "+prodArr[j].getProduct_name());
			System.out.println("Stock: "+prodArr[j].getStock());
			System.out.println("Price: "+prodArr[j].getPrice());
			System.out.println("Discounted Price: "+prodArr[j].getDiscountedPrice(prodArr[j]));
			
		}
		
		System.out.println();
		System.out.println(Product.checkPrice(prodArr));
		
		Product a = Product.checkLessStock(prodArr);
		System.out.println();
		System.out.println("The Product wih min stock: ");
		System.out.println();
		System.out.println(Product.getName());
		System.out.println("Name: "+a.getProduct_name()+"\n"+"Stock: "+a.getStock());
		
	}
	
	
	private static Product buildProduct() {
		
		Product p1 =new Product();
		Scanner sc = new Scanner(System.in);
		Product.setName("L & K Suppliers");
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
