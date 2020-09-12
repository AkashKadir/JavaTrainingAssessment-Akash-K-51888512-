package addressverify;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Address 1 : ");
		String add1 =sc.nextLine();
		
		System.out.println("Address 1 : ");
		String add2 =sc.nextLine();
		
		if(add1.equals(add2)) {
			System.out.println("RED");
		}
		
		else if(add1.equalsIgnoreCase(add2)) {
			System.out.println("BLUE");
		}
		
		else {
			
			String a = add1.toLowerCase();
			String b = add2.toLowerCase();
			String temp;
			int count=0;
			if(b.length()>a.length()) {
				temp=b;
				b=a;
				a=temp;
			}
			int j=0;
			for(int i=0;i<a.length();i++) {
				
				if(a.charAt(i)==b.charAt(j)) {
					j++;
				}
				else if(b.charAt(j)==' ') {
					j++;
					i--;
				}
				else if(a.charAt(i)!=' ') {
					System.out.println("GREEN");
					System.exit(0);
				}
			}
			System.out.println("YELLOW");		
		}
	}

}
