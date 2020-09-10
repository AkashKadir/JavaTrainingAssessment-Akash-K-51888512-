package overridingsimple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the event :");
		String name = sc.nextLine();
		System.out.println("Enter the detail of the event :");		
		String detail = sc.nextLine();
		System.out.println("Enter the ownername of the event :");
		String ownerName = sc.nextLine();
		System.out.println("Enter the type of the event :");
		System.out.println("1. Exhibition"+"\n"+"2. StageEvent");
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1: System.out.println("Enter the number of stalls :");
				int noOfStalls = sc.nextInt();
				System.out.println("The projected revenue of the event is "+new Exhibition(name,detail,ownerName,noOfStalls).projectedRevenue());
				break;
				
		case 2: System.out.println("Enter the number of the shows :");
				int shows = sc.nextInt();
				System.out.println("Enter the number of seats per show :");
				int seats = sc.nextInt();
				System.out.println("The projected revenue of the event is "+new StageEvent(name,detail,ownerName,shows,seats).projectedRevenue());
				break;
				
		default: System.out.println("Invalid choice");
		}
		
	}
	
}
