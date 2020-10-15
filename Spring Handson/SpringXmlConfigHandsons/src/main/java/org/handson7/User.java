package org.handson7;

public class User {
	
	private String name;
	private int age;
	private String city;
	private Order order;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	public User(String name, int age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.order = order;
	}
	
	User(){}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		System.out.println("Order Detail:");
		System.out.println("Item Name: "+order.getItemName());
		System.out.println("Item Price: "+order.getPrice());
	}
}
