package com.reverse2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeMap<Integer,User> map = new TreeMap<Integer,User>();
		System.out.println("Enter the Number of details :");
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the user detail "+i+":");
			String line = sc.nextLine();
			String[] split = line.split(",");
			map.put(i, new User(split[0],split[1],split[2],split[3]));
		}
		
		ArrayList<User> arr = new ArrayList<User>(map.values());
		
		Collections.sort(arr);
		Collections.reverse(arr);
		
		sc.close();
		System.out.println("The user details in reverse order :");
		System.out.format("\n%-15s%-15s\n","Name","Mobilenumber");
		
		for(int i=0;i<number;i++) {
			System.out.println(arr.get(i).toString());
		}
		
	}

}
