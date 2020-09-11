package humpanddump4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		
		System.out.println("Word to replace :");
		String dump = sc.nextLine();
		
		System.out.println("Synonym :");
		String syn = sc.nextLine();
		
		hump = hump.replaceAll(dump, syn);
		
		System.out.println("Replaced String :"+hump);
		
	}

}
