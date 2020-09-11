package com.fifth;

public class Venue {
	
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void venueDetail() {
		
		System.out.println("Venue details:"+"\n"+"Venue Name: "+name+"\n"+"City Name: "+city);
		
	}
	
	public void venueChoice() {
		
		System.out.println("Verify and Update Venue Details"+"\n"+"Menu"+"\n"+"1.Update Venue Name "+"\n"+"2.Update City Name "+
		"\n"+"3.All informations Correct/Exit \r\n" +"Type 1 or 2 or 3 ");
	
	}
	
}
