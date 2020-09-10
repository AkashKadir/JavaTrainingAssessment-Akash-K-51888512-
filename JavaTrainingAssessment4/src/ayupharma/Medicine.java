package ayupharma;

import java.time.LocalDate;

abstract public class Medicine {

	protected String name;
	protected double price;
	protected LocalDate expiryDate;
	
	Medicine(){};
	
	public Medicine(String name, double price, LocalDate expiryDate) {
		super();
		this.name = name;
		this.price = price;
		this.expiryDate =expiryDate;
	}

	protected void getDetails() {
		
		System.out.println("Medicine Details :");
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Expiry Date: "+expiryDate);
		
	}
	protected abstract void displayLabel();
	
}
