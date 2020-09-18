package com.comp;

public class Address implements Comparable<Address>{
	
	private String username;
	private String addressLine1;
	private String addressLine2;
	private Integer pinCode;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	

	public Address(String username, String addressLine1, String addressLine2, int pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	
	Address(){};

	@Override
	public int compareTo(Address o) {
		
		if(this.getPinCode()>o.getPinCode()) {
			return 1;
		}
		else if(this.getPinCode()<o.getPinCode()) {
			return -1;
		}
		else {
			return this.getAddressLine1().compareTo(o.getAddressLine1());
		}
		
	}
}
