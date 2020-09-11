package humpanddump10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Humpty's Sentence :");
		String hump = sc.nextLine();
		char[] charArray = hump.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLowerCase(charArray[i])) {
				System.out.println("String is not in uppercase");
				System.exit(0);
			}
						
		}
		System.out.println("String is in uppercase");
		
	}

}
