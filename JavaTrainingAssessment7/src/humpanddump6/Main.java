package humpanddump6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String say = sc.nextLine();
		System.out.println("Enter Dumpty says :"+say);
		
		System.out.println("What Humpty Want To Remove?");
		String hump = sc.nextLine();
		
		say = say.replaceAll(hump,"");
		
		System.out.println("Dumpty's New Sentense :"+say);
		
	}

}
