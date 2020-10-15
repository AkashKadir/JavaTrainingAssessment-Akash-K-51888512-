package org.handson8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean("employee")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmployeeName("Sathish");
		emp.setEmployeeMobileNumber("9566259957");
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
