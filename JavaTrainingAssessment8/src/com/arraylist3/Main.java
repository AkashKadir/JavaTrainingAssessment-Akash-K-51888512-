package com.arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<String>();
		
		System.out.println("Enter the number of halls:");
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<number;i++) {
			System.out.println("Enter the hall name "+(i+1));
			ar.add(sc.nextLine());
		}
		
		System.out.println("Enter the hall name to be searched :");
		String search = sc.nextLine();
		
		if(ar.contains(search)) {
			System.out.println(search + " is found in the list at position "+ar.indexOf(search));
		}
		else {
			System.out.println(search + " is not found.");
		}
		
	}

}
