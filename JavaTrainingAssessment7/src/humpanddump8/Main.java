package humpanddump8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		
		System.out.println("Enter Dumpty's Sentence :");
		String dump = sc.nextLine();
		
		if(hump.length()==dump.length()) {
			System.out.println("Both have used equal number of words");
		}
		else if(hump.length()>dump.length()) {
			System.out.println("Humpty has used more words");
		}
		else {
			System.out.println("Dumpty has used more words");
		}
		
	}

}
