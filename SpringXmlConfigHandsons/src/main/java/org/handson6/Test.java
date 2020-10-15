package org.handson6;

import org.handson6.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("handson6Context.xml");
		Course course1 = context.getBean("course1",Course.class);
		Course course2 = context.getBean("course2",Course.class);
		Course course3 = context.getBean("course3",Course.class);
		
		course1.display();
		course2.display();
		course3.display();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
