package LandKproviders;

public class Product {

	private int product_code;
	private String product_name;
	private double Price;
	private int Stock;
	
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
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	
	public void checkPrice(Product pr1, Product pr2) {
		
		if(pr1.Price==pr2.Price) {
			System.out.println(pr1.product_name + " and " + pr2.product_name + " are in same price");
		}
		
		else if(pr1.Price>pr2.Price) {
			System.out.println(pr2.product_name + " is cheaper than " + pr1.product_name);
		}
		
		else {
			System.out.println(pr1.product_name + " is cheaper than " + pr2.product_name);
		}
		
	}
	
}
