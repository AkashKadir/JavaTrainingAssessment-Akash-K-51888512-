package org.handson8;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) throws IOException {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp = context.getBean(Employee.class, "employee");
		emp.display();
		((AnnotationConfigApplicationContext)context).close();
	}
}
