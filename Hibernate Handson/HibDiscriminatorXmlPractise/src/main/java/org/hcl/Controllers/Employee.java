package org.hcl.Controllers;

public class Employee extends Company{

	private int exp;

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Employee(int id, String firstName, String lastName, String sapId, long bonus, double salary,int exp) {
		super(id, firstName, lastName, sapId, bonus, salary);
		this.exp = exp;
	}

	public 	Employee(){}
	
}
