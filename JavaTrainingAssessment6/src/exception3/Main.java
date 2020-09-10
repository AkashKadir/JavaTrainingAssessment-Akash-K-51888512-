package exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer input :");
		int i;
		
		try {
			i = sc.nextInt();
			System.out.println("Entered value is "+i);
		}
		catch(InputMismatchException im) {
			System.out.println(im.toString());
		}

	}

}
