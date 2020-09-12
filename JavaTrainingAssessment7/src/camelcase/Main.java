package camelcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the event name :");
		String event = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		int j=0;
		for(int i=0;i<event.length();i++) {
			
			if(event.charAt(i)==' ') {
				String s = event.substring(j,j+1).toUpperCase()+event.substring(j+1,i);
				sb.append(s);
				j=i+1;
			}
		}
		
		sb.append(event.substring(j,j+1).toUpperCase()+event.substring(j+1));
		
		System.out.println(sb);

	}

}
