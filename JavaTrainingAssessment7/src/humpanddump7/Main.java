package humpanddump7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		
		System.out.println("Humpty says :"+hump);
		
		System.out.println("What Dumpty want to insert and where?");
		String dump = sc.nextLine();
		
		System.out.println("Enter the position :");
		int pos = sc.nextInt();
		
		String temp = hump.substring(pos-2,hump.length());
		
		hump = hump.substring(0, pos-1);
		
		sb.append(hump);
		sb.append(dump);
		sb.append(temp);
		
		System.out.println("Humpty's new sentence :"+sb);

	}

}
