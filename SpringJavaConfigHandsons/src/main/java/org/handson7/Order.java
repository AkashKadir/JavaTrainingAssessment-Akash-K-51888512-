package org.handson7;

public class Order {
	
	private String itemName;
	private double price;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Order(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	
	Order(){}
	
}
