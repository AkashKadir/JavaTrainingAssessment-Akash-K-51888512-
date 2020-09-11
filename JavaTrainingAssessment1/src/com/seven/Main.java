package com.seven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over:");
		Long over = sc.nextLong();
		System.out.println("Enter the ball:");
		Long ball = sc.nextLong();
		System.out.println("Enter the runs:");
		Long runs = sc.nextLong();
		System.out.println("Enter the batsman name:");
		sc.nextLine();
		String batsmanName = sc.nextLine();
		System.out.println("Enter the bowler name:");
		String bowlerName = sc.nextLine();
		System.out.println("Enter the nonstriker name:");
		String nonStrikerName = sc.nextLine();
		
		Delivery del = new Delivery(over, ball, runs,batsmanName,bowlerName,nonStrikerName);
		
		System.out.println("Over: "+del.getOver()+"\n"+"Ball: "+del.getBall()+"\n"+"Runs: "+del.getRuns()+"\n"+"Batsman: "+del.getBatsman()
		+"\n"+"Bowler: "+del.getBowler()+"\n"+"NonStrikerr: "+del.getNonStriker());
		
	}

}
