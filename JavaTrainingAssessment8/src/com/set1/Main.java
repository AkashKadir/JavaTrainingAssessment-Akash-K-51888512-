package com.set1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		String decision = "y";
		
		while(!(decision.equals("n"))) {
			System.out.println("Enter the userName :");		
			String userName = sc.nextLine();
			System.out.println("Do you want to Continue?(y/n)");
			decision = sc.nextLine();
			set.add(userName);
		}
		
		System.out.println("The unique number of usernames is "+set.size());
		
	}

}
