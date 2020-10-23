package org.hcl.Controllers;


public class Company {
	
	private int Id;
	private String FirstName;
	private String LastName;
	private String SapId;
	public long getBonus() {
		return Bonus;
	}
	public void setBonus(long bonus) {
		Bonus = bonus;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	private long Bonus;
	private double Salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSapId() {
		return SapId;
	}
	public void setSapId(String sapId) {
		SapId = sapId;
	}
	
	public Company(int id, String firstName, String lastName, String sapId, long bonus, double salary) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		SapId = sapId;
		Bonus = bonus;
		Salary = salary;
	}
	public Company(){}
}
