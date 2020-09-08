package bankaccount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Choose Account type: "+"\n"+"1. Savings Account"+"\n"+"2. Current Account");
		int ch = sc.nextInt();
		sc.nextLine();
		
		switch(ch) {
		
		case 1: System.out.println("Enter Account details in comma separated (Account Name,Account Number,Bank Name,Organisation Name)");
				String accOrg = sc.nextLine();
				String[] split = accOrg.split(",");
				Account acc = new SavingsAccount(split[0],split[1],split[2],split[3]);
				acc.display();
				break;
				
		case 2: System.out.println("Enter Account details in comma separated (Account Name,Account Number,Bank Name,TIN Number)");
				String tin = sc.nextLine();
				String[] split1 = tin.split(",");
				Account acc1 = new CurrentAccount(split1[0],split1[1],split1[2],split1[3]);
				acc1.display();
				break;
		}
		
	}

}
