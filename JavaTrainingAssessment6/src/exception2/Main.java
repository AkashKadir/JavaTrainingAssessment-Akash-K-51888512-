package exception2;

import java.io.*;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		ItemType item = new ItemType();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
			System.out.println("Enter the name :");
			item.setName(br.readLine());
			System.out.println("Enter the deposit :");
			try {
				item.setDeposit(Double.parseDouble(br.readLine()));
				System.out.println("Enter the cost per day :");
				item.setCostPerDay(Double.parseDouble(br.readLine()));
				System.out.println("The details of the item type are :");
				System.out.println("Name :"+item.getName()+"\n"+"Deposit :"+item.getDeposit()+"\n"+"Cost Per Day :"+item.getCostPerDay());
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
			} 	

	}

}
