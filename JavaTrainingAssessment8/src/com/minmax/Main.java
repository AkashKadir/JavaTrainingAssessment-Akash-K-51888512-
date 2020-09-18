package com.minmax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<TicketBooking> arr = new ArrayList<TicketBooking>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers :");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price):");
		
		for(int i=0;i<number;i++) {
			String detail = sc.nextLine(); 
			String[] split = detail.split(",");
			arr.add(new TicketBooking(split[0],Integer.parseInt(split[1])));
		}
		
		TicketBooking t1 = Collections.max(arr, new TicketBooking());
		TicketBooking t2 = Collections.min(arr, new TicketBooking());
		
		System.out.println(t1.getCustomerName()+" spends maximum amount of "+t1.getPrice());
		System.out.println(t2.getCustomerName()+" spends minimum amount of "+t2.getPrice());
		
		sc.close();		
	}

}
