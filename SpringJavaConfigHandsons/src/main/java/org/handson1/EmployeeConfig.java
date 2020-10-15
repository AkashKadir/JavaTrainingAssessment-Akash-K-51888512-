package org.handson1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean("employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		ArrayList<String> empMobileNumber = new ArrayList<String>();
		empMobileNumber.add("9566259957");
		empMobileNumber.add("9566259958");
		empMobileNumber.add("9566259959");
		emp.setEmployeeName("Sathish");
		emp.setEmployeeMobileumber(empMobileNumber);
		emp.setEmployeeSalary(45000);
		emp.setEmployeeEmail("me@gmail.com");
		return emp;
	}
	
	@Bean("address")
	public Address getAddress() {
		Address address = new Address();
		address.setLine1("2/115 Anna Nagar");
		address.setLine2("Kaveripattinam");
		address.setCity("Krishnagiri");
		address.setPincode("635112");
		return address;
	}
	
}
