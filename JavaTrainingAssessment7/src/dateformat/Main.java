package dateformat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the date value :");
		
		String date = sc.nextLine();
		int count=0;
		
		for(int i =0 ;i<date.length();i++) {
			if(date.charAt(i)=='/') {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Date is correct");
			System.exit(0);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(date.substring(0,2));
		sb.append("/");
		sb.append(date.substring(3,5));
		sb.append("/");
		sb.append(date.substring(6));
		
		System.out.println("Date in correct format :" + sb);
		
		
	}

}
