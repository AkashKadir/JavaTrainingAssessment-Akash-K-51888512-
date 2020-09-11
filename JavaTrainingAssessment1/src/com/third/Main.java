package com.third;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Delivery del = new Delivery();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the over");
		Long over = sc.nextLong();
		System.out.println("Enter the ball");
		Long ball = sc.nextLong();
		System.out.println("Enter the runs");
		Long runs = sc.nextLong();
		System.out.println("Enter the batsman name");
		sc.nextLine();
		String batsmanName = sc.nextLine();
		System.out.println("Enter the bowler name");
		String bowlerName = sc.nextLine();
		System.out.println("Enter the nonstriker name");
		String nonStrikerName = sc.nextLine();
		
		del.setBall(ball);
		del.setBatsman(batsmanName);
		del.setBowler(bowlerName);
		del.setNonStriker(nonStrikerName);
		del.setOver(over);
		del.setRuns(runs);
		
		del.displayDeliveryDetails();
		
	}

}
