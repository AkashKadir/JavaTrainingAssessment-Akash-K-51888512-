package humpanddump3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		
		sb.append(hump);
		
		System.out.println("Dumpty says, "+sb.reverse());

	}

}
