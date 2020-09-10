package exception1;

import java.util.Scanner;

public class Vicky {

	public static void main(String[] args){
		
		int[] ar = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 values :");
		
		for(int i=0;i<10;i++) {
			ar[i] = sc.nextInt();
		}
		
		try {
		for(int i=10,j=0;i>=0;i--,j++) {
			System.out.println("Result : "+ar[j]/i);			
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Elements over");
		}

	}

}
