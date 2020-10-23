package org.hcl.controller;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="batsMan")
public class Batsman extends Person {
	
	private long totalRuns;
	private String type;
	public long getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(long totalRuns) {
		this.totalRuns = totalRuns;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Batsman(int personId, String firstName, String lastName, long totalRuns, String type) {
		super(personId, firstName, lastName);
		this.totalRuns = totalRuns;
		this.type = type;
	}
	
	public Batsman(){}
	
}
