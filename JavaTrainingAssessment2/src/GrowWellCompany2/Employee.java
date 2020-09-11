package GrowWellCompany2;

import java.time.LocalDate;

public class Employee {

	private int employee_code;
	private String employee_Name;
	private LocalDate birth_date;
	private Department deptObj;
	private String designation;
	private int Salary;
	
	public Employee() {}
	
	public Employee(int employee_code, String employee_Name, LocalDate birth_date,Department deptObj,String designation, int salary) {
		super();
		this.deptObj=deptObj;
		this.employee_code = employee_code;
		this.employee_Name = employee_Name;
		this.birth_date = birth_date;
		this.designation = designation;
		Salary = salary;
	}

	public int getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(int employee_code) {
		this.employee_code = employee_code;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public LocalDate getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}

	public Department getDeptObj() {
		return deptObj;
	}

	public void setDeptObj(Department deptObj) {
		this.deptObj = deptObj;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static String wishBirthday(Employee empPer) {
		
		return "HappyBirthday, "+ empPer.employee_Name;
		
	}
	
	public static int countPeople(Employee[] emp,String dept_Code) {
		
		int count=0;
		for(int i=0;i<emp.length;i++) {
		   
			if((emp[i].deptObj.getDept_code()).equals(dept_Code)) {
				
				count++;
				
			}	
		}
		return count;
		
	}
	
}
