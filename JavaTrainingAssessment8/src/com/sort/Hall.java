package com.sort;

import java.util.Comparator;

public class Hall implements Comparable<Hall>{
	
	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	
	Hall(){};
	
	@Override
	public String toString() {
		
		String line = String.format("%-15s%-15s%-15s%-15s\n",name,contactNumber,costPerDay,ownerName);
		return line;
		
	}
	
	@Override
	public int compareTo(Hall o) {
		if(this.getCostPerDay()>o.getCostPerDay()) {
			return 1;
		}
		else if(this.getCostPerDay()<o.getCostPerDay()){
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
