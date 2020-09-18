package com.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static int i=1;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList();
		String decision = "y";
		while(!decision.equals("n")) {
			
			System.out.println("Enter the details of Item Type "+i);
			System.out.println("Name :");
			String name = sc.nextLine();
			System.out.println("Deposit :");
			double deposit = sc.nextDouble();
			System.out.println("Cost Per Day :");
			double cost = sc.nextDouble();
			sc.nextLine();
			ar.add(new ItemType(name,deposit,cost));
			System.out.println("Do you want to continue?(y/n)");
			decision = sc.nextLine();
			i++;
			
		}
		
		System.out.format("\n%-20s%-20s%-20s\n","Name","Deposit","CostPerDay");
		for(Object user:ar) {
			System.out.println(user.toString());
		}
		
	}

}
