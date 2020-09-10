package ayupharma;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class TestMedicine {
	
	static int NOP =5;
	
	public static void main(String[] str) {
		
		Medicine[] med1 = getDetails();
		
		for(int i=0;i<med1.length;i++) {
			System.out.println();
			med1[i].getDetails();
			med1[i].displayLabel();
		}
		
	}
	
	public static Medicine[] getDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Medicine details : (name,price,exp date)");
		Medicine medPrint;
		Medicine[] med = new Medicine[NOP];
		
		
		for(int i=0;i<NOP;i++) {
			
			int rand = new Random().nextInt(3);
			rand++;
			if(rand==1) {
				System.out.println("Enter Tablet Details :");
				String tab = sc.nextLine();
				String[] splitTab = tab.split(",");
				medPrint=new Tablet(splitTab[0],Double.parseDouble(splitTab[1]),LocalDate.parse(splitTab[2]));
				med[i]=medPrint;
				}
			else if(rand==2) {
				System.out.println("Enter Syrup Details :");
				String syr = sc.nextLine();
				String[] splitTab = syr.split(",");
				medPrint=new Syrup(splitTab[0],Double.parseDouble(splitTab[1]),LocalDate.parse(splitTab[2]));
				med[i]=medPrint;
			}
			else if(rand==3) {
				System.out.println("Enter Ointment Details :");
				String oint = sc.nextLine();
				String[] splitTab = oint.split(",");
				medPrint=new Ointment(splitTab[0],Double.parseDouble(splitTab[1]),LocalDate.parse(splitTab[2]));
				med[i]=medPrint;
			}
			
		}
		return med;
		
	}
	
}
