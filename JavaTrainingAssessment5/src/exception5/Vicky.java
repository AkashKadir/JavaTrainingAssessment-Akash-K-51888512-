package exception5;

import java.util.Scanner;

public class Vicky {
	
	static int NOP = 10;
	
	public static void main(String[] args){

		int[] ar = new int[NOP];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any "+NOP+" values :");
		
		for(int i=0;i<NOP;i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Enter divisor :");
		int divisor = sc.nextInt();
		
		for(int i=0;i<NOP;i++) {
			if(ar[i]%divisor==0) {
				System.out.println("Best Combo :"+ar[i]+" "+divisor);				
			}
			else {
				try {
					throw new WrongComboException("Invalid Combo");
				} catch (WrongComboException e) {
					System.out.println("Invalid Combo "+ar[i]+" "+divisor);
				}
			}
		}

	}

}
