package org.handson3;

import java.util.ArrayList;

public class CourseList {

private ArrayList<Course> courseList=new ArrayList<Course>();
	
	public void Insert(Course course) {
		courseList.add(course);
	}
	
	public void dicount() {
		double minFee=courseList.get(0).getFee();
		double maxFee=courseList.get(0).getFee();
		String minFeeName=courseList.get(0).getName();
		String maxFeeName=courseList.get(0).getName();
		for(int i=1;i<courseList.size();i++) {
			if((double)courseList.get(i).getFee()<minFee) {
				minFee=(double)courseList.get(i).getFee();
				minFeeName=(String)courseList.get(i).getName();
			}
			if((double)courseList.get(i).getFee()>maxFee) {
				maxFee=(double)courseList.get(i).getFee();
				maxFeeName=(String)courseList.get(i).getName();
			}
		}
		minFee *= (0.05);
		maxFee *= (0.1);
		System.out.println("Discount "+maxFee+" for "+maxFeeName+" course");
		System.out.println("Discount "+minFee+" for "+minFeeName+" course");
	}
	
}
