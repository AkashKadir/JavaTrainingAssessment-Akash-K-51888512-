package com.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<User> array = new ArrayList<User>();
		System.out.println("Enter the Number of details :");
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the user "+i+" detail :");
			String line = sc.nextLine();
			String[] split = line.split(",");
			array.add(new User(split[0],split[1],split[2],split[3]));
		}
		
		System.out.println("Search by :");		
		System.out.println("1. Name"+"\n"+"2. Email");
		int ch = sc.nextInt();
		sc.nextLine();
		
		switch(ch) {
		
		case 1: System.out.println("Enter the name :");
				String name = sc.nextLine();
				Collections.sort(array);
				int i= Collections.binarySearch(array,new User(name,null,null,null),null);
				if(i<0){
					System.out.println("Searched name not found.");
				}
				else{
					System.out.format("\n%-15s %-15s %-15s %s\n","Name","Email","Username","Password");
					System.out.format("%-15s %-15s %-15s %s\n",array.get(i).getName(),array.get(i).getEmail(),array.get(i).getUsername(),array.get(i).getPassword());
				}
				break;
				
		case 2: System.out.println("Enter the email :");
				String email = sc.nextLine();
				Collections.sort(array,new EmailComparator());
				int i1= Collections.binarySearch(array,new User(null,email,null,null),new EmailComparator());
				if(i1<0){
					System.out.println("Searched email not found.");
				}
				else{
					System.out.format("\n%-15s %-15s %-15s %s\n","Name","Email","Username","Password");
					System.out.format("%-15s %-15s %-15s %s\n",array.get(i1).getName(),array.get(i1).getEmail(),array.get(i1).getUsername(),array.get(i1).getPassword());
				}
				break;
				
		default: System.out.println("Invalid Choice");
				 break;
		
		}
		sc.close();
	}

}
