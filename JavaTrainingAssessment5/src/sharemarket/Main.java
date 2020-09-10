package sharemarket;

import java.util.Scanner;

public class Main {
		
	static MutualFund[] mutAr = {new ICICI(),new Axis(),new HDFC()};
	static int[] intRate = {60,56,49};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<mutAr.length;i++) {
			
			mutAr[i].amount();
			double amt = sc.nextDouble();
			mutAr[i].duration();
			int dur = sc.nextInt();
			System.out.println(mutAr[i].getClass().getSimpleName()+" - "+"You will have returns as - "+ calculate(amt,dur,intRate[i])+"/- "+"In "+dur+" years");
			System.out.println();
		}		
	}

	private static double calculate(double amt,int dur,int interest) {

		double ret = 0 ;
		ret = (dur*amt*interest)*0.01;
		return ret;
		
	}

}
