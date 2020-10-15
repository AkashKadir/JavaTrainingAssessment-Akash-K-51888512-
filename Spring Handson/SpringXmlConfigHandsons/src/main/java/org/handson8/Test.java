package org.handson8;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("handson8Context.xml");
		Employee emp = context.getBean(Employee.class, "employee");
		emp.display();
		((ClassPathXmlApplicationContext)context).close();
	}
}
