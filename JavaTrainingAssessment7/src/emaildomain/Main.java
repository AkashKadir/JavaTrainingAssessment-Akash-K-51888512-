package emaildomain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email Address :");
		
		String email = sc.nextLine();
		
		char[] emailCh = email.toCharArray(); 
		int j=0;
		
		for(int i=0;i<emailCh.length;i++) {
			if(emailCh[i]=='@') {
				j=i;				
			}
		}
		email = email.substring(j+7);
		
		if((email.equals("com"))||(email.equals("in"))||(email.equals("net"))||(email.equals("org"))) {
			System.out.println("Valid email address.");
		}
		else {
			System.out.println("Invalid email address.");
		}
	}

}
