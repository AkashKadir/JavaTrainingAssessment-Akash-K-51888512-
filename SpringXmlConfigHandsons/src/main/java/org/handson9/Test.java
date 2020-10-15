package org.handson9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("handson9Context.xml");
		Box box = context.getBean(Box.class,"box");
		box.display();
		((ClassPathXmlApplicationContext)context).close();

	}

}
