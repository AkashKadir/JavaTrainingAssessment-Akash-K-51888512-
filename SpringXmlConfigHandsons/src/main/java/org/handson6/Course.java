package org.handson6;

public class Course {
	
	private String name;
	private String mentor;
	private double fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Course(String name, String mentor, double fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
	
	Course(){}
	
	public void display() {
		System.out.println("Course: "+name);
		System.out.println("SME by "+mentor);
		System.out.println("Fee "+fee);
	}
	
}
