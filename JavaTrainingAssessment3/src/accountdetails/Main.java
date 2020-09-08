package accountdetails;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account Detail :");
		String accDetail = sc.nextLine();
		FixedAccount fix = new AccountBO().getAccountDetail(accDetail);
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n",fix.getAccountNumber(),fix.getBalance(),fix.getAccountHolderName(),fix.getMinimunBalance(),fix.getLockingPeriod());
	}

}
