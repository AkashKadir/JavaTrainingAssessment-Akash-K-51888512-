package com.second;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Player pl = new Player();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the player name:");
		String playerName = scan.nextLine();
		System.out.println("Enter the country name:");
		String countryName = scan.nextLine();
		System.out.println("Enter the skill:");
		String skill = scan.nextLine();
		
		pl.setCountry(countryName);
		pl.setName(playerName);
		pl.setSkill(skill);
		
		System.out.println("Player Details:" +"\n"+ "Player Name: "+pl.getName() +"\n" + "Country Name: "+pl.getCountry() +"\n" + "Skill: "+pl.getSkill());
		
	}

}
