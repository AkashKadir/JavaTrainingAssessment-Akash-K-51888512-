package builderstring;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	static Item[] it;
	static String s1;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter the number of items :");
		
		int no =sc.nextInt();
		it = new Item[no];
		sc.nextLine();
		
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability) :");
		
		for(int i=0;i<no;i++) {
			String s = sc.nextLine();
			String[] split = s.split(Pattern.quote("$"));
			it[i] = new Item(split[0],split[1],Integer.parseInt(split[2]),Integer.parseInt(split[3]));
		}
		
		System.out.println("Items :");
		System.out.println();
		
		for(int i=0;i<no;i++) {
			
			if(it[i].getAvailableQuantity()>0) {
				s1 = "Available";
			}
			else {
				s1="Not Available";
			}
	
			sb.append(it[i].getName());
			sb.append(",");
			sb.append(it[i].getType());
			sb.append(",");
			sb.append(it[i].getCost());
			sb.append(",");
			sb.append(s1);
						
			System.out.println(sb);
			
			sb.delete(0, sb.length());
			System.out.println(sb);
			
		}

	}

}
