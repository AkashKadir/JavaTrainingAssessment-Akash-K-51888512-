package com.listoflist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int WEEKS = 5;
	static int SHOWS = 4;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> subArr = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<>();
		System.out.println("Enter the count of booked tickets :");
		
		for(int i=1;i<=WEEKS;i++) {
			
			System.out.println("On Day "+i);
			String line = sc.nextLine();
			String[] split = line.split(",");
			for(int j=0;j<split.length;j++) {
				subArr.add(100-Integer.parseInt(split[j]));
			}
		}
		int from=0,to=4;
		for(int i=0;i<WEEKS;i++) {
			list.add(subArr.subList(from,to));
			from+=4;
			to+=4;
		}
		System.out.println(list);
		String decision = "y";
		while(decision.equals("y")) {
			System.out.println("Enter the day to know its remaining ticket count :");
			int dayOfWeek = sc.nextInt();
			sc.nextLine();
			System.out.println(list.get(dayOfWeek-1));
			System.out.println("Do you want to continue? (y/n) ");
			decision = sc.nextLine();
		}
		
	}

}
