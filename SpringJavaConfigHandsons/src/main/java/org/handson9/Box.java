package org.handson9;

import org.springframework.beans.factory.annotation.Autowired;


public class Box {

	private int length;
	private int width;
	private User user;

	public Box(int length, int width, User user) {
		super();
		this.length = length;
		this.width = width;
		this.user = user;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public User getUser() {
		return user;
	}

	@Autowired
	public void setUser(User user) {
		this.user = user;
	}

	Box() {
	}

	public void display() {
		System.out.println("The Hall of length " + length + " and width " + width + " is owned by " + user.getName());
	}

}
