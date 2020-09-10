package introinterface;

import java.util.Scanner;

public class Main {
	
	static Stall s;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose stall type");
		System.out.println("1). Gold Stall"+"\n"+"2). Premium Stall"+"\n"+"3). Executive Stall");
		int ch = sc.nextInt();
		sc.nextLine();
		
		switch(ch) {
		
		case 1 : System.out.println("Enter Stall details in comma separated (Stall Name,Stall Cost,Owner Name,Number of TV sets)");
				 String stallDetails = sc.nextLine();
				 String[] split = stallDetails.split(",");
				 s = new GoldStall(split[0],Integer.parseInt(split[1]),split[2],Integer.parseInt(split[3]));
				 s.display();
				 break;
				 
		case 2 : System.out.println("Enter Stall details in comma separated (Stall Name,Stall Cost,Owner Name,Number of Projectors)");
		 		 String stallDetails1 = sc.nextLine();
		 		 String[] split1 = stallDetails1.split(",");
		 		 s = new PremiumStall(split1[0],Integer.parseInt(split1[1]),split1[2],Integer.parseInt(split1[3]));
		 		 s.display();
		 		 break;
		 		 
		case 3 : System.out.println("Enter Stall details in comma separated (Stall Name,Stall Cost,Owner Name,Number of Screens)");
		 		 String stallDetails2 = sc.nextLine();
		 		 String[] split2 = stallDetails2.split(",");
		 		 s = new ExecutiveStall(split2[0],Integer.parseInt(split2[1]),split2[2],Integer.parseInt(split2[3]));
		 		 s.display();
		 		 break;
			
		}		
			
	}

}
