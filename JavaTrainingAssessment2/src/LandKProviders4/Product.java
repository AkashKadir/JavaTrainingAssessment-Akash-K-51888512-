package LandKProviders4;

public class Product {

	private int product_code;
	private int Stock;
	private String product_name;
	private static String name;
	private double Price;
	private static int size;
	
	public static int getSize() {
		return size;
	}
	public static void setSize(int size) {
		Product.size = size;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Product.name = name;
	}
	
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	public static String checkPrice(Product[] ar) {
		
		double max = ar[0].Price;
		int j=0;
		
		for(int i= 1 ;i<size;i++)
		{
			if(ar[i]!=null) {
				if(ar[i].Price>max) {
				max=ar[i].Price;
				j=i;
				}
			}
		}
		
		return ar[j].product_name+" is costlier";
		
	}
	
	public static double getDiscountedPrice(Product pr) {
		
		if(pr.Price>=80000) {
			return pr.Price*0.3;
		}
		else if(pr.Price>=60000) {
			return pr.Price*0.2;
		}
		else if(pr.Price>=50000) {
			return pr.Price*0.1;
		}
		else if(pr.Price<50000) {
			return pr.Price*0.05;
		}
		else {
			return 0;
		}
		
	}
	
	public static Product checkLessStock(Product[] arr) {
		
		Product p = new Product();
		double min = 999999;
		for(int i = 0; i< size; i++)
		{
			if((arr[i]!=null)&&(arr[i].Stock < min))
			{
				p = arr[i];
				min = p.Stock;
			}
		}
		return p;
		
	}
	
}
