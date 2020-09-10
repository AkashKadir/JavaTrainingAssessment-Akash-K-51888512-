package exception2;

import java.util.Scanner;

public class Vicky {

	public static void main(String[] args) {
		
		int[] ar = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 values :");
		
		for(int i=0;i<10;i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Enter divisor :");
		int divisor = sc.nextInt();
		
		try {
			for(int i=10;i>0;i--) {
				System.out.println("Result : "+i/divisor);				
			}
		}
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by "+ divisor);
			}
		}
		
	}

