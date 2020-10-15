package org.handson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("handson2Context.xml");
		Course course1 = context.getBean("course1",Course.class);
		Course course2 = context.getBean("course2",Course.class);
		Course course3 = context.getBean("course3",Course.class);
		CourseList courses = new CourseList();
		
		courses.Insert(course1);
		courses.Insert(course2);
		courses.Insert(course3);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Budget:");
		double budget = Double.parseDouble(br.readLine());
		ArrayList<String> outputArray = new ArrayList<String>();
		outputArray = courses.noOfCourses(budget);
		if(!outputArray.isEmpty()) {
			for(String outputStrings:outputArray) {
				System.out.println(outputStrings);
			}
		}
		else {
			System.out.println("No course available.");
		}
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
