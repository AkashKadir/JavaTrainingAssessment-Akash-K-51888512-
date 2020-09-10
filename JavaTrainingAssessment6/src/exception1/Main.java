package exception1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days :");
		int cost = sc.nextInt();
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		
		try {
			cost = cost/n;
			System.out.println("Cost per day of the item is "+cost);
		}
		catch(ArithmeticException ar) {
			System.out.println(ar.toString());
		}
		

	}

}
