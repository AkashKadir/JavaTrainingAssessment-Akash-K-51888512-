package org.handson2;

import java.util.ArrayList;

public class CourseList {
	
	private ArrayList<Course> courseList=new ArrayList<Course>();
	
	public void Insert(Course course) {
		courseList.add(course);
	}
	
	public ArrayList<String> noOfCourses(double budget){
		ArrayList<String> outputArray = new ArrayList<String>();
		for(Course courses : courseList) {
			if((double)courses.getFee()<=budget) {
				int total =(int) ((int) budget/courses.getFee());
				outputArray.add(courses.getName()+" - "+total);
			}
		}
		return outputArray;
	}
	
}
