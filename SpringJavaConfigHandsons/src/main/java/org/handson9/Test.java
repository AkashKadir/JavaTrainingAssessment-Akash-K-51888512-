package org.handson9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BoxConfig.class);
		Box box = context.getBean(Box.class,"box");
		box.display();
		((AnnotationConfigApplicationContext)context).close();

	}

}
