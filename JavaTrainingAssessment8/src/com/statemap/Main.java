package com.statemap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> adr = new ArrayList<Address>();
		HashMap<String,ArrayList<Address>> map1 = new HashMap<String,ArrayList<Address>>();
		HashMap<String,HashMap<String,ArrayList<Address>>> map = new HashMap<String,HashMap<String,ArrayList<Address>>>();
		System.out.println("Enter the number of Address :");
		
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the user detail "+i+":");
			String line = sc.nextLine();
			String[] split = line.split(",");
			adr.add(new Address(split[0],split[1],split[2],split[3],Integer.parseInt(split[4])));
		}
		
		for(int i=0;i<adr.size();i++) {
			map1.put(adr.get(i).getCity(),adr);
		}
		for(int i=0;i<adr.size();i++) {
			map.put(adr.get(i).getState(),map1);
		}
		
		System.out.println("Enter the state to be searched :");
		String state = sc.nextLine();
		System.out.println("Enter the city to be searched :");
		String city = sc.nextLine();
		sc.close();
		System.out.format("\n%-15s %-15s %-15s %-15s %s\n","Line 1","Line 2","City","State","Pincode");
		
		int j;
		for(String a : map.keySet()) {
			if(a.equals(state)) {
				j=0;
				for(String b:map.get(a).keySet()) {
					if(b.equals(city)) {
						Address ad =map.get(a).get(b).get(j);
						System.out.format("\n%-15s %-15s %-15s %-15s %s\n",ad.getAddressLine1(),ad.getAddressLine2(),ad.getCity(),ad.getState(),ad.getPinCode());
						System.exit(0);
					}
					j++;
				}
			}
		}
		System.out.println("Searched name not found or Searched City not found");
	}

}
