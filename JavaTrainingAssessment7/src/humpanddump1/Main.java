package humpanddump1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		System.out.println("Enter Dumpty's Sentence :");
		String dump = sc.nextLine();
		
		dump = hump+"."+dump;
		
		System.out.println("Concantenated String :"+dump);
		
	}

}
