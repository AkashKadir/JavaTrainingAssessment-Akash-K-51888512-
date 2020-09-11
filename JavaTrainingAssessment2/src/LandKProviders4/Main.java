package LandKProviders4;

import java.util.Scanner;

public class Main {
	
	static int NOP = 5;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Product[] prodArr = new Product[NOP];
		Product p1 = new Product();
		int ch;
		int subNOP = NOP;
		int j=0; 
		
		do {
			
			menu();
			System.out.println("Enter the choice:");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
				
				if(subNOP!=0) {
				
				System.out.println("Enter the number of products to be added("+subNOP+" or less than "+subNOP+"):");
				int numProd = sc.nextInt();
				
				int i; 
				if((numProd>0)&&(numProd<=subNOP)) {
					
					for(i = j; i<numProd+j;i++) {
						
						Product p = buildProduct(); 
						prodArr[i]=p;
				
					}
					j+=numProd;
					Product.setSize(j);
					subNOP-=numProd;
				}
				else
				{
					System.out.println("You entered a wrong number");
				}
				
				}
				else {
				
					System.out.println("You can't add your product. The limit of the product is "+NOP);
					
				}
				break;
					
			case 2: System.out.println("Product details: ");
					for(int i=0;i<j;i++) {
						
						System.out.println(Product.getName());
						System.out.println("Name: "+prodArr[i].getProduct_name());
						System.out.println("Stock: "+prodArr[i].getStock());
						
					}
					System.out.println();
					break;
					
			case 3: System.out.println("Discounted Price Of Products");
					System.out.println("Product Name"+"\t"+"Discounted Price");
					for(int i=0;i<j;i++) {
						
						System.out.println(prodArr[i].getProduct_name()+"\t\t"+p1.getDiscountedPrice(prodArr[i]));
						
					}
					break;
					
			case 4: System.out.println(Product.checkPrice(prodArr));
					break;
					
			case 5: System.out.println("The product With Min Stock :");
					Product a = Product.checkLessStock(prodArr);
					System.out.println(Product.getName());
					System.out.println("Name: "+a.getProduct_name());
					System.out.println("Stock: "+a.getStock());
					break;
					
			case 6: break;
			
			default: System.out.println("You entered a wrong choice!");
			}
			
		}while(ch!=6);
	}
	
	private static void menu() {
		
		System.out.println("Menu");
		System.out.println("1. Add Products"+"\n"+"2. Display Products"+"\n"+"3. Get Discounted Price "+"\n"+"4. Find Costly Product"+"\n"+"5. Check Min Stock"
							+"\n"+"6. Exit");
		
	}
	
	private static Product buildProduct(){
		
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
