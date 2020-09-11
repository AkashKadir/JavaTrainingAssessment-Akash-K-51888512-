package com.eight;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] wickets =new String[11];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets: ");
		int number = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=number;i++) {
			
			System.out.println("Enter the details of wicket "+i);
			wickets[i-1]=sc.nextLine();
			
		}
		System.out.println("Wicket Details");
		
		for(int i=0;i<number;i++) {
			
			String[] splitted = wickets[i].split(",");
			
			Wicket wc = new Wicket(Long.parseLong(splitted[0]), Long.parseLong(splitted[1]),splitted[2],splitted[3],splitted[4]);
			
			System.out.println("Over: "+wc.getOver()+"\n"+"Ball: "+wc.getBall()+"\n"+"Wicket Type: "+wc.getWicketType()+"\n"+"Player Name: "
			+wc.getPlayerName()+"\n"+"Bowler Name: "+wc.getBowlerName());
			
		}
		
	}

}
