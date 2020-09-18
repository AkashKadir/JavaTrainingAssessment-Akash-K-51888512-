package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Hall> arr = new ArrayList<Hall>();
		System.out.println("Enter the number of halls :");		
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the details of hall "+i);
			String detail = sc.nextLine();
			String[] split = detail.split(",");
			arr.add(new Hall(split[0],split[1],Double.parseDouble(split[2]),split[3]));
		}
		Collections.sort(arr);
		System.out.format("\n%-15s%-15s%-15s%-15s\n\n","Name","ContactNumber","CostPerDay","OwnerName");
		for(Hall hall : arr) {
			System.out.println(hall.toString());
		}
		sc.close();
	}

}
