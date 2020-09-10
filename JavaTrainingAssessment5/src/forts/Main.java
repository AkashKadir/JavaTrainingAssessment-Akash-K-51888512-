package forts;

import java.util.Scanner;

public class Main {
		
	static String str[]= {"Rajmachi","Shivgadh","Murud"};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What you want to visit ?");
		
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
		}
		
		String choice = sc.nextLine();
		
		int j = search(choice);
		
		System.out.println("You are going to visit "+choice);
		
		
		
		switch(j) {
		
		case 1: 	new Rajmachi().distance();
					break;
		
		case 2: 	new Shivgadh().distance();
					break;
						 
		case 3: 	new Murud().distance();
					break;
						 
		default: System.out.println("Enter correct i/p");
		
		}
	}
	
	static int search(String choice) {
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].equals(choice)) {
				return i+1;
			}
			
		}
		
		return 0;
	}
	
}