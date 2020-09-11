package humpanddump9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		
		hump = hump.toUpperCase();
		
		System.out.println("Converted String :"+hump);

	}

}
