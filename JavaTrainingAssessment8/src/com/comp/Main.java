package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> ad = new ArrayList<Address>();
		System.out.println("Enter the number of users :");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user address in CV (Username,AddressLine 1,AddressLine 2,PinCode) :");
		
		for(int i=0;i<number;i++) {
			String line = sc.nextLine();
			String[] split = line.split(",");
			ad.add(new Address(split[0],split[1],split[2],Integer.parseInt(split[3])));
		}
		
		Collections.sort(ad);
		System.out.println("User Details :");
		for(Address detail : ad) {
			System.out.println(detail.getUsername()+","+detail.getAddressLine1()+","+detail.getAddressLine2()+","+detail.getPinCode());
		}
		
	}

}
