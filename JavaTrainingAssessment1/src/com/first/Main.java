package com.first;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Venue ven = new Venue();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name:");
		String venue = sc.nextLine();
		System.out.println("Enter the city name:");
		String city = sc.nextLine();
		
		ven.setName(venue);
		ven.setCity(city);
		
		System.out.println("Venue Details:" +"\n"+ "Venue Name: "+ven.getName() +"\n"+ "City Name: "+ven.getCity());
		
	}

}
