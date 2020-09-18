package com.sortinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<User>();
		System.out.println("Enter the number of user details :");
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the user "+i+" details :");
			String line = sc.nextLine();
			String[] split = line.split(",");
			list.add(new User(split[0],split[1],split[2],split[3]));
		}
		
		System.out.println("Sort By :");
		System.out.println("1. Name"+"\n"+"2. Email");
		int ch = sc.nextInt();
		
		switch(ch) {
				
		case 1:	Collections.sort(list,new NameComparator());
				break;
				
		case 2: Collections.sort(list,new EmailComparator());
				break;
				
		default: System.out.println("Invalid choice.");
				 System.exit(0);
		}
		
		System.out.format("%-15s %-15s %-15s %s\n","Name","Email","Username","Password");
		
		for(User user:list) {
			System.out.format("%-15s %-15s %-15s %s\n",user.getName(),user.getEmail(),user.getUsername(),user.getPassword());
		}
		
	}

}
