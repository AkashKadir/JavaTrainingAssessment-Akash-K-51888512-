package org.handson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("handson7Context.xml");
		User user = context.getBean(User.class,"user");
		user.display();
		((ClassPathXmlApplicationContext)context).close();

	}

}
