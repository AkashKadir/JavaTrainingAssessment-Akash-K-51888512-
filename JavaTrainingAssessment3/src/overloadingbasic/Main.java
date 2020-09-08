package overloadingbasic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Stall st = new Stall();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the stall :");
		st.setName(sc.nextLine());
		System.out.println("Enter the detail of the stall :");
		st.setDetail(sc.nextLine());
		System.out.println("Enter the Owner name of the stall :");
		st.setOwnerName(sc.nextLine());
		System.out.println("Enter the Type of the stall :");
		String stall = sc.nextLine();
		System.out.println("Enter the size of the stall in square feet :");
		int sqrtFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have a TV : (y/n)");
		String y_n = sc.nextLine();
		if(y_n.equals("y")) {
			System.out.println("Enter the number of TV :");
			int noOfTV = sc.nextInt();
			System.out.println("The cost of the stall is : "+Stall.computeCost(stall,sqrtFeet,noOfTV));
		}
		else {
			System.out.println("The cost of the stall is : "+Stall.computeCost(stall,sqrtFeet));
		}
		
	}

}
