package org.hcl.controller;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="bowler")
public class Bowler extends Person{
	
	public Bowler(int Id, String firstName, String lastName, String bowlingType, int wickets) {
		super(Id, firstName, lastName);
		this.bowlingType = bowlingType;
		this.wickets = wickets;
	}
	private String bowlingType;
	private int wickets;
	public String getBowlingType() {
		return bowlingType;
	}
	public void setBowlingType(String bowlingType) {
		this.bowlingType = bowlingType;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public Bowler(){}
	
}
