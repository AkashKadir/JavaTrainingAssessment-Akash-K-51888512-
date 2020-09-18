package com.arraylist4;

public class User {

	private String name;
	private String contactNumber;
	private String userName;
	private String email;
	
	public User(String name, String contactNumber, String userName, String email) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.email = email;
	}
	
	User(){};

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.printf("\n%-20s%-20s%-20s%-20s",name,contactNumber,userName,email) ;
	}
	
}
