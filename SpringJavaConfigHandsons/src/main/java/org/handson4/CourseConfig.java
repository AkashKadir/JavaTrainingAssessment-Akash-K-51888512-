package org.handson4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {

	@Bean("course1")
	public Course getCourse1() {
		Course course = new Course();
		course.setName("Java");
		course.setMentor("Sathish");
		course.setFee(1000);
		return course;
	}
	
	@Bean("course2")
	public Course getCourse2() {
		Course course = new Course();
		course.setName("Selenuim");
		course.setMentor("KaniMozhi");
		course.setFee(2000);
		return course;
	}
	
	@Bean("course3")
	public Course getCourse3() {
		Course course = new Course();
		course.setName("Pyhton");
		course.setMentor("Arun");
		course.setFee(500);
		return course;
	}
	
}
