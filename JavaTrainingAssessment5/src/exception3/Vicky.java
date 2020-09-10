package exception3;

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
		
		for(int i=0;i<10;i++) {
			divide(ar[i],divisor);
		}	
	}
	
	static void divide(int a,int divisor) throws IllegalArgumentException {
		
		try {
			if((divisor%2==0)&&(a%2!=0)) {
				throw new IllegalArgumentException();
			}
			else if((divisor%2!=0)&&(a%2==0)) {
				throw new IllegalArgumentException();
			}
			else {
				System.out.println("Result : "+a/divisor);
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Exception handled by method");
			System.out.println("Result : "+a/divisor);
		}
		
	}
	
}
