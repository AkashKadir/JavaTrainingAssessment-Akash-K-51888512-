package LandKProviders2;

public class Product {

	private int product_code;
	private String product_name;
	private double price;
	private int Stock;
	static String name;
	
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

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String checkPrice(Product pr1,Product pr2) {
		
		if(pr1.price==pr2.price) {
			return pr1.product_name + " and " + pr2.product_name + " are in same price";
		}
		
		else if(pr1.price>pr2.price) {
			return pr2.product_name + " is cheaper than " + pr1.product_name;
		}
		
		else {
			return pr1.product_name + " is cheaper than " + pr2.product_name;
		}
		
	}
	
	public double getDiscountedPrice(Product pr) {
		
		if(pr.price>=80000) {
			return pr.price*0.3;
		}
		else if(pr.price>=60000) {
			return pr.price*0.2;
		}
		else if(pr.price>=50000) {
			return pr.price*(0.1);
		}
		else if(pr.price<50000) {
			return pr.price*0.05;
		}
		else {
			return 0;
		}
		
	}
	
}
