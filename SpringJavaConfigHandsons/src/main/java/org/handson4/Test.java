package org.handson4;

import org.handson4.Course;
import org.handson4.CourseList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);
		Course course1 = context.getBean("course1",Course.class);
		Course course2 = context.getBean("course2",Course.class);
		Course course3 = context.getBean("course3",Course.class);
		CourseList courses = new CourseList();
		
		courses.Insert(course1);
		courses.Insert(course2);
		courses.Insert(course3);
		
		System.out.println("Total Revenue: "+courses.Revenue());
		
		((AnnotationConfigApplicationContext)context).close();
		
	}

}
