package org.handson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("handson1Context.xml");
		Employee emp = context.getBean(Employee.class, "employee");
		emp.display();
		((ClassPathXmlApplicationContext)context).close();
	}

}
