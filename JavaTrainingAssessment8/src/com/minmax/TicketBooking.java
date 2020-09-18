package com.minmax;

import java.util.Comparator;

public class TicketBooking implements Comparator<Object>{
	
	private String customerName;
	private Integer price;
	
	public TicketBooking(String customerName, Integer price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	TicketBooking(){};
	
	@Override
	public int compare(Object a, Object b) {
		
		TicketBooking i1 = (TicketBooking)a;
		TicketBooking i2 = (TicketBooking)b;

		if(i1.price<i2.price) {
			return -1;
		}
		else if(i1.price>i2.price){
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
