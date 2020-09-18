package com.arraylist4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		UserBO user = new UserBO();
		user.addAll(UserBO.getList());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of User details to be added :");
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<number;i++) {
			System.out.println("Enter the user "+(i+1)+" detail in csv format");
			String detail = sc.nextLine();
			String[] split = detail.split(",");
			user.add(new User(split[0],split[1],split[2],split[3]));
		}
		
		System.out.printf("%-20s%-20s%-20s%-20s\n","Name","ContactNumber","UserName","Email");
		
		for(int i=0;i<user.size();i++) {
			System.out.printf("%-20s%-20s%-20s%-20s\n",user.get(i).getName(),user.get(i).getContactNumber(),user.get(i).getUserName(),user.get(i).getEmail());
		}
		
		System.out.println("Enter the range to be removed from array List :");
		int from = sc.nextInt();
		int to = sc.nextInt();
		
		user.removeUser(from, to);
		
		System.out.printf("%-20s%-20s%-20s%-20s\n","Name","ContactNumber","UserName","Email");
		
		for(int i=0;i<user.size();i++) {
			System.out.printf("%-20s%-20s%-20s%-20s\n",user.get(i).getName(),user.get(i).getContactNumber(),user.get(i).getUserName(),user.get(i).getEmail());
		}

	}

}
