package GrowWellCompany1;

import java.time.LocalDate;

public class Employee {

	private int employee_code;
	private String employee_Name;
	private LocalDate birth_date;
	private String dept_code;
	private String designation;
	private int Salary;
	
	

	public Employee(int employee_code, String employee_Name, LocalDate birth_date, String dept_code, String designation,
			int salary) {
		super();
		this.employee_code = employee_code;
		this.employee_Name = employee_Name;
		this.birth_date = birth_date;
		this.dept_code = dept_code;
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

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
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
	
}
