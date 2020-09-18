package com.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Stall> list = new ArrayList<Stall>();
		System.out.println("Enter the number of stall details :");
		int number = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=number;i++) {
			System.out.println("Enter the stall "+i+" detail :");
			String detail = sc.nextLine();
			String[] split = detail.split(",");
			list.add(new Stall(split[0],split[1],split[2],split[3]));
		}
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			Stall one = (Stall) itr.next();
			if(one.getName().equals("test")) {
				itr.remove();
			}
		}
		
		System.out.format("%-15s %-20s %-15s %s\n","Name","Detail","Type","OwnerName") ;
		
		for(Stall stall : list) {
			System.out.format("%-15s %-20s %-15s %s\n",stall.getName(),stall.getDetail(),stall.getType(),stall.getOwnerName()) ;
		}
		
		sc.close();
	}

}
