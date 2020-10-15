package org.handson4;

import java.util.ArrayList;

public class CourseList {

private ArrayList<Course> courseList=new ArrayList<Course>();
	
	public void Insert(Course course) {
		courseList.add(course);
	}
	
	public double Revenue() {
		double totalRevenue = 0;
		for(Course course : courseList) {
			totalRevenue+=(((double)course.getFee()*200)*(0.2));
		}
		return totalRevenue;
	}
	
}
