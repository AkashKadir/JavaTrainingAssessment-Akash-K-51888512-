package com.fifth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Venue ven = new Venue();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name:");
		String venue = sc.nextLine();
		System.out.println("Enter the city name:");
		String city = sc.nextLine();
		
		ven.setCity(city);
		ven.setName(venue);
		
		ven.venueDetail();
		ven.venueChoice();
		
		int choice;
		do {
			choice = sc.nextInt();
		switch(choice) {
		
		case 1: System.out.println("Enter the venue name: ");
				sc.nextLine();
				ven.setName(sc.nextLine());
				ven.venueDetail();
				ven.venueChoice();
				break;
				
		case 2: System.out.println("Enter the city name: ");
				sc.nextLine();
				ven.setCity(sc.nextLine());
				ven.venueDetail();
				ven.venueChoice();
				break;
				
		case 3: ven.venueDetail();
				break;
		
		}
		}while(choice!=3);
		
	}

}
