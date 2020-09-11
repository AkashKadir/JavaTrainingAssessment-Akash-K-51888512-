package com.sixth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ExtraType ex = new ExtraType();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the extratype details: ");
		String extraType = sc.nextLine();
		String[] splitted = extraType.split("#");
		
		ex.setName(splitted[0]);
		ex.setRuns(Integer.parseInt(splitted[1]));
		
		System.out.println("ExtraType Details: "+"\n" + "Extra Type: " +ex.getName()+"\n"+ "Runs: " +ex.getRuns());
		
	}

}
