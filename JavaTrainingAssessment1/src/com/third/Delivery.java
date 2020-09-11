package com.third;

public class Delivery {
	
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	
	public void displayDeliveryDetails() {
		
		System.out.println("Delivery Details: " +"\n"+ "Over: " +over +"\n"+ "Ball: "+ball+"\n"+ "Runs: "+runs +"\n"+ "Batsman: "+batsman +"\n"+
		"Bowler: "+bowler+"\n"+"NonStriker: "+nonStriker);    
		
	}
	
}
