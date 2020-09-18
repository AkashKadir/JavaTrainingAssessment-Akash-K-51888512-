package com.arraylist4;

import java.util.ArrayList;

public class UserBO extends ArrayList<User>{
		
	static UserBO userBO = new UserBO();
	
	void removeUser(int n1,int n2) {
		removeRange(n1, n2);
	}
	
	static UserBO getList() {
		
		userBO.add(new User("Akash","82822020","Ak_as","akash@gmail.com"));
		userBO.add(new User("Ara_vin","892101222","ara_d","aravind@gmail.com"));
		userBO.add(new User("Gotcha!","8933033333","tteddy","gotteddy@gmail.com"));
		return userBO;
		
	}
	
}
