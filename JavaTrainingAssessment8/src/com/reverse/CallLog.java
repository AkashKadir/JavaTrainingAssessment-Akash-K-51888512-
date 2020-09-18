package com.reverse;

public class CallLog{
	
	private String name;
	private long dialledNumber;
	private int duration;
	private String dialledDate;
	
	public CallLog(String name, long dialledNumber, int duration, String dialledDate) {
		super();
		this.name = name;
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}
	
	CallLog(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDialledNumber() {
		return dialledNumber;
	}

	public void setDialledNumber(long dialledNumber) {
		this.dialledNumber = dialledNumber;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDialledDate() {
		return dialledDate;
	}

	public void setDialledDate(String dialledDate) {
		this.dialledDate = dialledDate;
	}
	
}
