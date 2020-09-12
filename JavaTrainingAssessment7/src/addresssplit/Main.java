package addresssplit;

import java.util.Scanner;

public class Main {
	
	static Address[] adr ;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users :");
		int no = sc.nextInt();
		adr = new Address[no];
		System.out.println("Enter user address details in CSV format(User ID,Street,City,State) :");
		sc.nextLine();
		
		for(int i=0;i<no;i++) {
			String s = sc.nextLine();
			String[] split = s.split(",");
			adr[i] = new Address(Integer.parseInt(split[0]),split[1],split[2],split[3]);
		}
		
		System.out.format("\n\n%-15s %-15s %-15s %s\n\n", "User ID","Street","City","State");
		
		for(int i=0;i<no;i++) {
			System.out.format("%-15s %-15s %-15s %s\n",adr[i].getUserId(),adr[i].getStreet(),adr[i].getCity(),adr[i].getState());
		}
		
	}

}
