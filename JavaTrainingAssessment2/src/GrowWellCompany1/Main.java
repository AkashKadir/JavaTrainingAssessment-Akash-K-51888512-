package GrowWellCompany1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	static LocalDate birth_date1 = LocalDate.now();
	static int NOP =2;
	static Employee[] arrObj = new Employee[NOP];
	
	public static void main(String[] args) {
		
		
		checkBirthday(getEmpData());
		
	}
	
	static Employee[] getEmpData() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details As Comma Separated values :");
		
		for(int i=0;i<NOP;i++) {
			
			
			String s = sc.nextLine();
			String[] split =s.split(",");
			
			Employee emp = new Employee(Integer.parseInt(split[0]),split[1],LocalDate.parse(split[2]),split[3],split[4],Integer.parseInt(split[5]));
			
			arrObj[i]=emp;
			
		}
		return arrObj;
		
	}
	static void checkBirthday(Employee[] arr) {
		
		int count=0;
		Employee[] empPer = new Employee[6];
		for(int i=0,j=0;i<arr.length;i++) 
		{	
			if(((arr[i].getBirth_date().getMonth()).equals(birth_date1.getMonth()))&&((arr[i].getBirth_date().getDayOfMonth())==(birth_date1.getDayOfMonth()))) {
				empPer[j]=arr[i];
				j++;
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			
			System.out.println(Employee.wishBirthday(empPer[i]));
			
		}
		
	}
}
