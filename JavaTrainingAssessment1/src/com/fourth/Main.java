package com.fourth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Player pl = new Player();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details: ");
		String detail = sc.nextLine();
		
		String[] splittedString = detail.split(",");

		pl.setName(splittedString[0]);
		pl.setCountry(splittedString[1]);
		pl.setSkill(splittedString[2]);
			
		System.out.println("Player Details: "+"\n"+ "Player Name: "+pl.getName()+"\n"+"Country Name: "+pl.getCountry()+"\n"+"Skill: "+pl.getSkill());
		
	}

}
