package com.arraylist1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int i=1;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println("Enter the username "+i);
		String userName = sc.nextLine();
		arr.add(userName);
		System.out.println("Do yu want to continue ? (y/n)");
		String decision = sc.nextLine();
		i++;
		
		while(!(decision.equals("n"))) {
			System.out.println("Enter the username "+i);
			userName = sc.nextLine();
			arr.add(userName);
			System.out.println("Do yu want to continue ? (y/n)");
			decision = sc.nextLine();
			i++;
		}
		System.out.println("\nThe names entered are :");
		for(String user:arr) {
			System.out.println(user);
		}

	}

}
