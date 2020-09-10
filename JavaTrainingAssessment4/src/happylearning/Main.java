package happylearning;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		HLCollege eng1 =(HLCollege) getEngineeringDetails();
		HLCollege med2 = (HLCollege)getMedicalDetails();
		eng1.showCollegeInfo();
		((Engineering) eng1).showBranchDetails();
		System.out.println();
		med2.showCollegeInfo();
		((Medical) med2).showBranchDetails();
		((Medical) med2).getInternshipInfo();
		
	}

	static Engineering getEngineeringDetails() {
		Engineering eng = null;
		System.out.println("Enter Engineering College Details :"+"\n");
		System.out.println("Enter city of College :");
		String place = sc.nextLine();
		System.out.println("Enter Registration number :");
		String regNo = sc.nextLine();
		System.out.println("Enter college name :");
		String name = sc.nextLine();
		System.out.println("Enter trustees :");
		String trustee_names = sc.nextLine();
		System.out.println("Enter year of foundation :");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter building name :");
		String building_name = sc.nextLine();
		System.out.println("Enter number of branches :");
		int no_of_branches = sc.nextInt();
		sc.nextLine();
		eng = new Engineering(regNo,name,place,trustee_names,year,building_name,no_of_branches);
		return eng;
	}
	
	static Medical getMedicalDetails() {
		Medical med = null;
		System.out.println("\n Enter Medical College Details :"+"\n");
		System.out.println("Enter city of College :");
		String place = sc.nextLine();
		System.out.println("Enter Registration number :");
		String regNo = sc.nextLine();
		System.out.println("Enter college name :");
		String name = sc.nextLine();
		System.out.println("Enter trustees :");
		String trustee_names = sc.nextLine();
		System.out.println("Enter year of foundation :");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter building name :");
		String building_name = sc.nextLine();
		System.out.println("Enter number of branches :");
		int no_of_branches = sc.nextInt();
		sc.nextLine();
		System.out.println("College has hospital ?");
		String hasHosp = sc.nextLine();
		boolean has=false;
		
		if(hasHosp.equals("yes")) {
			has=true;
		}
		
		med = new Medical(regNo,name,place,trustee_names,year,building_name,no_of_branches,has);
		return med;
	}
	
}
