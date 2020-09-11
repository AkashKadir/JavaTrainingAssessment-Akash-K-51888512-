package humpanddump2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		
		System.out.println("Enter Dumpty's Sentence :");
		String dump = sc.nextLine();
		
		int len = dump.length();
		
		for(int i=len,j=0;i<hump.length();i++,j++) {
			String str = hump.substring(j,i);
			if(str.equals(dump)) {
				System.out.println("Found");
				System.exit(0);
			}
		}
				
		System.out.println("Not found");

	}

}
